package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class UsingFluentWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/products_page/57");
		driver.findElement(By.id("Check Delivery")).sendKeys("123456");
		WebElement checkBtn = driver.findElement(By.id("Check"));
		
		//Giving a fluent wait to check if the condition is satisfied
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.withTimeout(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(checkBtn));
		
		checkBtn.click();
	}

}
