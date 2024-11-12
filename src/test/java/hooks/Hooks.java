package hooks;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utils.ConfigReader;
import utils.LogHelper;
import utils.WebDriverWaitUtility;

public class Hooks {
	private  WebDriver driver;
	DriverManager driverManager = new DriverManager();;
	static Scenario scenario;

	@Before
	public void initializeDriver(Scenario scenario) throws Throwable {
		LogHelper.info("Initializing WebDriver...");
		driver = driverManager.SetupDriver();
		LogHelper.info("WebDriver initialized successfully.");
		
		WebDriverWaitUtility.initializeWait(driver, ConfigReader.getWebDriverWaitTimeout());
		Hooks.scenario = scenario;
		LogHelper.info("Starting scenario: " + scenario.getName());
	}

	
	@AfterStep
	public void captureFailureDetails(Scenario scenario) {
		if (scenario.isFailed()) {
			LogHelper.error("Scenario failed: " + scenario.getName());
			try {
				byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
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
	public void tearDownDriver() {

		LogHelper.info("Tearing down WebDriver...");
		if (driverManager != null) {
			driverManager.tearDown();
			LogHelper.info("WebDriver torn down successfully.");
		}
	}
}