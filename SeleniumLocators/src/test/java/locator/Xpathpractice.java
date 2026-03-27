package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/login1.0?sublist=0&scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\'Username:']")).sendKeys("User");
		driver.findElement(By.xpath("//input[@placeholder=\'Password']")).sendKeys("pass");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		
		
	}

}
