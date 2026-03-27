package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	@Test
	public void test() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Orangehrm_TestScript_Data/Orangehrm_Recruitment_vacancy_TestData/Vacancies.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("AddVacancy");
//		Row row  = sheet.getRow(1);
//		Cell cell = row.getCell(1);
//		String vacancyName = cell.getStringCellValue();
//		System.out.println(vacancyName);
		for(int i = 1;i<=sheet.getLastRowNum();i++) {
				System.out.println(sheet.getRow(i).getCell(1).getStringCellValue());
			}
		
		
		
		
		
	}

}
