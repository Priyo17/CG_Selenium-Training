package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameMethod {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//locating all the links in the page
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//fetch the name of each link
		for(WebElement link: allLinks) {
			System.out.println(link.getText());
		}
		
		for(WebElement i: allLinks) {
			if(i.getText().contains("Store")) {
				i.click();
				break;
			}
			
		}
		
		
	}

}
