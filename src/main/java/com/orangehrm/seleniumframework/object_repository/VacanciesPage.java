package com.orangehrm.seleniumframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VacanciesPage {
	WebDriver driver;

	
	public VacanciesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="[class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addbtn;

	public WebElement getAddbtn() {
		return addbtn;
	}

	public void clickAddbtn() {
		getAddbtn().click();
	}
	
	

}
