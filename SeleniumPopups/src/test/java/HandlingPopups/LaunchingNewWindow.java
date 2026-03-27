package HandlingPopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingNewWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);
		
		//Triggering a new window in the same browser window and parallely switching the tool control to new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://github.com/");
		System.out.println(driver.getTitle());
	}

}
