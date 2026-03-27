package Demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orangehrm.seleniumframework.object_repository.LoginPage;
import com.orangehrm.seleniumuiframework.genericutility.FileUtility;
import com.orangehrm.seleniumuiframework.genericutility.WebDriverUtility;

public class LoginTest {
	
	@Test
	public void login() throws IOException {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/login_report.html");
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("Login Test");
		
		WebDriver driver = new ChromeDriver();
		WebDriverUtility wu = new WebDriverUtility(driver);
		FileUtility fu = new FileUtility();
		LoginPage lp = new LoginPage(driver);
		wu.configMaximizedBrowser();
		wu.waitForElementsToLoad(20);
		String urlPath = fu.getPropertyKeyValue("url");
		String un = fu.getPropertyKeyValue("username");
		String pass = fu.getPropertyKeyValue("password");
		
		//Navigating to application
		wu.navigateToApplication(urlPath);
		
		//Both are same
		test.log(Status.INFO, "Navigated to OrangeHRM login page");
		//test.info("Navigated to OrangeHRM login page");
		lp.login(un, pass);
		
		//Both are same
		//test.log(Status.PASS, "Login Successful");
		test.pass("Login Successful");
		extent.flush();
		
	}
	

}
