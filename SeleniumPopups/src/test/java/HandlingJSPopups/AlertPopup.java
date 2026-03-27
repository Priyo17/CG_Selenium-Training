package HandlingJSPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		//clicking on the button to trigger the popup
		driver.findElement(By.cssSelector("[class='btn btn-danger']")).click();
		Thread.sleep(2000);
		
		//handling the popup
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}

}
