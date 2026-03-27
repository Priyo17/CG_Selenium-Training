package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Test3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.cssSelector("[onclick='submitLogin();return false;']")).click();
		//validating successful login
		if(driver.getCurrentUrl().contains("dashboard")) {
			System.out.println("Successful login");
		}else {
			System.out.println("Unsuccessful login");
		}
		
		//Navigate to Employees section
		driver.findElement(By.linkText("Employees")).click();
		driver.findElement(By.xpath("//a[contains(.,' Employees                                        ')]")).click();
		
		// Click on filter employees
		driver.findElement(By.xpath("//span[contains(.,'Filter Employees')]")).click();
		
		WebElement dropdown = driver.findElement(By.cssSelector("[id='rc_select_5']"));
//		Select scl = new Select(dropdown);
//		scl.selectByIndex(0);
		dropdown.click();
		
		//Select a specific department
		driver.findElement(By.cssSelector("[class='ant-select-item ant-select-item-option ant-select-item-option-active']")).click();
		
		
	//Click save button.
		driver.findElement(By.xpath("//div[@id='rc_unique_3']/../..//span[.='Save']")).click();
		
		
		// Validate that the employee table displays only employees belonging to the selected department.
		
		
		//Navigate to filter employees Change the job title 
		driver.findElement(By.cssSelector("[class='ant-btn css-dev-only-do-not-override-240cud ant-btn-dashed ant-btn-color-default ant-btn-variant-dashed']")).click();
		
		//
		driver.findElement(By.id("rc_select_8")).click();
		driver.findElement(By.cssSelector("[title='Project Manager']")).click();
		driver.findElement(By.xpath("//div[@id='rc_unique_3']/../..//span[.='Save']")).click();
		//logout
		driver.findElement(By.xpath("(//span[contains(.,'IceHrm ')])[1]")).click();
		driver.findElement(By.linkText("Sign out")).click();

		

	}

}
