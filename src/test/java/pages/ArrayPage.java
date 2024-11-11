package pages;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utils.ConfigReader;
import utils.ExcelReader;
import utils.WebDriverWaitUtility;

public class ArrayPage extends BasePage {
	
	public ArrayPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath=" //ul//a[@href='arrays-in-python']")
	WebElement arraysInPythonLink;
	
	
	@FindBy(xpath="//a[normalize-space()='Arrays Using List']")
	WebElement arraysUsingList;
	
	@FindBy(xpath="//a[normalize-space()='Basic Operations in Lists']")
	WebElement basicOperationsInLists;
	
	@FindBy(xpath="//a[contains(text(),'Applications of Array')]")
	WebElement applicationsOfarray;
	
	@FindBy(xpath="//a[@href='/array/practice']")
	WebElement arrayPracticeQns;
	
	@FindBy(xpath = "//a[@href='/tryEditor']")
	private WebElement tryEditorLink;

	@FindBy(xpath = "//a[@href='/question/1']")
	WebElement searchTheArray;

	@FindBy(xpath = "//a[@href='/question/2']")
	WebElement maxCnscutivones;

	@FindBy(xpath = "//a[@href='/question/3']")
	WebElement fndNumbrsWithEvnNoOfDgts;

	@FindBy(xpath = "//a[@href='/question/4']")
	WebElement SqrsOfASrtdArray;

	@FindBy(xpath = "//*[@id='answer_form']/button")
	WebElement runButton;

	@FindBy(xpath = "//*[@class='button']")
	WebElement submitBtn;

	@FindBy(xpath = "//textarea[@tabindex='0']")
	WebElement codeEditor;

	@FindBy(id = "output")
	
	WebElement output;public void clickLinkUnderTopicsCovered(String itemName) {
		WebElement item = driver
				.findElement(By.xpath("//a[contains(@class,'list-group-item') and text()='" + itemName + "']"));
		WebDriverWaitUtility.waitForElementToBeClickable(item).click();
	}
	
	public void clickArraysInPythonlink() {
		WebDriverWaitUtility.waitForElementToBeClickable(arraysInPythonLink);
		arraysInPythonLink.click();
	}
	public void clickArraysUsingList() {
		WebDriverWaitUtility.waitForElementToBeClickable(arraysUsingList);
		arraysUsingList.click();
	}
	public void clickBasicOperationsInLists() {
		WebDriverWaitUtility.waitForElementToBeClickable(basicOperationsInLists);
		basicOperationsInLists.click();
	}
	public void clickApplicationsOfArray() {
		WebDriverWaitUtility.waitForElementToBeClickable(applicationsOfarray);
		applicationsOfarray.click();
		
	}
	public void clickTryHereButton() {
		WebDriverWaitUtility.waitForElementToBeClickable(tryEditorLink);
		tryEditorLink.click();
	}
	public void clickPracticeQuestionslink() {
		WebDriverWaitUtility.waitForElementToBeClickable(arrayPracticeQns);
		arrayPracticeQns.click();
	}
	public void clickSearchTheArray() {
		WebDriverWaitUtility.waitForElementToBeClickable(searchTheArray);
		searchTheArray.click();
	}

	public void clickMaxCnsecutiveOnes() {
		WebDriverWaitUtility.waitForElementToBeClickable(maxCnscutivones);
		maxCnscutivones.click();
	}

	public void clickFndNumswithEvnNumOfDigts() {
		WebDriverWaitUtility.waitForElementToBeClickable(fndNumbrsWithEvnNoOfDgts);
		fndNumbrsWithEvnNoOfDgts.click();
	}

	public void clickSqrsOfASortdArray() {
		WebDriverWaitUtility.waitForElementToBeClickable(SqrsOfASrtdArray);
		SqrsOfASrtdArray.click();
	}
	public void clickQuestionLinkByTitle(String questionTitle) {
		// Use XPath to locate the link based on the question title text
		String xpathExpression = String.format("//a[contains(text(), '%s')]", questionTitle);
		WebElement questionLink = driver.findElement(By.xpath(xpathExpression));
		questionLink.click();

	}
	public String getArrayPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	

	public void getPracticeQuestionLinksOfArray(String pageName) {
		String pageLink = "array." + pageName.replaceAll("\s", ".")+".url";
		String url=ConfigReader.getLink(pageLink.toLowerCase());
		driver.get(url);
	}
	
	
	

	public void enterPythonCode(String sheetName, String questionTitle) throws IOException {
		ExcelReader excelReader = new ExcelReader(ConfigReader.getExcelFilePath());
		String code = excelReader.getCellDataByTitle(sheetName, questionTitle, "pythonCode");
		enterCodeInEditor(code);
	}
	public void clickRunBtn() {
		WebDriverWaitUtility.waitForElementToBeClickable(runButton);
		runButton.click();

	}

	public void clickSubmitBtn() {
		WebDriverWaitUtility.waitForElementToBeClickable(submitBtn);
		submitBtn.click();

	}
	public String getErrorText() {
		String errorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errorMsg;

	}
	public void enterCodeInEditor(String code) {
		// Clear the existing content in the editor
		new Actions(driver)
		    .keyDown(Keys.CONTROL)
		    .sendKeys("a")
		    .keyUp(Keys.CONTROL)
		    .sendKeys(Keys.DELETE)
		    .perform();
		
		String[] str1 = code.split("\n");
		for (int i = 0; i < str1.length; i++) {
			if (str1[i].equalsIgnoreCase("\\b")) {
				codeEditor.sendKeys(Keys.BACK_SPACE);
			} else {
				codeEditor.sendKeys(str1[i]);
				codeEditor.sendKeys(Keys.RETURN);
			}
		}
	}

	
	public String getExpectedResult(String sheetName,String questionTitle) throws IOException {
		ExcelReader excelReader = new ExcelReader(ConfigReader.getExcelFilePath());
		String Result = excelReader.getCellDataByTitle(sheetName, questionTitle, "Result");
		return Result;
		
	}
	public String getActualResult() {
		WebDriverWaitUtility.waitForElementToBeVisible(output);
		return output.getText();

	}

}
