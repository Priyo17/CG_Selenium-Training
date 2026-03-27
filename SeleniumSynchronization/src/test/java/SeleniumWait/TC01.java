package SeleniumWait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Facebook")).click();
		
		driver.findElement(By.linkText("Twitter")).click();
		driver.findElement(By.linkText("YouTube")).click();
		Set<String> allIds = driver.getWindowHandles();
		allIds.remove(driver.getWindowHandle());
		for(String child: allIds) {
			driver.switchTo().window(child);
			if(driver.getCurrentUrl().contains("youtube")) {
				driver.findElement(By.cssSelector("[name=\'search_query\']")).sendKeys("Song");
				
				
			}
		}
		
		
	}

}
