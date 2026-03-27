package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Practice {
	@Test
	public void readData() throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Orangehrm_CommonData/commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String URL = prop.getProperty("url");
		String browser = prop.getProperty("browser");
		String ValidUserName = prop.getProperty("username");
		String ValidPassWord= prop.getProperty("password");
		
		System.out.println("The default browser for testing is: "+browser);
		System.out.println("The URL of the application for testing is: "+URL);
		System.out.println("The valid username for testing is: "+ValidUserName);
		System.out.println("The valid password for testing is: "+ValidPassWord);
		
		//write
		FileOutputStream fos = new FileOutputStream("./src/test/resources/Orangehrm_CommonData/Write.properties");
		prop.setProperty("CandidateName", "Thomas");
		prop.store(fos, null);

		
	}

}
