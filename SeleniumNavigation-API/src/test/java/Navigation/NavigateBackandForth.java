package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackandForth {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to Myntra
		driver.get("https://www.myntra.com/dresses?f=Gender%3Amen%20women%2Cwomen");
		Thread.sleep(2000);
		//Navigate to BigBasket
		driver.navigate().to("https://www.bigbasket.com/");
		Thread.sleep(2000);
		//navigate to ajio
		driver.navigate().to("https://www.ajio.com/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
	}

}
