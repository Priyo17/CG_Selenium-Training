package WebDriverInterrogationMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01 {
	public static void main(String[] args) throws InterruptedException {
		//JAVA LOGIN: Verifying window id for fb and x
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String parentId = driver.getWindowHandle();
		System.out.println("Window id of the parent window: "+parentId);
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		String fbString = "", xString = "";
		for(String s:driver.getWindowHandles()) {
			if(!s.equals(parentId)) {
				fbString = s;
				break;
			}
		}
		System.out.println("Window id of fb: "+fbString);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Twitter")).click();
		Thread.sleep(2000);
		for(String s: driver.getWindowHandles()) {
			if(!s.equals(parentId)&&!s.equals(fbString)) {
				xString = s;
				break;
			}
		}
		System.out.println("Window id of x: "+xString);

		Thread.sleep(2000);
		driver.quit();		
//		Set<String> allwindowIds = driver.getWindowHandles();
//		System.out.println("All window ids: "+allwindowIds);
//		allwindowIds.remove(parentId);
//		for(String string: allwindowIds) {
//			System.out.println("Window id of facebook: "+string);
//		}
//		Thread.sleep(2000);
		
//		Set<String> allwindowIds1 = driver.getWindowHandles();
//		System.out.println("Window ids of parent window, fb, and twitter: "+allwindowIds1);
//		allwindowIds1.remove(allwindowIds);
//		allwindowIds1.remove(parentId);
//		for(String string: allwindowIds1) {
//			System.out.println(allwindowIds1);
//		}
		
	}

}
