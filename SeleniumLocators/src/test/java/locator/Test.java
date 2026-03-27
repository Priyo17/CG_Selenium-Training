package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement un = driver.findElement(By.xpath("//input[starts-with(@name,'username')]"));
		un.click();
		driver.findElement(By.xpath("//input[starts-with(@name,'username')]")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(RelativeLocator.with(By.name("password")).below(un)).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@class=\"oxd-userdropdown-img\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Change Password")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		String t=driver.getCurrentUrl();
		String t1="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		if(t.equals(t1)) {
			System.out.println("navigated back");
		}
		else {
			System.out.println("not navigated");
		}
		Thread.sleep(5000);
		driver.navigate().forward();
		String f=driver.getCurrentUrl();
		String f1="https://opensource-demo.orangehrmlive.com/web/index";
		if(f.equals(f1)) {
			System.out.println("navigated forward");
		}
		else {
			System.out.println("not navigated");
		}
		Thread.sleep(5000);
		driver.navigate().refresh();
		String url=driver.getCurrentUrl();
		String url2="https://opensource-demo.orangehrmlive.com/web/index.php/pim/updatePassword";
		if(url.equals(url2)) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
		driver.quit();
	}


		

		
		
	}

