package runners;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;

import io.cucumber.testng.CucumberOptions;
import utils.ConfigReader;
import utils.LogHelper;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", // Path to feature files
		glue = { "stepDefinitions", "hooks" }, // Path to step definitions package
		plugin = { "pretty", "html:target/cucumber-reports.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, // For reporting
		monochrome = true // For better console output
		, tags = "@graph")
public class TestRunner extends AbstractTestNGCucumberTests {
//	Important! Uncomment below for CrossBrowser & Parallel Testing
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

	@BeforeClass
	@Parameters({ "browser" })
	public void setUp(@Optional String browser) throws Throwable {
		LogHelper.info("Browser value from Testng Xml file:" + browser);
		if (browser != null) {
			ConfigReader.setBrowser(browser);
			LogHelper.info("Config Reader browser value: " + ConfigReader.getBrowser());
		}

	}
}
