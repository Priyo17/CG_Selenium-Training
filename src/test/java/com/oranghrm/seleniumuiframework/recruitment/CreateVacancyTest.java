package com.oranghrm.seleniumuiframework.recruitment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.orangehrm.seleniumuiframework.genericutility.BaseClass;
import com.orangehrm.seleniumframework.object_repository.AddVacancyPage;
import com.orangehrm.seleniumframework.object_repository.DashboardPage;
import com.orangehrm.seleniumframework.object_repository.RecruitmentPage;
import com.orangehrm.seleniumframework.object_repository.VacanciesPage;
import com.orangehrm.seleniumuiframework.genericutility.ActionsHelper;
import com.orangehrm.seleniumuiframework.genericutility.ExcelUtility;
import com.orangehrm.seleniumuiframework.genericutility.JavaUtility;

public class CreateVacancyTest extends BaseClass{
	
	@Test
	public void addVacancy() throws Exception {
		
		ExcelUtility eu = new ExcelUtility();
		DashboardPage dbp=new DashboardPage(driver);
		ActionsHelper ah = new ActionsHelper(driver);
		RecruitmentPage rp = new RecruitmentPage(driver);
		AddVacancyPage avp=new AddVacancyPage(driver);
		VacanciesPage vp = new VacanciesPage(driver);
		JavaUtility ju = new JavaUtility();
		String random = ju.getRandomValue();
		SoftAssert sa = new SoftAssert();
		//Actions act = new Actions(driver);
		
		//Dashboard
		dbp.clickRecruitmentLink();
		//recuritmment link
		rp.clickVacanciesLink();
		//vacancies
		vp.clickAddbtn();
		//recuritment vacancy
		
		
//		String path="./src/test/resources/Orangehrm_TestScript_Data/Orangehrm_Recruitment_vacancy_TestData/Vacancies.xlsx";
//		eu.loadExcelFile(path,"AddVacancy");
//		String vacancyName = eu.getDataFromSingleCell(1, 1);
//		String description = eu.getDataFromSingleCell(1, 2);
//		String hiringManager = eu.getDataFromSingleCell(1, 3);
//		String positions = eu.getDataFromSingleCell(1, 4);
		
//		adp.setVacancyName("V--01");
//		act.click(adp.getJobTitle()).pause(Duration.ofSeconds(4)).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.ENTER).perform();
		
		eu.loadExcelFile("./src/test/resources/Orangehrm_TestScript_Data/Orangehrm_Recruitment_vacancy_TestData/Vacancies.xlsx", "addVacancy");
		//adp.setDescription("lond wertyu sdfghjk xcvbnm");
		avp.setVacancyName(eu.getDataFromSingleCell(1,3));
		//act.sendKeys(adp.getHiringMgr(),"A").pause(Duration.ofSeconds(4)).keyDown(Keys.DOWN).keyDown(Keys.ENTER);
		ah.navigateDownDropdown(avp.getJobTitle(), 4, 2);
		avp.setDescription(eu.getDataFromSingleCell(1, 2));
		//ah.scrollDownAutoSuggestion("a",avp.getHiringMgr(), 5,1);
		ah.scrollDownAutoSuggestion( "a",avp.getHiringMgr(), 7, 1);
		avp.setNumOfPos(eu.getDataFromSingleCell(1, 3));
		
		
//        avp.setVacancyName(vacancyName);
//		
//		ah.navigateDownDropdown(avp.getJobTitle(),1,3);
//		avp.setDescription(description);
//		
//		ah.scrollDownAutoSuggestion(hiringManager,avp.getHiringMgr(), 5, 1);
//		avp.setNumOfPos(positions);
		avp.clickSaveBtn();
		
		List<WebElement> validationVacancy = driver.findElements(By.xpath("//div[@class=\"oxd-table-row oxd-table-row--with-border\"]"));
		  
        for(WebElement vacancy: validationVacancy) {
        	String name=vacancy.getText();
        	//Assert.assertEquals(name,eu.getDataFromSingleCell(1, 1));
        	sa.assertEquals(name, eu.getDataFromSingleCell(1, 3));
        	if(name.contains(eu.getDataFromSingleCell(1, 3))) {
        		Reporter.log("Test Case Status: Pass", true);
        	}else {
        		Reporter.log("Test Case Status: Fail", true);
        	}
        	
        	
        }	
        sa.assertAll();
		
		
	}
	
	@Test
	public void addCandidate() {
		
	}

}