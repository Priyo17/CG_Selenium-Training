package WindowScrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingByAndTo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://amazon.in/");
		Thread.sleep(2000);
		//Scrolling by using scroll to
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1500)");
		//Scrolling by using scroll to
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, 1000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,1500)");
		}}
