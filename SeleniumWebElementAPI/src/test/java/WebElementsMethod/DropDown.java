package WebElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import java.net.http.WebSocket;

import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(4000);
		WebElement dropdown = driver.findElement(By.id("Skills"));
		dropdown.click();
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("[value=\'C\']")).click();
//		Thread.sleep(2000);
		dropdown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
		
	}

}
