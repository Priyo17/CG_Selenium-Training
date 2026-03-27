package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_SL_002 {
	
WebDriver driver = null;

	
	@Test(priority=0)
	public void LaunchingBrowser() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority=1, dependsOnMethods="LaunchingBrowser")
	public void Login() {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	@Test(priority=2, dependsOnMethods="Login")
	public void sort() {
		WebElement sortdd = driver.findElement(By.className("product_sort_container"));
		Actions actions = new Actions(driver);
		actions.moveToElement(sortdd).click().pause(Duration.ofSeconds(4)).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.ENTER).perform();
		
	}
	@Test(priority=3, dependsOnMethods="sort")
	public void lowprod() {
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
	}
	
	@Test(priority=4, dependsOnMethods="lowprod")
	public void verifyCart() {
		driver.findElement(By.id("shopping_cart_container")).click();
		WebElement prodInCart = driver.findElement(By.className("cart_item"));
//		if(prodInCart.getText().contains("Sauce Labs Onesie")) {
//			Reporter.log("Item is added to the Cart | Status: Pass", true);
//		}else {
//			Reporter.log("Item is not added to the cart | Status: Fail", true);
//		}
		
		Assert.assertEquals(prodInCart.getText().contains("Sauce Labs Onesie"), true);

	}
	
	@Test(priority=5, dependsOnMethods="verifyCart")
	public void checkout() {
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Rd");
		driver.findElement(By.id("last-name")).sendKeys("Sharma");
		driver.findElement(By.id("postal-code")).sendKeys("628504");
		driver.findElement(By.id("continue")).click();
	}
	
	@Test(priority=6, dependsOnMethods="checkout")
	public void verifyOrderSum() {
		WebElement checkoutprod = driver.findElement(By.className("cart_item"));
//		if(checkoutprod.getText().contains("Sauce Labs Onesie")) {
//			Reporter.log("Order is ready to be checked out correctly!!", true);
//		}else {
//			Reporter.log("Order is not ready to be checked out correctly!!", true);
//		}
		
		Assert.assertEquals(checkoutprod.getText().contains("Sauce Labs Onesie"), true);
	}
	
	@Test(priority=7, dependsOnMethods="verifyOrderSum")
	public void completeOrder() {
		driver.findElement(By.id("finish")).click();
	}
	
	@Test(priority=8, dependsOnMethods="completeOrder")
	public void Logout() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.linkText("Logout")).click();
	}


	
	



	


}
