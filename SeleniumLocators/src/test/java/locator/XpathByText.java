package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {
	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
//		Thread.sleep(2000);
//		//clicking on xpath
//		driver.findElement(By.xpath("//section[.='X Path']")).click();
//		Thread.sleep(1000);
//		//login 3.0
//		driver.findElement(By.xpath("//section[.='Login 3.0']")).click();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		//Thread.sleep(2000);
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement i:radio ) {
			Thread.sleep(2000);
			i.click();
		}
	}

}
