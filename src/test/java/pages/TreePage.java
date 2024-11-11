package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.WebDriverWaitUtility;

public class TreePage extends BasePage {
	
	public TreePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[text()='Terminologies']")
	private WebElement terminologiesLink;
	
	@FindBy(xpath="//a[text()='Types of Trees']")
	private WebElement typesOfTreesLink;
	
	@FindBy(xpath="//a[text()='Tree Traversals']")
	private WebElement treeTraversalsLink;
	
	@FindBy(xpath="//a[text()='Traversals-Illustration']")
	private WebElement traversalsIllustrationLink;
	
	@FindBy(xpath="//a[text()='Binary Trees']")
	private WebElement binaryTreesLink;
	
	@FindBy(xpath="//a[text()='Types of Binary Trees']")
	private WebElement typesOfBinaryTreesLink;
	
	@FindBy(xpath="//a[text()='Implementation in Python']")
	private WebElement implementationInPythonLink;
	
	@FindBy(xpath="//a[text()='Binary Tree Traversals']")
	private WebElement binaryTreeTraversalsLink;
	
	@FindBy(xpath="//a[text()='Implementation of Binary Trees']")
	private WebElement implementationOfBinaryTreesLink;
	
	@FindBy(xpath="//a[text()='Applications of Binary trees']")
	private WebElement applicationsOfBinaryTreesLink;
	
	@FindBy(xpath="//a[text()='Binary Search Trees']")
	private WebElement binarySearchTreesLink;
	
	@FindBy(xpath="//a[text()='Implementation Of BST']")
	private WebElement implementationOfBSTLink;
	
	@FindBy(xpath="//a[text()='Practice Questions']")
	private WebElement practiceQuestionsLink;	
	
	@FindBy(xpath="//strong//p[contains(@class,'bg-secondary')]")
	private WebElement pageTitle;
	

	public void clickItemUnderTopicsCovered(String itemName) {
		WebElement item = driver.findElement(By.xpath("//a[contains(@class,'list-group-item') and text()='" + itemName + "']"));
		WebDriverWaitUtility.waitForElementToBeClickable(item).click();
	}
	
	public void clickTerminologiesLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(terminologiesLink);
		terminologiesLink.click();
	}
	
	public void clickTypesOfTreesLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(typesOfTreesLink);
		typesOfTreesLink.click();
	}
	
	public void clickTreeTraversalsLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(treeTraversalsLink);
		treeTraversalsLink.click();
	}
	
	public void clickTraversalsIllustrationLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(traversalsIllustrationLink);
		traversalsIllustrationLink.click();
	}
	
	public void clickBinaryTreesLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(binaryTreesLink);
		binaryTreesLink.click();
	}
	
	public void clickTypesOfBinaryTreesLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(typesOfBinaryTreesLink);
		typesOfBinaryTreesLink.click();
	}
	
	public void clickImplementationInPythonLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(implementationInPythonLink);
		implementationInPythonLink.click();
	}
	
	public void clickBinaryTreeTraversalsLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(binaryTreeTraversalsLink);
		binaryTreeTraversalsLink.click();
	}
	
	public void clickImplementationOfBinaryTreesLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(implementationOfBinaryTreesLink);
		implementationOfBinaryTreesLink.click();
	}
	
	public void clickApplicationsOfBinaryTreesLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(applicationsOfBinaryTreesLink);
		applicationsOfBinaryTreesLink.click();
	}
	
	public void clickBinarySearchTreesLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(binarySearchTreesLink);
		binarySearchTreesLink.click();
	}
	
	public void clickImplementationOfBSTLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(implementationOfBSTLink);
		implementationOfBSTLink.click();
	}
	
	public void clickPracticeQuestionsLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(practiceQuestionsLink);
		practiceQuestionsLink.click();
	}
	
	public String getPageTitle() {
		WebDriverWaitUtility.waitForElementToBeVisible(pageTitle);
		return pageTitle.getText();		
	}
}
