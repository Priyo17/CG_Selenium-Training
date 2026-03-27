package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddtoCartTest extends BaseClass{
	
	@Test (priority=1)
	public void login() {
		
		//verification
		WebElement swagLabsText = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		if(swagLabsText.getText().contains("Swag Labs")) {
			Reporter.log("Login successful",true);
			
		}else {
			Reporter.log("Login unsucessful",true);
		}
		
		
		
	}
	
	@Test (priority=2, dependsOnMethods="login")
	public void addToCart() {
		driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']/../../..//button")).click();
		driver.findElement(By.xpath("//div[.='Sauce Labs Bike Light']/../../..//button")).click();
		//verification
		driver.findElement(By.id("shopping_cart_container")).click();
		List<WebElement> productsIntheCart = driver.findElements(By.className("cart_item"));
		String addToCartVerify="";
		for(WebElement cartProducts: productsIntheCart) {
			addToCartVerify+=cartProducts.getText();
		}
		
		if(addToCartVerify.contains("Sauce Labs Backpack") && addToCartVerify.contains("Sauce Labs Bike Light")) {
			Reporter.log("The products has been added to cart successfully | Status: Pass", true);
		}else {
			Reporter.log("The products has not been added to the cart successfully | Status: Fail", false);
		}
		//verifying number of items present in the present
//			if(productsIntheCart.size()<3) {
//				System.out.println("2 items is present in the cart");
//				
//			}else {
//				System.out.println("Items is not present in the cart");
//		}
	}
	
	
	

}
