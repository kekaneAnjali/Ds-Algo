package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TreePage;
import utils.ConfigReader;

public class TreeSteps {
	
	// Page names
	private static final String OVERVIEW_OF_TREES_PAGE = "Overview of Trees";
    private static final String TERMINOLOGIES_PAGE = "Terminologies";
    private static final String TYPES_OF_TREES_PAGE = "Types of Trees";
    private static final String TREE_TRAVERSALS_PAGE = "Tree Traversals";
    private static final String TRAVERSALS_ILLUSTRATIONS_PAGE = "Traversals-Illustration";
    private static final String BINARY_TREES_PAGE = "Binary Trees";
    private static final String TYPES_OF_BINARY_TREES_PAGE = "Types of Binary Trees";
    private static final String IMPLEMENTATION_IN_PYTHON_PAGE = "Implementation in Python";
    private static final String BINARY_TREE_TRAVERSALS_PAGE = "Binary Tree Traversals";
    private static final String IMPLEMENTATION_OF_BINARY_TREES_PAGE = "Implementation of Binary Trees";
    private static final String APPLICATION_OF_BINARY_TREES_PAGE = "Applications of Binary trees";
    private static final String BINARY_SEARCH_TREES_PAGE = "Binary Search Trees";
    private static final String IMPLEMENTATION_OF_BST_PAGE = "Implementation Of BST";
    private static final String PRACTICE_QUESTIONS_PAGE = "Practice Questions";
    
	
	TestContext testContext;
	WebDriver driver;

	TreePage treePage;
	
	public TreeSteps(TestContext testContext) {
		this.testContext = testContext;
		this.driver = testContext.getdriver();
		this.treePage = testContext.getTreePage();
	}
	
	// Tree Page
	@Given("The user is on the Tree page")
	public void the_user_is_on_the_tree_page() {
		treePage.navigateToPage(ConfigReader.getTreeUrl());
	}
	
	@When("The user clicks {string} link under Topics Covered in Tree page")
	public void the_user_clicks_link_under_topics_covered(String itemName) {
	    treePage.clickItemUnderTopicsCovered(itemName);
	}
	
	@Then("The user should be redirected to the Overview of Trees page")
	public void the_user_should_be_redirected_to_the_overview_of_trees_page() {
		Assert.assertEquals(treePage.getCurrentUrl(), ConfigReader.getOverviewOfTreesUrl());
		Assert.assertEquals(treePage.getPageTitle(), OVERVIEW_OF_TREES_PAGE);
	}
	
	@When("The user clicks Terminologies link")
	public void the_user_clicks_terminologies_link() {
	    treePage.clickTerminologiesLink();
	}
	
	@Then("The user should be redirected to the Terminologies page")
	public void the_user_should_be_redirected_to_the_terminologies_page() {
		Assert.assertEquals(treePage.getCurrentUrl(), ConfigReader.getTreeTerminologiesUrl());
		Assert.assertEquals(treePage.getPageTitle(), TERMINOLOGIES_PAGE);
	}
	
	@When("The user clicks Types of Trees link")
	public void the_user_clicks_types_of_trees_link() {
	    treePage.clickTypesOfTreesLink();
	}
	
	@Then("The user should be redirected to the Types of Trees page")
	public void the_user_should_be_redirected_to_the_types_of_trees_page() {
		Assert.assertEquals(treePage.getCurrentUrl(), ConfigReader.getTypesOfTreesUrl());
		Assert.assertEquals(treePage.getPageTitle(), TYPES_OF_TREES_PAGE);
	}
	
	@When("The user clicks Tree Traversals link")
	public void the_user_clicks_tree_traversals_link() {
		treePage.clickTreeTraversalsLink();
	}
	
	@Then("The user should be redirected to the Tree Traversals page")
	public void the_user_should_be_redirected_to_the_tree_traversals_page() {
		Assert.assertEquals(treePage.getCurrentUrl(), ConfigReader.getTreeTraversalsUrl());
		Assert.assertEquals(treePage.getPageTitle(), TREE_TRAVERSALS_PAGE);
	}	
	
	@When("The user clicks Traversals-Illustration link")
	public void the_user_clicks_traversals_illustration_link() {
		treePage.clickTraversalsIllustrationLink();
	}
	
