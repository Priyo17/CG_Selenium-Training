package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(4000);
		
		//locating the listbox
		WebElement listbox = driver.findElement(By.id("oldSelectMenu"));
		Select sel = new Select(listbox);
		System.out.println("Is this dropdown multiple select? : "+sel.isMultiple());
		Thread.sleep(2000);
		
		//locating listbox 2
		WebElement listbox2 = driver.findElement(By.id("cars"));
		Select sel2 = new Select(listbox2);
		System.out.println("Is this dropdown multiple select? : "+sel2.isMultiple());
		
		//
	}

}
