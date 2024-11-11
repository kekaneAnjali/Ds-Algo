package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GraphPage;
import pages.HomePage;
import utils.ConfigReader;

public class HomeSteps {

	TestContext testContext;
	WebDriver driver;

	HomePage homePage;
	
	public HomeSteps(TestContext testContext) {
		this.testContext = testContext;
		this.driver = testContext.getdriver();
		this.homePage = testContext.getHomePage();
	}
	
	@Given("The user is on the Home page")
	public void the_user_is_on_the_home_page() {
		homePage.navigateToPage(ConfigReader.getHomeUrl());
	}

	// Common Navigation
	@When("The user clicks the {string} item from the drop down menu")
	public void the_user_clicks_the_item_from_the_drop_down_menu(String itemName) {
		homePage.clickDropDownItem(itemName);
}

	@When("The user clicks the Get Started button in {string} Panel")
	public void the_user_clicks_the_get_started_button_in_panel(String itemName) {
		homePage.clickGetStarted(itemName);
	}

	@Then("The user should be redirected to the {string} page")
	public void the_user_should_be_redirected_to_the_page(String pageName) {
		String expectedUrl = getPageUrl(pageName);
		Assert.assertEquals(homePage.getCurrentUrl(), expectedUrl);
	}

	private String getPageUrl(String pageName) {
		switch (pageName.toLowerCase()) {
		case "graph home":
			return ConfigReader.getGraphHomeUrl();
		case "tree":
			return ConfigReader.getTreeUrl();
		case "array":
			return ConfigReader.getArrayUrl();
		case "linked list":
			return ConfigReader.getLinkedListUrl();
		case "stack":
			return ConfigReader.getStackUrl();
		case "queue":
			return ConfigReader.getQueueUrl();			
		case "data-structures-introduction":
			return ConfigReader.getDataStructuresIntroductionUrl();
		default:
			throw new IllegalArgumentException("Unknown page: " + pageName);
		}
	}
	@Given("The user open the browser")
	public void the_user_open_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("The user enter the DS_Algo Portal <URL>")
	public void the_user_enter_the_ds_algo_portal_url() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("The user should landed on the DS_Algo Get Started page with message {string}")
	public void the_user_should_landed_on_the_ds_algo_get_started_page_with_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("The user should open the DS Algo Portal URL in any supported browser")
	public void the_user_should_open_the_ds_algo_portal_url_in_any_supported_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("The user should land in Data Structure Introduction Page with {string} and {string} links")
	public void the_user_should_land_in_data_structure_introduction_page_with_and_links(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	

	@When("The user selects any data structures item from the drop down without Sign in")
	public void the_user_selects_any_data_structures_item_from_the_drop_down_without_sign_in() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("The user is on the DS Home page")
	public void the_user_is_on_the_ds_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	

	@When("The user clicks any {string} buttons of data structures on the DS Introduction page")
	public void the_user_clicks_any_buttons_of_data_structures_on_the_ds_introduction_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("The user clicks Register link on the DS Introduction page")
	public void the_user_clicks_register_link_on_the_ds_introduction_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("The user redirected to Register")
	public void the_user_redirected_to_register() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("The user is on the DS Algo Introduction Page")
	public void the_user_is_on_the_ds_algo_introduction_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("The user should click the Sign in link")
	public void the_user_should_click_the_sign_in_link() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("The user redirected to login page")
	public void the_user_redirected_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}