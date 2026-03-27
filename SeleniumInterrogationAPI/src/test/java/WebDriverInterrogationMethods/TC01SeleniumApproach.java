package WebDriverInterrogationMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01SeleniumApproach {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Twitter")).click();
		Set<String> allwindows = driver.getWindowHandles();
		for(String s:allwindows) {
			driver.switchTo().window(s);
			String title = driver.getTitle();
			Thread.sleep(2000);
			System.out.println("id"+s);
			System.out.println("title"+title);
			
		}
		
	}

}
