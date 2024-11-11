package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LinkedListPage;

public class LinkedListSteps {
	TestContext testContext;
	WebDriver driver;

	LinkedListPage linkedlistpage;
	
	public LinkedListSteps(TestContext testContext) {
		this.testContext = testContext;
		this.driver = testContext.getdriver();
		this.linkedlistpage = testContext.getLinkedListPage();
	}

	// TC_Llist1

	@Given("The user is on the {string} page after logged in")
	public void the_user_is_on_the_page_after_logged_in(String pageName) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		linkedlistpage.getNavigateToPage(pageName);
	}

	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {

		linkedlistpage.clickIntroductionLink();

	}

	@Then("The user should be directed to {string} of Linked List Page")
	public void the_user_should_be_directed_to_of_linked_list_page(String pName) {

		String Title = linkedlistpage.getLinkedListPageTitle();
		Assert.assertEquals(Title, pName, "Title do not match");

	}

	// Tc_Llist2
	@When("The user clicks {string} button in the {string} page")
	public void the_user_clicks_button_in_the_page(String btn, String dsName) {

		linkedlistpage.clickTryHereLink(btn, dsName);
	}

	@Then("The user redirected to the page having an tryEditor with a Run button to test")
	public void the_user_redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test() {

		String Title = linkedlistpage.getLinkedListPageTitle();
		Assert.assertEquals(Title, "Assessment", "Title do not match");
	}
	// TC_Llist3

	@When("The user clicks creating linked list link")
	public void the_user_clicks_creating_linked_list_link() {

		linkedlistpage.clickCreatingLinkedlistLink();
	}

	// TC_List4

	// TC_LList5

	// TC_List5

	@When("The user clicks the Types of Linked List link")
	public void the_user_clicks_the_types_of_linked_list_link() {

		linkedlistpage.clickTypesOfLinkedlistLLink();
	}
	// TC_Llist6

	// TC_llist7
	@When("The user clicks the Implement Linked List in Python link")
	public void the_user_clicks_the_implement_linked_list_in_python_link() {

		linkedlistpage.clickImplementLinkedListInPythonLink();
	}
	// TC_Llist8

	// TC_Llist9
	@When("The user clicks the Traversal link")
	public void the_user_clicks_the_traversal_link() {

		linkedlistpage.clickTraversalLink();
	}
	// TC_Llist10

	// Tc_Llist11
	@When("The user clicks the Insertion link")
	public void the_user_clicks_the_insertion_link() {

		linkedlistpage.clickInsertionLink();
	}
	// TC_Llist12

	// TC_Llist13
	@When("The user clicks the Deletion link")
	public void the_user_clicks_the_deletion_link() {

		linkedlistpage.clickDeletionLink();
	}
	// TC_Llist14

	// TC_List15
	@When("The user clicks on the Practice Questions")
	public void the_user_clicks_on_the_practice_questions() {

		linkedlistpage.clickPracticeQuestionLinkOfLnkdList();
	}

	@Then("The user should be directed to Practice Questions of Linked List Page")
	public void the_user_should_be_directed_to_practice_questions_of_linked_list_page() {

		String Title = linkedlistpage.getLinkedListPracticeQuestionUrl();
		Assert.assertEquals(Title, "Practice Questions", "Title do not match");

	}

}
