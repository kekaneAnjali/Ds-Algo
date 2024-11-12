package driver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

public class DriverManager {

	private static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

	public WebDriver SetupDriver() {

		String browser = ConfigReader.getBrowser();
		long pageLoadTimeout = Long.parseLong(ConfigReader.getPageLoadTimeout()); 
		WebDriver driver;
		
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "safari":
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;

		default:
			throw new RuntimeException("Browser not supported: " + browser);
		}
		threadLocalDriver.set(driver);
		getdriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTimeout));
		getdriver().manage().window().maximize();
		return driver;
	}

	public static WebDriver getdriver() {
		return threadLocalDriver.get();
	}

	public void tearDown() {
		getdriver().close();
	}

}