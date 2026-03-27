package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(WebElement username) {
		username.sendKeys(un);
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		password.sendKeys(pwd);
	}
	public By getLoginBtn() {
		return loginBtn;
	}
	//username
	WebElement username = By.id("user-name");
	
	//password
	WebElement password = By.id("password");
	//login btn
	By loginBtn = By.id("login-button");
	//Business login(login action)
	public void enterUsername(String un) {
		driver.findElement(username).sendKeys(un);
	}
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}

}
