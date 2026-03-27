package webDriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//clicking on fb in the follow us section
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		//clicking twitter in the follow us section
		driver.findElement(By.linkText("Twitter")).click();
		Thread.sleep(2000);
		driver.quit();//closes entire browser
		driver.close();//closes only main selenium controlled webpage		
		}

}
