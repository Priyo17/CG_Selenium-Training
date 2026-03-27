package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(4000);
		//locating the listbox
		WebElement listbox = driver.findElement(By.id("cars"));
		//Select class object
		Select sel = new Select(listbox);
		//Thread.sleep(4000);

		//select few options
		sel.selectByVisibleText("Audi");
		sel.selectByVisibleText("Saab");
		//sel.selectByVisibleText("BMW");
		sel.selectByVisibleText("Volvo");
		Thread.sleep(4000);
		
		//Verifying if all the options above are selected or not
		List<WebElement> allSelectoptions= sel.getAllSelectedOptions();
		for(WebElement opt:allSelectoptions) {
			System.out.println(opt.getText());
		}
		//System.out.println(sel.getFirstSelectedOption().getText());
		Thread.sleep(4000);

		driver.quit();
		
	}

}
