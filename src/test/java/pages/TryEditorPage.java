package pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.ConfigReader;
import utils.ExcelReader;
import utils.LogHelper;
import utils.WebDriverWaitUtility;

public class TryEditorPage extends BasePage {

	public TryEditorPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[text()='Run']")
	private WebElement runButton;

	@FindBy(id = "output")
	private WebElement outputField;

	@FindBy(xpath = "//textarea/ancestor::div[contains(@class,'CodeMirror')]")
	private WebElement codeMirrorDiv;

	public void runPythonCode(String pythonCode) {
		codeMirrorDiv.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.CodeMirror').CodeMirror.setValue(arguments[0]);", pythonCode);
		WebDriverWaitUtility.waitForElementToBeClickable(runButton);
		runButton.click();
	}

	public String getConsoleOutput() {
		WebDriverWaitUtility.waitForElementToBeVisible(outputField);
		return outputField.getText();
	}

	public String handleAlert() {
		String alertMessage = "";
		try {
			WebDriverWaitUtility.waitForAlert();
			Alert alert = driver.switchTo().alert();
			alertMessage = alert.getText();
			alert.accept();
		} catch (NoAlertPresentException e) {
			LogHelper.error(e.getMessage());
		}
		return alertMessage;
	}

	public boolean checkForAlert() {
		boolean alertIsPresent = false;
		try {
			driver.switchTo().alert();
			alertIsPresent = true;
		} catch (NoAlertPresentException e) {
			alertIsPresent = false;
		}

		return alertIsPresent;
	}

	public String executePythonCodeFromExcel(String sheetName, int rowNumber) throws IOException {
		String expectedOutput;
		String excelFilePath = ConfigReader.getExcelFilePath();
		LogHelper.info(excelFilePath);
		LogHelper.info(getCurrentUrl());
		ExcelReader excelReader = new ExcelReader(excelFilePath);

		try {
			String pythonCode = excelReader.getCellData(sheetName, rowNumber, 0);
			expectedOutput = excelReader.getCellData(sheetName, rowNumber, 1);
			System.out.println("Python Code to Execute: " + pythonCode);
			runPythonCode(pythonCode);
		} finally {
			excelReader.close();
		}
		return expectedOutput;
	}

}
