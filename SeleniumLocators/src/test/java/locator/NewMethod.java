package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(8000);
		//locating the name text field
		driver.findElement(By.name("username")).sendKeys("Admin");
		//locating  Password textfield
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//navigating to google
		driver.get("https://www.google.com/");
		Thread.sleep(8000);
		//locate search text field
		driver.findElement(By.name("q")).sendKeys("Pec");
	}

}
