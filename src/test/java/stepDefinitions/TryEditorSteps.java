package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TryEditorPage;
import utils.ConfigReader;

public class TryEditorSteps {

	TestContext testContext;
	WebDriver driver;

	TryEditorPage tryEditorPage;
	
	public TryEditorSteps(TestContext testContext) {
		this.testContext = testContext;
		this.driver = testContext.getdriver();
		this.tryEditorPage = testContext.getTryEditorPage();
	}
	String expectedOutput;

	@Given("The user is on the Try Editor page")
	public void the_user_is_on_the_try_editor_page() {
		tryEditorPage.navigateToPage(ConfigReader.getTryEditorUrl());
	}

	@When("The user enters valid Python code from sheet {string} and row {int} and clicks the Run button")
	public void the_user_enters_valid_python_code_from_sheet_and_row_and_clicks_the_run_button(String sheetName,
			int rowNumber) throws IOException {
		expectedOutput = tryEditorPage.executePythonCodeFromExcel(sheetName, rowNumber);
	}

	@Then("The user is able to see the output inside the console")
	public void the_user_is_able_to_see_the_output_inside_the_console() {
		String actualOutput = tryEditorPage.getConsoleOutput();
		Assert.assertEquals(actualOutput, expectedOutput,
				"The output displayed in the console does not match the expected result.");
	}

	@Given("The user is on the Try Editor page with an alert error message")
	public void the_user_is_on_the_try_editor_page_with_an_alert_error_message() throws IOException {
		tryEditorPage.navigateToPage(ConfigReader.getTryEditorUrl());
		tryEditorPage.executePythonCodeFromExcel("pythonCode", 2);
	}

	@When("The user clicks the OK button in the alert window")
	public void the_user_clicks_the_ok_button_in_the_alert_window() {
		tryEditorPage.handleAlert();
	}

	@Then("The user is on the same page having the Editor and Run button")
	public void the_user_is_on_the_same_page_having_the_editor_and_run_button() {
		Assert.assertEquals(tryEditorPage.getCurrentUrl(), ConfigReader.getTryEditorUrl());
	}

	@When("The user enters invalid Python code from sheet {string} and row {int} and clicks the Run button")
	public void the_user_enters_invalid_python_code_from_sheet_and_row_and_clicks_the_run_button(String sheetName,
			int rowNumber) throws IOException {
		expectedOutput = tryEditorPage.executePythonCodeFromExcel(sheetName, rowNumber);
	}

	@Then("The user sees an error message in the alert window")
	public void the_user_sees_an_error_message_in_the_alert_window() {
		String alertMessage = tryEditorPage.handleAlert();
		Assert.assertEquals(alertMessage, expectedOutput);
	}

	@When("The user clicks the Run Button without entering code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_code_in_the_editor() {
		tryEditorPage.runPythonCode("");
	}

	@Then("The focus remains in the same page and no error message is displayed") 
	public void focus_remains_in_the_same_page_and_no_error_message_is_displayed() {
		Assert.assertEquals(tryEditorPage.getCurrentUrl(), ConfigReader.getTryEditorUrl());
		Assert.assertFalse(tryEditorPage.checkForAlert());
	}

}