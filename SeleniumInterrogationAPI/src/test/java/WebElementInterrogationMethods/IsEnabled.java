package WebElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/34");
		Thread.sleep(15000);
		WebElement checkbtn = driver.findElement(By.id("Check"));
		//verifing if the buttn is enabled
		System.out.println("Is my check button enabled: "+checkbtn.isEnabled());
		
				
	}

}
