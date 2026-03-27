package Practice;

import org.testng.annotations.Test;

public class TestPractice {
	@Test
	public void loginTest() {
		System.out.println("---Executing Login Sequence---");
		
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void logoutTest() {
		System.out.println("---Executing logout Sequence---");
	}
	

}

