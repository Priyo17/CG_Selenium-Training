package HandlingHiddenDivisionPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenDivision {
	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.irctc.co.in/nget/train-search");
		//WebElement pop = driver.findElement(By.className("ng-trigger ng-trigger-animation ng-tns-c25-2 ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow ui-dialog-draggable ui-dialog-resizable ng-star-inserted"));
		
		//driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("[class='btn btn-primary']")).click();
		driver.findElement(By.cssSelector("[class='ng-tns-c69-9 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		driver.findElement(By.linkText("11")).click();
		
		
		
		
	}

}
