package com.stad.testautomationpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// [With out using page factory]

	// constructor
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		// using page factory
		PageFactory.initElements(driver, this); // mandatory every time we have to add this line in constructor for
												// pageFactory Test Approch
	}

	// locators / webelements
	// By link_home_practice = By.xpath("//a[text()='Practice']");

	// using page factory
	@FindBy(xpath = "//a[text()='Practice']")
	WebElement link_home_practice;

	// Action Methods
	public void clickOnPracticeLink() {
		// driver.findElement(link_home_practice).click();

		// using page factory
		link_home_practice.click();
	}

}
