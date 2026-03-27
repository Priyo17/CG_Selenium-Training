package WebDriverInterrogationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//fetching the title
		String ExpectedTitle  ="Demo Web Shop";
		String title = driver.getTitle();
		//verification of title
		if(title.equals(ExpectedTitle)) {
			System.out.println("The Navigation is successful");
		}else {
			System.out.println("The navigation is fail");
		}
		driver.quit();
	}

}
