package HandlingJSPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TC01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(4000);
		
		//search for dresses
		WebElement search = driver.findElement(By.className("desktop-searchBar"));
		search.sendKeys("Dresses");
		WebElement searchbtn = driver.findElement(By.className("desktop-submit"));
		searchbtn.click();
		WebElement prod = driver.findElement(By.cssSelector("[title='Marks & Spencer Girls Tie-Dye Printed Fit & Flare Dress']"));
		prod.click();
		Thread.sleep(4000);
		
		String parentId = driver.getWindowHandle();
		Set<String> allwindowId = driver.getWindowHandles();
		allwindowId.remove(parentId);
		for(String childid: allwindowId) {
			driver.switchTo().window(childid);
		}
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//span[text()='WISHLIST']"));
		login.click();
		
		if(login.isDisplayed()) {
			System.out.println("Test case: pass");
		}
		else {
			System.out.println("Test case is failed");
		}
	}

}
