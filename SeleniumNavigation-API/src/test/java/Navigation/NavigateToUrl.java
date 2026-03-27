package Navigation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToUrl {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigating to amazon
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		
		//navigating to flipkart
		URL url1 = new URL("https://www.flipkart.com/");
		driver.navigate().to(url1);
		Thread.sleep(2000);
		
		//navigating to uber eats
		driver.navigate().to(new URL("https://www.ubereats.com/?srsltid=AfmBOops6bOL6xP5UYLXM7HZIb_mhylKioOkT1UrTtDfOW9yPv6y-7w5"));
		Thread.sleep(2000);
		driver.quit();
	}

}
