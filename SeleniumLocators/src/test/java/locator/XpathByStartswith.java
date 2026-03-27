package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByStartswith {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[starts-with(text(),'Di')]")).click();
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@title,'Sea')]")).click();
		driver.findElement(By.xpath("//input[starts-with(@title,'Sea')]")).sendKeys("Books");

	}

}
