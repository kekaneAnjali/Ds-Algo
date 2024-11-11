package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver.TestContext;
import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginSteps {


	TestContext testContext;
	WebDriver driver;

	LoginPage loginPage;
	
	public LoginSteps(TestContext testContext) {
		this.testContext = testContext;
		this.driver = testContext.getdriver();
		this.loginPage = testContext.getLoginPage();
	}

	@Given("The user is logged in with username {string} and password {string}")
	public void the_user_is_logged_in_with_username_and_password(String username, String password) {		
		loginPage.navigateToPage(ConfigReader.getLoginUrl());
		loginPage.login(username, password);
//		Assert.assertTrue(homePage.isSignOutLinkVisible());
	}
}