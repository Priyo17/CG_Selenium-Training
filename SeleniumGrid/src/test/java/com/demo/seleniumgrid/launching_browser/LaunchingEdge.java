package com.demo.seleniumgrid.launching_browser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchingEdge {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		EdgeOptions options = new EdgeOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.5:4444"),options);
		//Navigating to an application
		driver.get("https://www.selenium.dev/documentation/grid/");
		Thread.sleep(4000);
		driver.quit();

	}

}
