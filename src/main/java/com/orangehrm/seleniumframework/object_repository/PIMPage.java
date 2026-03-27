package com.orangehrm.seleniumframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {
	WebDriver driver;
	public PIMPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "[class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addButton;

	public WebElement getAddButton() {
		return addButton;
	}

	public void clickAddButton() {
		getAddButton().click();
	}
	
	
	
	
}