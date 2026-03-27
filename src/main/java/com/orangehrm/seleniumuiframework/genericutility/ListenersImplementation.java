package com.orangehrm.seleniumuiframework.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ListenersImplementation implements ITestListener{
//	ExtentReports extent = new ExtentReports();
//	ExtentSparkReporter spark =new ExtentSparkReporter("./Reports/test_result.html");
//	ExtentTest test;
	ExtentReports extent = ExtendReportUtility.getExtentInstance();
	ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	
	WebDriver driver;


	@Override
	public void onTestStart(ITestResult result) {
		ExtentTest et = extent.createTest(result.getMethod().getMethodName());
		//test = extent.createTest(result.getMethod().getMethodName()); //capture the name of the test report
		test.set(et);
	}

	@Override
	public void onTestSuccess(ITestResult result) { //pass the test case
		test.get().pass("Test Status : Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) { //fail the test case and print the exception
		test.get().fail("Test Status : Fail");
		test.get().fail(result.getThrowable());
		Object obj = result.getInstance();
		//creating object of any other class, so we must downcast it
		BaseClass bsc = (BaseClass) obj;
		WebDriver driver = bsc.driver;//establishing connection between that driver and this driver
		ScreenshotUtility sc = new ScreenshotUtility();
		try {
			sc.captureScreenshot(driver, result.getMethod().getMethodName());
			//Attach screenshot in the report
			test.get().addScreenCaptureFromPath(sc.captureScreenshot(driver, result.getMethod().getMethodName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) { //status of skipped tc
		test.get().skip("Test status : Skip");
		
	}
	

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

}
