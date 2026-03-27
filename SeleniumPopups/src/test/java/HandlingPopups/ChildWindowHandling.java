package HandlingPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		
		//Clicking on view more of laptops
		driver.findElement(By.xpath("//h2[.='Laptop']/..//button")).click();
		//swicthing the tool control to child window to perform actions on its web elements
		String parentId = driver.getWindowHandle();
		Set<String> allwindowIds = driver.getWindowHandles();
		allwindowIds.remove(parentId);
		for(String childId: allwindowIds) {
			//Switching the tool control to the child window popup
			driver.switchTo().window(childId);
			
		}
		//click on add to cart
		WebElement addtocart = driver.findElement(By.tagName("button"));
		addtocart.click();
		addtocart.click();
		Thread.sleep(2000);
		//click on cart logo
		WebElement cartlogo = driver.findElement(By.xpath("//*[local-name()='svg']"));
		cartlogo.click();
		Thread.sleep(2000);
		//verify if the shopping list is visible
		WebElement shoppingCartList = driver.findElement(By.tagName("h2"));
		if(shoppingCartList.isDisplayed()) {
			System.out.println("Test case status: pass");
		}else {
			System.out.println("Test case status: fail");
		}
		//close the popup
		driver.close();

		
}

}
