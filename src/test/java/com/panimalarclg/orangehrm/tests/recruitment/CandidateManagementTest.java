package com.panimalarclg.orangehrm.tests.recruitment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CandidateManagementTest {
	WebDriver driver = null;
	
	@Test(priority=0)
	public void Login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Navigating to orangehrm
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Login with valid credentials
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}
	
	@Test(priority=1, dependsOnMethods="Login")
	public void NavigateToRecruitment() {
		driver.findElement(By.linkText("Recruitment")).click();
	}
	
	@Test(priority=2, dependsOnMethods="NavigateToRecruitment")
	public void Addbutton() {
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	}
	
	@Test(priority=3, dependsOnMethods="Addbutton")
	public void AddingDetails() {
		//enter firstname , middlename , lastname
		driver.findElement(By.name("firstName")).sendKeys("APJ");
		driver.findElement(By.name("middleName")).sendKeys("Abdul");
		driver.findElement(By.name("lastName")).sendKeys("Kalam");
		//select any option for vacancy
		WebElement drop = driver.findElement(By.xpath("//div[text()='-- Select --']"));
		Actions action = new Actions(driver);
		action.moveToElement(drop)
	       .click()
	       .pause(Duration.ofSeconds(4))
	       .keyDown(Keys.DOWN)
	       .keyDown(Keys.DOWN)
	       .keyDown(Keys.ENTER)
	       .perform();
		

		driver.findElement(By.xpath("//label[text()='Email']/../..//input")).sendKeys("apj@gmail.com");
		driver.findElement(By.xpath("//label[text()='Contact Number']/../..//input")).sendKeys("1234567890");
		WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
		upload.sendKeys("C:\\Users\\Admin\\Downloads\\Priyanka_ID.pdf");
		
		//select date of application
		
		//click on save button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@Test(priority=4, dependsOnMethods="AddingDetails")
	public void candidate() {
		//click on candidates
		driver.findElement(By.linkText("Candidates")).click();
		
		//select job title
		WebElement Jobdropdown = driver.findElement(By.xpath("//label[.='Job Title']/../..//div[@class='oxd-select-text--after']"));
		Actions actions = new Actions(driver);

		actions.moveToElement(Jobdropdown)
		       .click()
		       .pause(Duration.ofSeconds(4))
		       .keyDown(Keys.DOWN)
		       .keyDown(Keys.DOWN)
		       .keyDown(Keys.ENTER)
		       .perform(); 
		
		//select vacancy
				WebElement vacancydropdown = driver.findElement(By.xpath("//label[.='Vacancy']/../..//div[@class='oxd-select-text--after']"));
				Actions actions1 = new Actions(driver);

				actions1.moveToElement(vacancydropdown)
				       .click()
				       .pause(Duration.ofSeconds(4))
				       .keyDown(Keys.DOWN)
				       .keyDown(Keys.DOWN)
				       .keyDown(Keys.ENTER)
				       .perform(); 
				
				//select vacancy
				WebElement hiringmgrdropdown = driver.findElement(By.xpath("//label[.='Hiring Manager']/../..//div[@class='oxd-select-text--after']"));
				Actions actions2 = new Actions(driver);

				actions2.moveToElement(hiringmgrdropdown)
				       .click()
				       .pause(Duration.ofSeconds(4))
				       .keyDown(Keys.DOWN)
				       .keyDown(Keys.DOWN)
				       .keyDown(Keys.DOWN)
				       .keyDown(Keys.ENTER)
				       .perform(); 
				//select status
				WebElement statusdropdown = driver.findElement(By.xpath("//label[.='Hiring Manager']/../..//div[@class='oxd-select-text--after']"));
				Actions actions3 = new Actions(driver);

				actions3.moveToElement(statusdropdown)
				       .click()
				       .pause(Duration.ofSeconds(4))
				       .keyDown(Keys.DOWN)
				       .keyDown(Keys.DOWN)
				       .keyDown(Keys.DOWN)
				       .keyDown(Keys.ENTER)
				       .perform(); 
				
				//enter candidate name
				driver.findElement(By.cssSelector("[placeholder='Type for hints...']")).sendKeys("APJ");
				driver.findElement(By.xpath("//div[@role='option']//span[text()='APJ Abdul Kalam']")).click();
				
				//select From application date 
				driver.findElement(By.cssSelector("[placeholder='From']")).click();
				//selecting the date 13 from calendar
				driver.findElement(By.xpath("//div[text()='13']")).click();
				
				
				
				//click on search button 
				driver.findElement(By.xpath("//button[text()=' Search ']")).click();

		
	}
	           @Test(priority=5, dependsOnMethods="candidate")
	           public void verify() {
	        	//verify whether the employee is added from the records found section and logout.
	        	   if(driver.getPageSource().contains("APJ")) {
	        		   Reporter.log("Employee is add", true);
	        	   }else {
	        		   Reporter.log("Employee is not added", true);
	        	   }
	           }
	

}
