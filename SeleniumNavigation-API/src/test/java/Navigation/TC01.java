package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//type automation in search
		driver.findElement(By.className("gLFyf")).sendKeys("Automation");
		Thread.sleep(2000);
		
		//navigate to amazon.in
		driver.navigate().to("https://www.amazon.in/");
		
		//verifying the title
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		//writijng tools in search
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tools");
		Thread.sleep(2000);
		
		//refreshing the page
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//navigate back
		driver.navigate().back();
		//verify title
		System.out.println(driver.getTitle());
	}

}
