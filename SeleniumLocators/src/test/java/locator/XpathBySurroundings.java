package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBySurroundings {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/duplicate?sublist=0&scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Samsung']/..//input")).click();
		driver.findElement(By.xpath("//label[.=' RedMi ']/..//input")).click();
		}

}
