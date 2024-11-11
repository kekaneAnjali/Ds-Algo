package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.WebDriverWaitUtility;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(text(),' Register ')]")
	private WebElement registerlink;

	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	private WebElement signinlink;

	public void clickRegister() {
		WebDriverWaitUtility.waitForElementToBeClickable(registerlink).click();
		// registerlink.click();
	}

}
