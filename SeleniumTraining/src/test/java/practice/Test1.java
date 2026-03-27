package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login?utm_source=chatgpt.com");
		WebElement hyper =driver.findElement(By.linkText("OrangeHRM, Inc"));
		String parentId = driver.getWindowHandle();
		hyper.click();
		Set<String> allwindow = driver.getWindowHandles();
		for(String all: allwindow) {
			if(!all.equals(parentId)) {
				driver.switchTo().window(all);
			}
		}
		  
		 
		 
		 //validates
		 if(driver.getCurrentUrl().contains("orangehrm.com")) {
			 System.out.println("URl contains");
		 }else {
			 System.out.println("URL doesnt contain");
		 }
		 
		 //page title
		 String title = driver.getTitle();
		 if(!title.isEmpty()) {
			 System.out.println("title is empty");
		 }else {
			 System.out.println("Title is not empty");
		 }
		 
		 driver.close();
		// Thread.sleep(2000);
		 driver.switchTo().window(parentId);
		// Thread.sleep(2000);

		 if(driver.getCurrentUrl().contains("login")) {
			 System.out.println("Login page is displayed");
		 }else {
			 System.out.println("Login page is not displayed");
		 }
		 
		 driver.close();
		 
		 
		 

		
		
	}

}
