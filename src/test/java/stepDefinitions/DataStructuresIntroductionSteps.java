package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DataStructuresIntroductionPage;
import utils.ConfigReader;

public class DataStructuresIntroductionSteps {
	
	DataStructuresIntroductionPage dataStructuresPage = new DataStructuresIntroductionPage();
	
	@Given("The user is on the Data Structures Introduction page")
	public void the_user_is_on_the_data_structures_introduction_page() {
		dataStructuresPage.navigateToPage(ConfigReader.getDataStructuresIntroductionUrl());
	}
	
	@When("The user clicks {string} link under Topics Covered in Data Structures Introduction page")
	public void the_user_clicks_time_complexity_link_under_topics_covered(String itemName) {
		dataStructuresPage.clickLinkUnderTopicsCovered(itemName);
	}	
	
	@Then("The user should be redirected to the Time Complexity page")
	public void the_user_should_be_redirected_to_the_time_complexity_page() {
		Assert.assertEquals(dataStructuresPage.getCurrentUrl(), ConfigReader.getDataStructuresTimeComplexityUrl());
	}
	
	@Given("The user is on the Time Complexity page")
	public void the_user_is_on_the_time_complexity_page() {
		dataStructuresPage.navigateToPage(ConfigReader.getDataStructuresTimeComplexityUrl());
	}
	
	@When("The user clicks Practice Questions link in Time Complexity page")
	public void the_user_clicks_practice_questions_link_in_time_complexity_page() {
		dataStructuresPage.clickPracticeLink();
	}
	
	@Then("The user should be redirected to the Practice Questions page in Data Structures Introduction")
	public void the_user_should_be_redirected_to_the_practice_questions_page_in_data_structures_introduction() {
		Assert.assertEquals(dataStructuresPage.getCurrentUrl(), ConfigReader.getDataStructuresPracticeUrl());
	}

}
