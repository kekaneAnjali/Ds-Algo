package hooks;

import java.io.ByteArrayInputStream;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import driver.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utils.ConfigReader;
import utils.LogHelper;
import utils.WebDriverWaitUtility;

public class Hooks {
	private TestContext testContext;

	public Hooks(TestContext testContext) {
		this.testContext = testContext;
	}

	@Before
	public void setUp(Scenario scenario) {
		LogHelper.info("Initializing WebDriver...");
		String browser = ConfigReader.getBrowser();
		LogHelper.info("broswer value from Config Reader: "+browser);
		testContext.setDriver(browser);
		WebDriver driver = testContext.getdriver();
		LogHelper.info("WebDriver initialized successfully for: " + scenario.getName());
		WebDriverWaitUtility.initializeWait(driver, ConfigReader.getWebDriverWaitTimeout());
		LogHelper.info("Test started on Thread: " + Thread.currentThread().getId());
	}

	@AfterStep
	public void captureFailureDetails(Scenario scenario) {
		if (scenario.isFailed()) {
			LogHelper.error("Scenario failed: " + scenario.getName());
			try {
				byte[] screenshotBytes = ((TakesScreenshot) testContext.getdriver()).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshotBytes, "image/png", "Captured Screenshot");
				ByteArrayInputStream screenshotStream = new ByteArrayInputStream(screenshotBytes);
				Allure.addAttachment("Failure Screenshot", screenshotStream);
				LogHelper.info("Screenshot captured for failed scenario: " + scenario.getName());
			} catch (Exception e) {
				LogHelper.error("Failed to capture screenshot: " + e.getMessage());
			}
		}
	}

	@After
	public void tearDown() {
		LogHelper.info("Tearing down WebDriver...");
		testContext.quitDriver();
		LogHelper.info("Tear down WebDriver successful");
	}
}
