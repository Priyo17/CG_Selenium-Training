package com.panimalarclg.orangehrm.pim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AdminManagement {
	WebDriver driver=null;
	
	@Test(priority=0)
	public void LaunchingBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@Test(priority=1, dependsOnMethods="LaunchingBrowser")
	public void Login() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Login with valid credentials
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();		
		
	}
	@Test(priority=2, dependsOnMethods="Login")
	public void NavigateToPIM() {
		driver.findElement(By.linkText("PIM")).click();
	}
	
	@Test(priority=3, dependsOnMethods="NavigateToPIM")
	public void addBtn() {
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	}
	
	@Test(priority=4, dependsOnMethods="addBtn")
	public void AddingDetails() throws InterruptedException {
		//enter firstname , middlename , lastname
		driver.findElement(By.name("firstName")).sendKeys("APJ");
		driver.findElement(By.name("middleName")).sendKeys("Abdul");
		driver.findElement(By.name("lastName")).sendKeys("Kalam");
		driver.findElement(By.className("oxd-switch-input oxd-switch-input--active --label-right")).click();
		
	
	}

}
