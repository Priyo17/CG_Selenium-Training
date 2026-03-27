package Demo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.orangehrm.seleniumframework.object_repository.DashboardPage;
import com.orangehrm.seleniumframework.object_repository.LoginPage;
import com.orangehrm.seleniumuiframework.genericutility.WebDriverUtility;

public class CaptureScreenshot {
	@Test(invocationCount=2)
	public void screenShot() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverUtility wu = new WebDriverUtility(driver);
		LoginPage lp = new LoginPage(driver);
		DashboardPage dp = new DashboardPage(driver);
		
		//Creating a method for time-stamp
		String timeStamp = new SimpleDateFormat("yyyy-mm-dd[hh-mm-ss]").format(new Date());
		
		wu.configMaximizedBrowser();
		wu.waitForElementsToLoad(20);
		wu.navigateToApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp.login("Admin", "admin123");
		Thread.sleep(2000);
		
		//Capture the screenshot og home page
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp=  ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("./Reports/dashboard.png"+timeStamp+".png");
		FileHandler.copy(temp, perm);
		
		//Capture the screenshot of WebElement
		WebElement recruitmentLink = dp.getRecruitmentLink();
		File tempsrc = recruitmentLink.getScreenshotAs(OutputType.FILE);
		File permTrg = new File("./Reports/recruitmentLink.png"+timeStamp+".png");
		FileHandler.copy(tempsrc, permTrg);
		
	}

}
