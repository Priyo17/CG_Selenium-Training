package webDriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetandSetPosition {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//fetching default posiiton of chrome driver
		System.out.println(driver.manage().window().getPosition());//(int x, int y)
		//maximising the window
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getPosition());// (int x, int y)
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(100, 100));
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(400, 100));

	}

}
