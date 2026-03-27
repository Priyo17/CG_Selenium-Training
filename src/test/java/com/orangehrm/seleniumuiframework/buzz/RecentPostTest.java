package com.orangehrm.seleniumuiframework.buzz;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RecentPostTest {
	WebDriver driver;
	@Test
	public void RecentPost() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		//buzz link
		driver.findElement(By.linkText("Buzz")).click();
		driver.findElement(By.cssSelector("[class='oxd-buzz-post-input']")).sendKeys("");

		
	}

}
