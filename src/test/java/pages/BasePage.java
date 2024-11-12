package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import driver.DriverManager;

public class BasePage {
	
	public WebDriver driver;
	
	public BasePage() {
		this.driver = DriverManager.getdriver();
		PageFactory.initElements(driver, this);
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public void navigateToPage(String url) {
		driver.get(url);
	}

}
