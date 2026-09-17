package com.stad.testautomationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
	//	ldriver = rdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement testField_Login_Username;

	@FindBy(id = "password")
	WebElement testField_Login_Password;

	@FindBy(id = "submit")
	WebElement btn_TestLoginPage_Submit;
	
	@FindBy(id = "error")
	WebElement errorText;
	
	@FindBy(xpath = "//a[text()='Log out']")
	WebElement btnLogout;

	public void setUserName(String username) {
		//driver.findElement(testField_Login_Username).sendKeys(username); //
		testField_Login_Username.sendKeys(username);
		 
	}

	public void setPassword( String password) {
		//txtPassword.clear();
		 //driver.findElement(testField_Login_Password).sendKeys( password); //
		 testField_Login_Password.sendKeys( password);
	}

	public void clickLogin() {
		//driver.findElement(btn_TestLoginPage_Submit).click();
		btn_TestLoginPage_Submit.click();
	}
	public String getErrorText() {
		String ErrorMsgText =errorText.getText();
		return ErrorMsgText;
	}
	
	public void clickOnLogoutBtn() {
		btnLogout.click();
	}
	
	
}