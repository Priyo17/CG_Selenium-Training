package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		//login-typing names
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(4000);
		//click to login
		driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(4000);
		//go to pim module
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(4000);
		//enter employee name
		driver.findElement(By.xpath("//label[.='Employee Name']/../..//input[@placeholder='Type for hints...']")).sendKeys("Emily");
		Thread.sleep(4000);
		//navigate to suggestion
		//driver.findElement(By.xpath(""))
	
		
	}

}
