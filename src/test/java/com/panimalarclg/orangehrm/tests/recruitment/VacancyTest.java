package com.panimalarclg.orangehrm.tests.recruitment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class VacancyTest {
		WebDriver driver =null;
		@Test(priority=0)
		public void launchingBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		//login to orangehrm
		//Login with valid credentials
		
		@Test(priority=1, dependsOnMethods="launchingBrowser")
		public void login() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		}
		
		
		@Test(priority=2, dependsOnMethods="login")
		public void ClickRecruitment() {
		//go to recruitment
		driver.findElement(By.linkText("Recruitment")).click();
		}
		
		@Test(priority=3, dependsOnMethods="ClickRecruitment")
		public void clickVacancy() {		
		//click on vacancies
		driver.findElement(By.linkText("Vacancies")).click();
		
		}
		
		@Test(priority=4, dependsOnMethods="clickVacancy")
		public void Addbutton() {
			driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		}
		
		
		@Test(priority=5, dependsOnMethods="Addbutton")
		public void addingDetails() {
		//enter vacancy name , select job title,add description , select hiring manager, number of positions
			
		driver.findElement(By.xpath("//label[text()='Vacancy Name']/../..//input")).sendKeys("ABC");
		WebElement Jobdropdown = driver.findElement(By.xpath("//label[.='Job Title']/../..//div[@class='oxd-select-text--after']"));
		Actions actions = new Actions(driver);

		actions.moveToElement(Jobdropdown)
		       .click()
		       .pause(Duration.ofSeconds(4))
		       .keyDown(Keys.DOWN)
		       .keyDown(Keys.ENTER)
		       .perform();
		
		driver.findElement(By.cssSelector("[placeholder='Type description here']")).sendKeys("abcefghijklmnopqrstuvwxyz");
		
		//hiring manager
		WebElement HiringMgr = driver.findElement(By.xpath("//label[text()='Hiring Manager']/../..//input"));
		//HiringMgr.sendKeys("John");
		Actions actions1 = new Actions(driver);

		actions1.moveToElement(HiringMgr)
		       .click().sendKeys("A")
		       .pause(Duration.ofSeconds(6))
		       .keyDown(Keys.DOWN)
		       .keyDown(Keys.ENTER)
		       .perform();
		//number of pos
		driver.findElement(By.xpath("//label[text()='Number of Positions']/../..//input")).sendKeys("2");		
		}
		@Test(priority=6, dependsOnMethods="addingDetails")
		public void SaveBtn() {
		//clicking on save button
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		
		}

	}


