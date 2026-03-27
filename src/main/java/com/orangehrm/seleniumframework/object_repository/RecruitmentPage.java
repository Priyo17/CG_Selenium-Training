package com.orangehrm.seleniumframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {
	WebDriver driver;

	public RecruitmentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="[class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addBtn;
	
	@FindBy(linkText="Vacancies")
	private WebElement vacanciesLink;
	
	@FindBy(name="firstName")
	private WebElement firstName;
	
	@FindBy(name="middleName")
	private WebElement middleName;
	
	@FindBy(name="lastname")
	private WebElement lastName;
	
	@FindBy(xpath="//label[text()='Email']/../..//input")
	private WebElement email;
	
	@FindBy(xpath="//label[text()='Contact Number']/../..//input")
	private WebElement mobNo;
	
	@FindBy(xpath="//input[@type='file']")
	private WebElement fileUpload;
	
	
	
	public WebElement getAddBtn() {
		return addBtn;
	}
	public void clickAddBtn() {
		getAddBtn().click();
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		getFirstName().sendKeys(firstName);
	}
	public WebElement getMiddleName() {
		return middleName;
	}
	public void setMiddleName(WebElement middleName) {
		this.middleName = middleName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getMobNo() {
		return mobNo;
	}
	public void setMobNo(WebElement mobNo) {
		this.mobNo = mobNo;
	}
	public WebElement getFileUpload() {
		return fileUpload;
	}
	public void setFileUpload(WebElement fileUpload) {
		this.fileUpload = fileUpload;
	}
	public WebElement getVacanciesLink() {
		return vacanciesLink;
	}
	public void clickVacanciesLink() {
		getVacanciesLink().click();
	}
	

	
}
