@graph
Feature: Graph Functionality

  Background: 
    Given The user is logged in with username "numpy@gmail.com" and password "Tester123$"
    
  # Home Page  
  @graph1
  Scenario: Redirect to Graph page from Home page drop down menu 
  	Given The user is on the Home page
  	When The user clicks the "Graph" item from the drop down menu
  	Then The user should be redirected to the "Graph Home" page

  @graph2
	Scenario: Redirect to Graph page from Home page Get Started button in Graph Panel 
		Given The user is on the Home page	
		When The user clicks the Get Started button in "Graph" Panel
		Then The user should be redirected to the "Graph Home" page

  # Graph Home Page   
  Scenario: Redirect to Graph Page from Graph home page
    Given The user is on the Graph Home page	
    When The user clicks "Graph" link under Topics Covered in Graph Home page
    Then The user should be redirected to the Graph page

  Scenario: Redirect to Graph Representations Page from Graph home page  
    Given The user is on the Graph Home page	
    When The user clicks "Graph Representations" link under Topics Covered in Graph Home page
    Then The user should be redirected to the Graph Representations page

  # Graph Page
  Scenario: Redirect to Graph Representations Page from Graph page  
	  Given The user is on the Graph page	
	  When The user clicks Graph Representations link	
	  Then The user should be redirected to the Graph Representations page  
  
  Scenario: Redirect to Python Editor page from Graph Page
    Given The user is on the Graph page	
    When The user clicks Try Here button	
    Then The user should be redirected to the Try Editor page
  
  # Graph Representations Page
  Scenario: Redirect to Practice Questions page from Graph Representations page	 
    Given The user is on the Graph Representations page	 
    When The user clicks Practice Questions link in Graph Representations page	
    Then The user should be redirected to the Practice Questions page in Graph

  Scenario: Redirect to Python Editor page from Graph Representations page
    Given The user is on the Graph Representations page	
    When The user clicks Try Here button	
    Then The user should be redirected to the Try Editor page

  # Try Editor Page
  @try-editor
  Scenario: Run Button with valid code in Python Code Editor Page
	  Given The user is on the Try Editor page
	  When The user enters valid Python code from sheet "PythonCode" and row 1 and clicks the Run button
	  Then The user is able to see the output inside the console  

  @try-editor
  Scenario: Run Button with invalid code in Python Code Editor Page
    Given The user is on the Try Editor page	
    When The user enters invalid Python code from sheet "PythonCode" and row 2 and clicks the Run button	
    Then The user sees an error message in the alert window   
    
  @try-editor  
  Scenario: Run Button without entering code in Python Code Editor Page
    Given The user is on the Try Editor page	
    When The user clicks the Run Button without entering code in the Editor	
    Then The focus remains in the same page and no error message is displayed
    
	@try-editor
  Scenario: Handle alert message in Python Code Editor Page
    Given The user is on the Try Editor page with an alert error message	
    When The user clicks the OK button in the alert window	
    Then The user is on the same page having the Editor and Run button 
     