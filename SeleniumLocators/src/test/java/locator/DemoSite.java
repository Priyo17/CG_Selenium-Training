package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSite {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched")).sendKeys("Priyanka");
		Thread.sleep(2000);
		driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched")).sendKeys("G");
	}

}
