package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//locate FB link
		driver.findElement(By.linkText("Facebook")).click();
		
		
//		WebDriver driver  = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Gmail")).click();
		
		
	}
	

}
