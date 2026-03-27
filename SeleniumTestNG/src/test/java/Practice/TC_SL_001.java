package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_SL_001 {
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
	public void ValProductpg() {
//		if(driver.getPageSource().contains("Products")) {
//			Reporter.log("Validation successful", true);
//		}else {
//			Reporter.log("Validation unsuccessful", true);
//
//		}
		Assert.assertEquals(driver.getPageSource().contains("Products"), true);
	
	}
	
	@Test(priority=3, dependsOnMethods="ValProductpg")
	public void addTocart() {
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
	}
	
	@Test(priority=4, dependsOnMethods="addTocart")
	public void verifyCart() {
		driver.findElement(By.id("shopping_cart_container")).click();
		List<WebElement> productsIntheCart = driver.findElements(By.className("cart_item"));
		String addToCartVerify="";
		for(WebElement cartProducts: productsIntheCart) {
			addToCartVerify+=cartProducts.getText();
		}
		
//		if(addToCartVerify.contains("Sauce Labs Backpack") && addToCartVerify.contains("Sauce Labs Bolt T-Shirt")) {
//			Reporter.log("The products has been added to cart successfully | Status: Pass", true);
//		}else {
//			Reporter.log("The products has not been added to the cart successfully | Status: Fail", false);
//		}
		
		Assert.assertEquals(addToCartVerify.contains("Sauce Labs Backpack") && addToCartVerify.contains("Sauce Labs Bolt T-Shirt"), true);
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
	public void valPrice() {
		
		
		String totPrice = "49.66";
		WebElement actualPrice = driver.findElement(By.className("summary_total_label"));
//		if(actualPrice.getText().contains(totPrice)) {
//			Reporter.log("Validation of price:Status:Pass, Match", true);
//		}else {
//			Reporter.log("Validation of price:Status:Fail,Unmatch",true);
//		}
		
		Assert.assertEquals(actualPrice.getText().contains(totPrice), true);
		driver.findElement(By.id("finish")).click();
		
	}
	
	
	@Test(priority=7, dependsOnMethods="valPrice")
	public void Logout() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}

	

	

	

	
}
