package com.orangehrm.seleniumframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoLoginPage {
	WebDriver driver;
	public DemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		//lazy iniatilization to avoid staleelemtnref exception
	}
	
	@FindBy(name="username")
	private WebElement userName;
	//making it private to encapsulate it , so it shouldnt be used outside the class
	
	@FindBy(name="password")
	private WebElement passWord;
	
	@FindBy(css="[type='submit']")
	private WebElement login;

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(WebElement userName) {
		getUserName().sendKeys("Admin");
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public void setPassWord(WebElement passWord) {
		getPassWord().sendKeys("admin123");
	}

	public WebElement clickLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		clickLogin().click();
	}
	
	

}
