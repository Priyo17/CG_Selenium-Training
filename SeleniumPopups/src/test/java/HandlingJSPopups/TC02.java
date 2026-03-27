package HandlingJSPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//click on search button
		driver.findElement(By.cssSelector("[value='Search']")).click();
		//handling the popup
		driver.switchTo().alert().accept();
		//type computers in the search textfield
		driver.findElement(By.cssSelector("[id='small-searchterms']")).sendKeys("computers");
		Thread.sleep(2000);
		//click on search button
		driver.findElement(By.cssSelector("[value='Search']")).click();

	}

}