	@Then("The user should be redirected to the Traversals-Illustration page")
	public void the_user_should_be_redirected_to_the_traversals_illustration_page() {
		Assert.assertEquals(treePage.getCurrentUrl(), ConfigReader.getTreeTraversalsIllustrationsUrl());
		Assert.assertEquals(treePage.getPageTitle(), TRAVERSALS_ILLUSTRATIONS_PAGE);
	}	

	@When("The user clicks Binary Trees link")
	public void the_user_clicks_binary_trees_link() {
		treePage.clickBinaryTreesLink();
	}
	
	@Then("The user should be redirected to the Binary Trees page")
	public void the_user_should_be_redirected_to_the_binary_trees_page() {
		Assert.assertEquals(treePage.getCurrentUrl(), ConfigReader.getBinaryTreesUrl());
		Assert.assertEquals(treePage.getPageTitle(), BINARY_TREES_PAGE);
	}

	@When("The user clicks Types of Binary Trees link")
	public void the_user_clicks_types_of_binary_trees_link() {
		treePage.clickTypesOfBinaryTreesLink();
	}
	
	@Then("The user should be redirected to the Types of Binary Trees page")
	public void the_user_should_be_redirected_to_the_types_of_binary_trees_page() {
		Assert.assertEquals(treePage.getCurrentUrl(), ConfigReader.getTypesOfBinaryTreesUrl());
		Assert.assertEquals(treePage.getPageTitle(), TYPES_OF_BINARY_TREES_PAGE);
	}
	
	@When("The user clicks Implementation in Python link")
	public void the_user_clicks_implementation_in_python_link() {
		treePage.clickImplementationInPythonLink();
	}
	
	@Then("The user should be redirected to the Implementation in Python page")
	public void the_user_should_be_redirected_to_the_implementation_in_python_page() {
		Assert.assertEquals(treePage.getCurrentUrl(), ConfigReader.getTreeImplementationInPythonUrl());
		Assert.assertEquals(treePage.getPageTitle(), IMPLEMENTATION_IN_PYTHON_PAGE);
	}
	
	@When("The user clicks Binary Tree Traversals link")
	public void the_user_clicks_binary_tree_traversals_link() {
		treePage.clickBinaryTreeTraversalsLink();
	}
	
	@Then("The user should be redirected to the Binary Tree Traversals page")
	public void the_user_should_be_redirected_to_the_binary_tree_traversals_page() {
		Assert.assertEquals(treePage.getCurrentUrl(), ConfigReader.getBinaryTreeTraversalsUrl());
		Assert.assertEquals(treePage.getPageTitle(), BINARY_TREE_TRAVERSALS_PAGE);
	}
	
	@When("The user clicks Implementation of Binary Trees link")
	public void the_user_clicks_implementation_of_binary_trees_link() {
		treePage.clickImplementationOfBinaryTreesLink();
	}
	
	@Then("The user should be redirected to the Implementation of Binary Trees page")
	public void the_user_should_be_redirected_to_the_implementation_of_binary_trees_page() {
		Assert.assertEquals(treePage.getCurrentUrl(), ConfigReader.getImplementationOfBinaryTreesUrl());
		Assert.assertEquals(treePage.getPageTitle(), IMPLEMENTATION_OF_BINARY_TREES_PAGE);
	}	
	
	@When("The user clicks Applications of Binary trees link")
	public void the_user_clicks_applications_of_binary_trees_link() {
		treePage.clickApplicationsOfBinaryTreesLink();
	}
	
	@Then("The user should be redirected to the Applications of Binary trees page")
	public void the_user_should_be_redirected_to_the_applications_of_binary_trees_page() {
		Assert.assertEquals(treePage.getCurrentUrl(), ConfigReader.getApplicationsOfBinaryTreesUrl());
		Assert.assertEquals(treePage.getPageTitle(), APPLICATION_OF_BINARY_TREES_PAGE);
	}
	
	@When("The user clicks Binary Search Trees link")
	public void the_user_clicks_binary_search_trees_link() {
		treePage.clickBinarySearchTreesLink();
	}
	
