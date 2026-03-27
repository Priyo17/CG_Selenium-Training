package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
	 public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://icehrmpro.gamonoid.com/login.php");
			driver.findElement(By.id("username")).sendKeys("abc");
			driver.findElement(By.id("password")).sendKeys("abc123");
			driver.findElement(By.cssSelector("[onclick='submitLogin();return false;']")).click();
			
			//Validate that the application displays invalid credential error message
			if(driver.findElement(By.cssSelector("[class='alert alert-danger']")).isDisplayed()){
				System.out.println("Error msg is displayed");
				
			}else {
				System.out.println("Error msg is not diplayed");
			}
			
			
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("admin");
			driver.findElement(By.cssSelector("[onclick='submitLogin();return false;']")).click();
			
			
			//Validate successful login by verifying the Dashboard page
			if(driver.getCurrentUrl().contains("dashboard")) {
				System.out.println("Successful login");
			}else {
				System.out.println("Unsuccessful login");
			}
			
			//Navigate to Employees section(left side menu)
			driver.findElement(By.linkText("Employees")).click();
			driver.findElement(By.xpath("//a[contains(.,' Employees                                        ')]")).click();
			
			//Click on Skills
			driver.findElement(By.linkText("Skills")).click();
			
			//Click on Add new
			driver.findElement(By.xpath("(//button[@class='ant-btn css-dev-only-do-not-override-240cud ant-btn-primary ant-btn-color-primary ant-btn-variant-solid'])[2]")).click();
			
			

			//closing the appeared dialog box
			
			driver.findElement(By.cssSelector("[class='ant-modal-close-x']")).click();
			driver.findElement(By.xpath("(//span[contains(.,'IceHrm ')])[1]")).click();
			//logout
			driver.findElement(By.linkText("Sign out")).click();
			


	}

}
