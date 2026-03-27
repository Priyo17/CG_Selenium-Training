package com.orangehrm.seleniumframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {
	WebDriver driver;
	public AddEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	@FindBy(name="firstName")
	private WebElement firstName;
	
	@FindBy(name="middleName")
	private WebElement middleName;
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	@FindBy(xpath="//label[.='Employee Id']/../..//input")
	private WebElement empId;
	
	@FindBy(css="[class='oxd-switch-input oxd-switch-input--active --label-right']")
	private WebElement toggleBtn;
	
	@FindBy(xpath="//label[.='Username']/../..//input")
	private WebElement userName;
	
	@FindBy(xpath="//label[.='Password']/../..//input")
	private WebElement passWord;
	
	@FindBy(xpath="//label[.='Confirm Password']/../..//input")
	private WebElement confirmPassword;
	
	@FindBy(css="[type='submit']")
	private WebElement saveBtn;
	
	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		getFirstName().sendKeys(firstName);
	}

	public WebElement getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		getMiddleName().sendKeys(middleName);

	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		getLastName().sendKeys(lastName);
	}

	public WebElement getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		getEmpId().sendKeys(empId);
	}

	public WebElement getToggleBtn() {
		return toggleBtn;
	}

	public void clickToggleBtn() {
		getToggleBtn().click();
	}

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		getUserName().sendKeys(userName);
	}
	

	public WebElement getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		getPassWord().sendKeys(passWord);
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		getConfirmPassword().sendKeys(confirmPassword);
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void clickSaveBtn() {
		getSaveBtn().click();
	}
	//business logic to add employee
	public void addEmployee(String firstName, String middleName, String lastName,String empId) {
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
		setEmpId(empId);
		clickToggleBtn();
	}
	
	//create credentials
	public void createcredentials(String userName, String password) {
		setUserName(userName);
		setPassWord(password);
		setConfirmPassword(password);
		clickSaveBtn();
	}
	
	
	

}
