package WebDriverInterrogationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		//fetchng the 32 char session id
		System.out.println(driver.getWindowHandle());
		//refreshing the page
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://www.orangehrmlive.com/");
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandle());
		driver.navigate().to("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandle());
		driver.quit();
	}
	

}
