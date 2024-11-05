package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LinkedListPage;

public class LinkedListSteps {
	LinkedListPage linkedlistpage=new LinkedListPage();
	
	//TC_Llist1
	
	@Given("The user is on the {string} after logged in")
	public void the_user_is_on_the_after_logged_in(String string) {
	    
	   // throw new io.cucumber.java.PendingException();
		linkedlistpage.navigateToPage(string);
	}
	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {
	    
	    //throw new io.cucumber.java.PendingException();
		linkedlistpage.clickIntroductionLink();
		
	}


	@Then("The user should be directed to {string} of Linked List Page")
	public void the_user_should_be_directed_to_of_linked_list_page(String pName) {
	    
	    //throw new io.cucumber.java.PendingException();
		String Title = linkedlistpage.getLinkedListPageTitle();
		Assert.assertEquals(Title, pName, "Title do not match");
		
	}

	//Tc_Llist2
	@When("The user clicks {string} button in the {string} page")
	public void the_user_clicks_button_in_the_page(String string, String string2) {
	    
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user redirected to the page having an tryEditor with a Run button to test")
	public void the_user_redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test() {
	    
	    throw new io.cucumber.java.PendingException();
	}
	//TC_Llist3
	
	@When("The user clicks creating linked list link")
	public void the_user_clicks_creating_linked_list_link() {
	    
	    throw new io.cucumber.java.PendingException();
	}

	
	 //TC_List4
	    @Given("The user is on the Creating Linked List page")
	    public void the_user_is_on_the_creating_linked_list_page() {
	        
	        throw new io.cucumber.java.PendingException();
	    }

	    @When("The user clicks Types of Linked List link")
	    public void the_user_clicks_types_of_linked_list_link() {
	        
	        throw new io.cucumber.java.PendingException();
	    }

	    @Then("The user should be redirected to Types of Linked List page")
	    public void the_user_should_be_redirected_to_types_of_linked_list_page() {
	        
	        throw new io.cucumber.java.PendingException();
	    }
		 //TC_List5
	    
	    @When("The user clicks the Types of Linked List link")
	    public void the_user_clicks_the_types_of_linked_list_link() {
	        
	        throw new io.cucumber.java.PendingException();
	    }
	    //TC_Llist6
	    @Given("The user is on the Types of Linked List page")
	    public void the_user_is_on_the_types_of_linked_list_page() {
	        
	        throw new io.cucumber.java.PendingException();
	    }
	    
	   
	    //TC_llist7
	    @When("The user clicks the Implement Linked List in Python link")
	    public void the_user_clicks_the_implement_linked_list_in_python_link() {
	        
	        throw new io.cucumber.java.PendingException();
	    }
	    //TC_Llist8
	    @Given("The user is on the Implement Linked List in Python page")
	    public void the_user_is_on_the_implement_linked_list_in_python_page() {
	        
	        throw new io.cucumber.java.PendingException();
	    }
	    
	    
	    //TC_Llist9
	    @When("The user clicks the Traversal link")
	    public void the_user_clicks_the_traversal_link() {
	        
	        throw new io.cucumber.java.PendingException();
	    }
	    //TC_Llist10
	    @Given("The user is on the Traversal page")
	    public void the_user_is_on_the_traversal_page() {
	        
	        throw new io.cucumber.java.PendingException();
	    }
	    //Tc_Llist11
	    @When("The user clicks the Insertion link")
	    public void the_user_clicks_the_insertion_link() {
	        
	        throw new io.cucumber.java.PendingException();
	    }
	    //TC_Llist12
	    @Given("The user is on the Insertion page")
	    public void the_user_is_on_the_insertion_page() {
	        
	        throw new io.cucumber.java.PendingException();
	    }
	    //TC_Llist13
	    @When("The user clicks the Deletion link")
	    public void the_user_clicks_the_deletion_link() {
	        
	        throw new io.cucumber.java.PendingException();
	    }
	    //TC_Llist14
	    @Given("The user is on the Deletion page")
	    public void the_user_is_on_the_deletion_page() {
	        
	        throw new io.cucumber.java.PendingException();
	    }
	    //TC_List15
	    @When("The user clicks on the Practice Questions")
	    public void the_user_clicks_on_the_practice_questions() {
	        
	        throw new io.cucumber.java.PendingException();
	    }

	    @Then("The user should be directed to Practice Questions of Linked List Page")
	    public void the_user_should_be_directed_to_practice_questions_of_linked_list_page() {
	        
	        throw new io.cucumber.java.PendingException();
	    }

	

	

}
