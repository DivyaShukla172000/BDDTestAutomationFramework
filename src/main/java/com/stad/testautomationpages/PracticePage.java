package com.stad.testautomationpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePage {

	// [With out using page factory]

	// constructor
	WebDriver driver;

	public PracticePage(WebDriver driver) {
		this.driver = driver;
		// using page factory
		PageFactory.initElements(driver, this); // mandatory every time we have to add this line in constructor for
												// pageFactory Test Approch

	}

	// locators/webelements
	// By link_practicePage_TestLoginPage = By.xpath("//a[text()='Test Login
	// Page']");
	@FindBy(xpath = "//a[text()='Test Login Page']")
	WebElement link_practicePage_TestLoginPage;

	@FindBy(xpath = "//a[normalize-space()='Test Exceptions']")
	WebElement Exception_link;
	
	// Action Methods
	public void clickOnTesLoginPageLink() {
		// driver.findElement(link_practicePage_TestLoginPage).click();
		link_practicePage_TestLoginPage.click();
	}
	
	public void clickOnExceptionLink() {
		Exception_link.click();
	}
}
