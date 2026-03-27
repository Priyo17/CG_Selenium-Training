package WebDriverInterrogationMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser");
		Thread.sleep(2000);
		
		//fetching the window id of parent window
		String parentId= driver.getWindowHandle();
		System.out.println("This is the window Id of the parent Window: "+parentId);
		//click on a tab to get Child window Popup and printing it
		driver.findElement(By.xpath("//h2[.='Watches']/..//button")).click();
		Thread.sleep(2000);
		Set<String> allWindowids = driver.getWindowHandles();
		System.out.println("Window ids of both Parent and Child Window: "+allWindowids);
		//Removing parent id from all window ids
		allWindowids.remove(parentId);
		System.out.println(allWindowids);
		for(String string: allWindowids) {
			System.out.println("Window id of child Window: "+string);
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
