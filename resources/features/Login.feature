Feature: Login 

Background: Common Steps
	Given User launches the chrome browser
	When User opens URL "https://practicetestautomation.com/"
	And User clicks on Practice link
	And user clicks on Test Login Page link

@sanity
Scenario: Successful Login With Valid Creadentials


	And User enters username as "student" and password as "Password123"
	And user click on Submit button
	Then Page title should be "Logged In Successfully | Practice Test Automation"
	And User closes the browser


@regression
Scenario Outline: Data Driven Testing Login with Valid and Invalid Creadentials  

	
	And User enters username as "<Username>" and password as "<Password>"
	And user click on Submit button
	Then Page title should be "Logged In Successfully | Practice Test Automation" or "Test Login | Practice Test Automation"
	And User closes the browser
	
	Examples:
	|Username|Password|
	|student|Password112|
	|student|Password123|

@sanity
Scenario: Veryfy Logout Functionality
  
	
	And User enters username as "student" and password as "Password123"
	And user click on Submit button
	Then Page title should be "Logged In Successfully | Practice Test Automation"
	And click on Logout button
	Then Page title should be "Test Login | Practice Test Automation"
	And User closes the browser
	
