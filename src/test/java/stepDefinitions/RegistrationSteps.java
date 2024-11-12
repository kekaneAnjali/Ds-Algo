package stepDefinitions;

import org.openqa.selenium.WebDriver;

import driver.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.ConfigReader;

public class RegistrationSteps {
//	public static WebDriver driver = DriverManager.getdriver();

	@Given("User open browser with url https:\\/\\/dsportalapp.herokuapp.com")
	public void user_open_browser_with_url_https_dsportalapp_herokuapp_com() {
		String baseUrl = ConfigReader.getBaseUrl();
//		driver.get(baseUrl);
	}

	@Then("User should see Get Started page")
	public void user_should_see_get_started_page() {

	}

}
