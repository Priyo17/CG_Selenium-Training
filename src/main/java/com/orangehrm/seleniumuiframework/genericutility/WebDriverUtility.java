package com.orangehrm.seleniumuiframework.genericutility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	public WebDriver driver;
	WebDriverWait wait;
	public WebDriverUtility(WebDriver driver) {
		this.driver = driver;
	}
	//Manage
	//maximize
	public void configMaximizedBrowser() {
		driver.manage().window().maximize();
	}
	//minimize
	public void configMinimizedBrowser() {
		driver.manage().window().minimize();
	}
	
	//fullscreen
	public void configFullscreenBrowser() {
		driver.manage().window().fullscreen();
	}
	
	//get Size
	public Dimension fetchBrowserSize() {
		Dimension dimension = driver.manage().window().getSize();
		return dimension;
	}
	
	//Set size
	public void configBrowserSize(int Width, int height) {
		driver.manage().window().setSize(new Dimension(Width, height));
	}
	
	//Get Position
	public Point fetchBrowserCoordinates() {
		Point point = driver.manage().window().getPosition();
		return point;
	}
	
	//Set position
	public void configBrowserCoordinates(int x, int y) {
		driver.manage().window().setPosition(new Point(x, y));
	}
	
	//Navigate
	//Navigate To String Url
	public void navigateToApplication(String fullurl) {
		driver.navigate().to(fullurl);
	}
	
	//forward
	public void navigateForward() {
		driver.navigate().forward();
	}
	//backward
	public void navigateBackward() {
		driver.navigate().back();
	}
	
	//Refresh
	public void refreshCurrentPage() {
		driver.navigate().refresh();
	}
	
	//Get
	public void enterUrl(String url) {
		driver.get(url);
	}
	
	//Get title
	public String fetchApplicationTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	//Get current url
	public String fetchApplicationUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	//close
	public void closingTab() {
		driver.close();
	}
	
	//Quit
	public void closingBrowserWindow() {
		driver.quit();
	}
	
	//timeouts
	//implicitwait
	public void waitForElementsToLoad(long timeInSeconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeInSeconds));
	}
	//explicit wait
	public void waitTilltheElementIsClickable(WebElement element,long maximumTimeToWait) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(maximumTimeToWait));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void waitTilltheElementIsVisible(WebElement element,long maximumTimeToWait) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(maximumTimeToWait));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	//popups 
	//alert, confirmation, prompt
	public void clickOnAccept() {
		driver.switchTo().alert().accept();;
	}
	
	public void clickOnDismiss() {
		driver.switchTo().alert().dismiss();;
	}
	
	public void typeMessageInJavascriptPopup(String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	public String fetchJavascriptPopupMessage() {
		String message = driver.switchTo().alert().getText();
		return message;
	}
	
	//child window Switching
	public void windowSwitchingByTitle(String childApplicationTitle) {
		String parentId = driver.getWindowHandle();
		Set<String> childIds = driver.getWindowHandles();
		childIds.remove(parentId);
		for(String child : childIds) {
			driver.switchTo().window(child);
			String title = driver.getTitle();
			if(title.contains(childApplicationTitle)) {
				break;
			}
			
		}	
	}
	public void windowSwitchingByUrl(String childApplicationUrl) {
		String parentId = driver.getWindowHandle();
		Set<String> childIds = driver.getWindowHandles();
		childIds.remove(parentId);
		for(String child : childIds) {
			driver.switchTo().window(child);
			String url = driver.getCurrentUrl();
			if(url.contains(childApplicationUrl)) {
				break;
			}
			
		}	
	}
	
	//Frames
	public void switchToFrameByIndex(int indexNo) {
		driver.switchTo().frame(indexNo);
	}
	public void switchToFrameByIdOrName(String idOrNameValue) {
		driver.switchTo().frame(idOrNameValue);
	}
	public void switchToFrameByFrameElement(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}
	public void switchBackTheControlToPreviousFrame() {
		driver.switchTo().parentFrame();
	}
	public void switchBackTheControlToMainPage() {
		driver.switchTo().defaultContent();
	}
	

}
