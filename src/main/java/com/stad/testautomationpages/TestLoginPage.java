package com.stad.testautomationpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestLoginPage {

	// [With out using page factory]

	// constructor
	WebDriver driver;

	public TestLoginPage(WebDriver driver) {
		this.driver = driver;
		// using page factory
		PageFactory.initElements(driver, this); // mandatory every time we have to add this line in constructor for
												// pageFactory Test Approch

	}

	// locators/webelements
	// By testField_Login_Username =By.xpath("//input[@name='username']");
	// By testField_Login_Password =By.id("password");
	// By btn_TestLoginPage_Submit = By.id("submit");
	// By btn_Logout= By.partialLinkText("Log out");

	@FindBy(xpath = "//input[@name='username']")
	WebElement testField_Login_Username;

	@FindBy(id = "password")
	WebElement testField_Login_Password;

	@FindBy(id = "submit")
	WebElement btn_TestLoginPage_Submit;

	@FindBy(linkText = "Log out")
	WebElement btn_Logout;

	

	public Boolean logoutButtonDisplayed()  {
		// WebElement loginSuccesful = driver.findElement(btn_Logout);
		// boolean displayedStatus = loginSuccesful.isDisplayed();
		
		boolean displayedStatus = btn_Logout.isDisplayed();
		return displayedStatus;
	}
}



//Action Methods
/*
 * public void clickOnTesLoginPageLink(String username, String password) { //
 * driver.findElement(testField_Login_Username).sendKeys(username); //
 * driver.findElement(testField_Login_Password).sendKeys( password); //
 * driver.findElement(btn_TestLoginPage_Submit).click();
 * 
 * testField_Login_Username.sendKeys(username);
 * testField_Login_Password.sendKeys(password);
 * //btn_TestLoginPage_Submit.click(); }
 * 
 * public void clickonSubmitbutton() { btn_TestLoginPage_Submit.click(); }
 */