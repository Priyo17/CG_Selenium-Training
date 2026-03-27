package WebElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(10000);
		WebElement radio = driver.findElement(By.id("pollanswers-2"));
		//verify the button is selected 
		
		System.out.println("Is the Good button selected: "+radio.isSelected());
		radio.click();
		Thread.sleep(10000);
		System.out.println("Is the Good button selected: "+radio.isSelected());
		driver.quit();

		
	}

}
