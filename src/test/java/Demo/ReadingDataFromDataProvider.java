package Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingDataFromDataProvider {
	@DataProvider(name = "SampleData")
	Object[][]getdata(){
		return new Object[][] {
			{"Browser","chrome"},
			{"username","Admin"},
			{"password","admin123"}

			
		};
	}
	@DataProvider(name = "SampleData1")
	Object[][]getinfo(){
		return new Object[][] {
			{"Browser","firefox","1"},
			{"username","user","2"},
			{"password","user123","3"}

			
		};
	}
	@Test(dataProvider="SampleData1")
	public void readingFromDataProvider(String key, String value) {
		System.out.println("My key is: "+key+"=================> My Value is: "+value);
	}

}
