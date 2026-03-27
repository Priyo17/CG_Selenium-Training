package webDriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetMethod {
	public static void main(String[] args) throws InterruptedException {
		//launching the browser
		
		WebDriver driver = new ChromeDriver();
		
		//navigating to youtube
		driver.get("https://www.amazon.com/");
		//fetching the title of webpage
		//wait statement
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		
		
		}

}
