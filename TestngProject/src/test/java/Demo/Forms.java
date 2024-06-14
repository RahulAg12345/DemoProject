package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Util.ScenarioContext;

public class Forms extends TestCae_Commonpart {
	String tcName = "TeastCase1";
	ScenarioContext scenariocontext;
	public Forms() {
		super();
	}

	@Test
	public void Testing() throws  IOException, InterruptedException { 
		Actions actions = new Actions(driver);
		extentTest = extent.startTest(tcName);
		//String tcid = (String) scenariocontext.getContext("tcName");

	
		System.out.println("Testing");
		
		File fileobj = new File("ExcelData\\testdata.xlsx");
		String dirpath = fileobj.getAbsolutePath();
		FileInputStream fileinputstream = new FileInputStream(dirpath);
		XSSFWorkbook workbook = new XSSFWorkbook(fileinputstream);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		
// Submit Text Box
		
		Thread.sleep(3000);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		elements.Formstab.click();
		Thread.sleep(2000);
		elements.Practicform.click();
		Thread.sleep(2000);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		elements.firstname.sendKeys(Excelreader("Data", tcName).get("firstname"));
		elements.Lasttname.sendKeys(Excelreader("Data", tcName).get("lastName"));
		elements.FormuserEmail.sendKeys(Excelreader("Data", tcName).get("userEmail"));
		elements.Gender.click();
		Thread.sleep(2000);
		elements.userNumber.sendKeys(Excelreader("Data", tcName).get("userNumber"));
//		elements.dateOfBirthInput.clear();
//		Thread.sleep(2000);
//		elements.dateOfBirthInput.sendKeys(Excelreader("Data", tcName).get("DateOfBirth"));
//		elements.subjectsContainer.click();
//		Thread.sleep(2000);
//		elements.subjectsContainer.sendKeys("Testing");
		Thread.sleep(2000);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		elements.Sports.click();
		elements.Reading.click();
		elements.Music.click();
		//elements.uploadPicture.sendKeys("C:\\Users\\Rahul Agarwal\\Documents\\Sign.jpeg");
		Thread.sleep(2000);
		elements.FormcurrentAddress.sendKeys(Excelreader("Data", tcName).get("currentAddress"));
		Thread.sleep(2000);
		//elements.SelectState.click();
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].scrollIntoView(true);", elements.SelectState);
//		elements.SelectState.sendKeys("NCR");
//		Thread.sleep(2000);
//		elements.SelectCity.click();
//		elements.SelectCity.sendKeys("Delhi");
//		Thread.sleep(2000);
		elements.FormSubmit.click();

		
	}

}