	@Then("The user should be redirected to the Binary Search Trees page")
	public void the_user_should_be_redirected_to_the_binary_search_trees_page() {
		Assert.assertEquals(treePage.getCurrentUrl(), ConfigReader.getBinarySearchTreesUrl());
		Assert.assertEquals(treePage.getPageTitle(), BINARY_SEARCH_TREES_PAGE);
	}
	
	@When("The user clicks Implementation Of BST link")
	public void the_user_clicks_implementation_of_bst_link() {
		treePage.clickImplementationOfBSTLink();
	}
	
	@Then("The user should be redirected to the Implementation Of BST page")
	public void the_user_should_be_redirected_to_the_implementation_of_bst_page() {
		Assert.assertEquals(treePage.getCurrentUrl(), ConfigReader.getImplementationOfBstUrl());
		Assert.assertEquals(treePage.getPageTitle(), IMPLEMENTATION_OF_BST_PAGE);
	}
	
	@Given("The user is on the Overview of Trees page")
	public void the_user_is_on_the_overview_of_trees_page() {
		treePage.navigateToPage(ConfigReader.getOverviewOfTreesUrl());
	}
	
	@Given("The user is on the Terminologies page")
	public void the_user_is_on_the_terminologies_page() {
		treePage.navigateToPage(ConfigReader.getTreeTerminologiesUrl());
	}	

	@Given("The user is on the Types of Trees page")
	public void the_user_is_on_the_types_of_trees_page() {
		treePage.navigateToPage(ConfigReader.getTypesOfTreesUrl());
	}
	
	@Given("The user is on the Tree Traversals page")
	public void the_user_is_on_the_tree_traversals_page() {
		treePage.navigateToPage(ConfigReader.getTreeTraversalsUrl());
	}
	
	@Given("The user is on the Traversals-Illustration page")
	public void the_user_is_on_the_traversals_illustration_page() {
		treePage.navigateToPage(ConfigReader.getTreeTraversalsIllustrationsUrl());
	}
	
	@Given("The user is on the Binary Trees page")
	public void the_user_is_on_the_binary_trees_page() {
		treePage.navigateToPage(ConfigReader.getBinaryTreesUrl());
	}
	
	@Given("The user is on the Types of Binary Trees page")
	public void the_user_is_on_the_types_of_binary_trees_page() {
		treePage.navigateToPage(ConfigReader.getTypesOfBinaryTreesUrl());
	}
	
	@Given("The user is on the Implementation in Python page")
	public void the_user_is_on_the_implementation_in_python_page() {
		treePage.navigateToPage(ConfigReader.getTreeImplementationInPythonUrl());
	}
	
	@Given("The user is on the Binary Tree Traversals page")
	public void the_user_is_on_the_binary_tree_traversals_page() {
		treePage.navigateToPage(ConfigReader.getBinaryTreeTraversalsUrl());
	}
	
	@Given("The user is on the Implementation of Binary Trees page")
	public void the_user_is_on_the_implementation_of_binary_trees_page() {
		treePage.navigateToPage(ConfigReader.getImplementationOfBinaryTreesUrl());
	}
	
	@Given("The user is on the Applications of Binary trees page")
	public void the_user_is_on_the_applications_of_binary_trees_page() {
		treePage.navigateToPage(ConfigReader.getApplicationsOfBinaryTreesUrl());
	}
	
	@Given("The user is on the Binary Search Trees page")
	public void the_user_is_on_the_binary_search_trees_page() {
		treePage.navigateToPage(ConfigReader.getBinarySearchTreesUrl());
	}
	
	@Given("The user is on the Implementation Of BST page")
	public void the_user_is_on_the_implementation_of_bst_page() {
		treePage.navigateToPage(ConfigReader.getImplementationOfBstUrl());
	}
	
	@When("The user clicks Practice Questions link in Implementation Of BST page")
	public void the_user_clicks_practice_questions_link() {
		treePage.clickPracticeQuestionsLink();
	}
	
	@Then("The user should be redirected to the Practice Questions page in Tree")
	public void the_user_should_be_redirected_to_the_practice_questions_page_in_tree() {
		Assert.assertEquals(treePage.getCurrentUrl(), ConfigReader.getTreePracticeUrl());
		Assert.assertEquals(treePage.getPageTitle(), PRACTICE_QUESTIONS_PAGE);
	}
	
	

	

	
	

}
