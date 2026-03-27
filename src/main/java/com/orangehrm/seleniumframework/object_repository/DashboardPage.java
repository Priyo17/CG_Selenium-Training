package com.orangehrm.seleniumframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "PIM")
	private WebElement pimLink;
	
	@FindBy(css="li[class='oxd-userdropdown']")
	private WebElement logoutDropDown;
	
	@FindBy(linkText="Recruitment")
	private WebElement recruitmentLink;
	
	@FindBy(linkText="Logout")
	private WebElement logOutLink;

	public WebElement getPimLink() {
		return pimLink;
	}

	public void clickPimLink() {
		getPimLink().click();
	}

	public WebElement getLogoutDropDown() {
		return logoutDropDown;
	}

	public void clickLogoutDropDown() {
		getLogoutDropDown().click();
	}

	public WebElement getRecruitmentLink() {
		return recruitmentLink;
	}

	public void clickRecruitmentLink() {
		getRecruitmentLink().click();
	}
	
	public WebElement getLogoutLink() {
		return logOutLink;
	}
	public void clickLogoutLink() {
		getLogoutLink().click();
	}
	public void logout() {
		clickLogoutDropDown();
		clickLogoutLink();
	}
	
	
	
}