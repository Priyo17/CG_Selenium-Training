package RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Learning1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
//		Thread.sleep(2000);
//		WebElement name = driver.findElement(By.id("name"));
//		name.sendKeys("abc");
//		Thread.sleep(2000);
//		WebElement email = driver.findElement(RelativeLocator.with(By.tagName("input")).below(name));
//		email.sendKeys("abc@gmail.com");
//		Thread.sleep(2000);
//		WebElement pw = driver.findElement(RelativeLocator.with(By.tagName("input")).below(email));
//		pw.sendKeys("abc12345");
//		Thread.sleep(2000);
//		WebElement btn = driver.findElement(RelativeLocator.with(By.tagName("button")).below(pw));
//		btn.click();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.cssSelector("[placeholder=\'First Name\']"));
		name.sendKeys("abc");
		WebElement lname = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(name));
		lname.sendKeys("hub");
		Thread.sleep(2000);

		WebElement add = driver.findElement(RelativeLocator.with(By.cssSelector("[ng-model=\"Adress\"]")).below(lname));
		add.sendKeys("ghdjdk");
		
	}

}
