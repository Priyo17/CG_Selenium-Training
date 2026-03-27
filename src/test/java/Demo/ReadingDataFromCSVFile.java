package Demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class ReadingDataFromCSVFile {
	@Test
	public void readCsvData() throws IOException {
		String line="";
		String split=",";
		BufferedReader br = new BufferedReader(new FileReader("./src/test/resources/Orangehrm_CommonData/Sample.csv"));
		while((line=br.readLine())!=null) {
			String data[]=line.split(",");
			String key=data[0];
			String value=data[1];
			System.out.println(key);
			System.out.println(" "+value);
		}
		
	}

}
