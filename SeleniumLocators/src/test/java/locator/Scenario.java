package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		//login-typing names
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(4000);
		//login button
		driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(4000);
		//go to recruitment
		driver.findElement(By.linkText("Recruitment")).click();
		Thread.sleep(4000);
		//go to add option
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(4000);
		//entering firstname
		driver.findElement(By.name("firstName")).sendKeys("Laxman");
		//entering lastname
		driver.findElement(By.name("lastName")).sendKeys("R U");
		Thread.sleep(4000);
		
	}

}
