package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByaxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = new FirefoxDriver();
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@data-productid='31']/child::div[@class='details']/child::div[@class='add-info']/child::div[@class=\'buttons\']/child::input")).click();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='For Your Dream Europe Trip: Get Up to 40%OFF*']/parent::div/parent::div/following-sibling::div/child::div/child::a")).click();
		//driver.findElement(By.xpath("data-cy=\"superOfferCtaText1\"")).click();	
	}

}
