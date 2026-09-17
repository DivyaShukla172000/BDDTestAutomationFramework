package com.stad.testautomation.stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.stad.testautomationpages.HomePage;
import com.stad.testautomationpages.LoginPage;
import com.stad.testautomationpages.PracticePage;
import com.stad.testautomationpages.TestLoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	//TestLoginPage tlp = new TestLoginPage(driver);
	LoginPage lp;
	PracticePage tlink;
	 HomePage plink ;

	@Before
	public void setup() {
	 driver= new ChromeDriver();
	  plink = new HomePage(driver);
	 lp= new LoginPage(driver);
	 tlink = new PracticePage(driver);
	}

	
	@Given("User launches the chrome browser")
	public void user_launches_the_chrome_browser() {
		Assert.assertTrue(driver!=null);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("User clicks on Practice link")
	public void user_clicks_on_practice_link() {
		
		plink.clickOnPracticeLink();

	}

	@When("user clicks on Test Login Page link")
	public void user_clicks_on_test_login_page_link() {
		 
		tlink.clickOnTesLoginPageLink();
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		// TestLoginPage lp = new TestLoginPage(driver);
		
		lp.setUserName(username);
		lp.setPassword(password);
	}

	@When("user click on Submit button")
	public void user_click_on_submit_button() {
		
		lp.clickLogin();
	}
	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
		
		if(driver.getTitle().contains("Successfully")) {
			Assert.assertEquals(driver.getTitle(), title);
		}
		
		else {	
			
		Assert.assertEquals(driver.getTitle(),title);
		}
	}
	
	@Then("Page title should be {string} or {string}")
	public void page_title_should_be_or(String title1, String title2) throws InterruptedException {
		if(driver.getTitle().contains(title1)) {
			Assert.assertEquals(driver.getTitle(), title1);
		}
		else {	
			Thread.sleep(2000);
			String errorText = lp.getErrorText();
			System.out.println(errorText);
		Assert.assertEquals(driver.getTitle(), title2);
		Assert.assertEquals(errorText, "Your password is invalid!");

		
		}
	}
	@Then("click on Logout button")
	public void click_on_logout_button() {
	  lp.clickOnLogoutBtn();
	}

	
	//Text Exception
	@When("user clicks on Test Exception link")
	public void user_clicks_on_test_exception_link() {
		
		 tlink.clickOnExceptionLink();
	}


	@After
	@Then("User closes the browser")
	public void user_closes_the_browser() {
		driver.quit();
	}

}
