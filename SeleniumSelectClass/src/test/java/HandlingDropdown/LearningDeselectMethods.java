package HandlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningDeselectMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(6000);
		
		//locate the listbox and create the object
		Select sel = new Select(driver.findElement(By.id("select-multiple-native")));
		sel.selectByVisibleText("Fjallraven - Foldsac...");
		sel.selectByVisibleText("Mens Casual Premium ...");
		sel.selectByVisibleText("Mens Casual Slim Fit...");
		sel.selectByVisibleText("John Hardy Women's L...");
		Thread.sleep(5000);
		
		//deselect by index
		sel.deselectByIndex(0);
		Thread.sleep(5000);
		//deselect by value
		sel.deselectByValue("John Hardy Women's Legends Naga Gold & Silver Dragon Station Chain Bracelet");
		Thread.sleep(5000);
		
		//deselet by visible text
		sel.deselectByVisibleText("Mens Casual Premium ...");
		Thread.sleep(5000);
		sel.deSelectByContainsVisibleText("Mens Casual Slim Fit...");
		Thread.sleep(3000);
		sel.selectByVisibleText("Fjallraven - Foldsac...");
		sel.selectByVisibleText("Mens Casual Premium ...");
		sel.selectByVisibleText("Mens Casual Slim Fit...");
		sel.selectByVisibleText("John Hardy Women's L...");
		Thread.sleep(3000);
		
		
	}

}
