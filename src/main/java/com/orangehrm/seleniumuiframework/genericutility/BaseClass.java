package com.orangehrm.seleniumuiframework.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.orangehrm.seleniumframework.object_repository.DashboardPage;
import com.orangehrm.seleniumframework.object_repository.LoginPage;


@Listeners(com.orangehrm.seleniumuiframework.genericutility.ListenersImplementation.class)
public class BaseClass {
	public WebDriver driver;
	private String Browser;
	LoginPage lp;
	FileUtility fiu = new FileUtility();
	WebDriverUtility wdu;
	DashboardPage dsp;
	
	@BeforeSuite
	public void configBeforeSuite() {
		Reporter.log("---Executing before suite---", true);
	}
	
	@BeforeTest
	public void configBeforeTest() {
		Reporter.log("---Executing before test---", true);
	}
	
	@Parameters("BROWSER")
	
	@BeforeClass(groups= {"Regression","Smoke"})
	public void configBeforeClass() throws IOException {
		Reporter.log("----Executing before class---", true);
		
		Browser = fiu.getPropertyKeyValue("browser");
		if(Browser.contains("chrome")) {
			driver=new ChromeDriver();
		}
		else if(Browser.contains("edge")) {
			driver= new EdgeDriver();
		}
		else if(Browser.contains("firefox")){
			driver = new FirefoxDriver();
		}
		wdu = new WebDriverUtility(driver);
		lp = new LoginPage(driver);
		dsp= new DashboardPage(driver);
		wdu.configMaximizedBrowser();
		wdu.waitForElementsToLoad(30);
		
	}
	
	@BeforeMethod
	public void configBeforeMethod() throws IOException {
		Reporter.log("-- Navigating to the application and login --", true);
		
		String URL = fiu.getPropertyKeyValue("url");
		String ValidUsername = fiu.getPropertyKeyValue("username");
		String ValidPassword = fiu.getPropertyKeyValue("password");
		//login
		wdu.navigateToApplication(URL);
		lp.login(ValidUsername, ValidPassword);
	}
	
	@AfterMethod
	public void configAfterMethod() {
		Reporter.log("----Executing after method----", true);
		dsp.logout();
	}
	
	@AfterClass
	public void configAfterClass() {
		Reporter.log("-----Executing after class-----", true);
		wdu.closingBrowserWindow();
	}
	
	@AfterTest
	public void configAfterTest() {
		Reporter.log("---Executing after test-----", true);
		
	}
	
	@AfterSuite
	public void configAfterSuite() {
		Reporter.log("-----Executing after suite---", true);
	}

}