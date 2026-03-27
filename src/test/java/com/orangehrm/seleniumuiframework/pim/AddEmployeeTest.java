package com.orangehrm.seleniumuiframework.pim;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.orangehrm.seleniumframework.object_repository.AddEmployeePage;
import com.orangehrm.seleniumframework.object_repository.DashboardPage;
import com.orangehrm.seleniumframework.object_repository.LoginPage;
import com.orangehrm.seleniumframework.object_repository.PIMPage;

public class AddEmployeeTest {
	WebDriver driver;
	
	@Test
	private void addNewEmployee() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		DashboardPage dbp = new DashboardPage(driver);
		PIMPage pim = new PIMPage(driver);
		AddEmployeePage aemp = new AddEmployeePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Login
		lp.login("Admin", "admin123");
		//PIM
		dbp.clickPimLink();
		pim.clickAddButton();
		//add emp
		aemp.addEmployee("Abcde", "j", "Pqrst", "12345");
		//wait.until(expectedConditions.visibilityOf(aemp.getUserName());
		//after toggle
		aemp.createcredentials("User1", "Pass@123");
		
	}
	

}
