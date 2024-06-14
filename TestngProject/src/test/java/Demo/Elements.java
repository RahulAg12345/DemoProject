package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Util.ScenarioContext;

public class Elements extends TestCae_Commonpart {
	String tcName = "TeastCase1";
	ScenarioContext scenariocontext;
	public Elements() {
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
		elements.Elements.click();
		Thread.sleep(2000);
		elements.TextBox.click();
		Thread.sleep(2000);
		//String userName = sheet.getRow(1).getCell(1).getStringCellValue();
		//elements.userName.sendKeys(userName);
		elements.userName.sendKeys(Excelreader("Data", tcName).get("userName"));
		elements.userEmail.sendKeys(Excelreader("Data", tcName).get("userEmail"));
		elements.currentAddress.sendKeys(Excelreader("Data", tcName).get("currentAddress"));
		elements.permanentAddress.sendKeys(Excelreader("Data", tcName).get("permanentAddress"));
//		String userEmail = sheet.getRow(1).getCell(2).getStringCellValue();
//		elements.userEmail.sendKeys(userEmail);
		Thread.sleep(2000);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		elements.Submit.click();
		
		
// click on check box
		
		Thread.sleep(2000);
		elements.CheckBox.click();
		Thread.sleep(2000);
		elements.dropdown.click();
		Thread.sleep(2000);
		elements.checkboxclick.click();
		
//submit web tables
		
		Thread.sleep(2000);
		elements.WebTables.click();
		Thread.sleep(2000);
		elements.clickAdd.click();
		Thread.sleep(2000);
		String Credentials = Functions.logindata().get("a");  //using hashmap here
		String arr[] = Credentials.split("@");
		elements.firstname.sendKeys(arr[0]);
		elements.lastName.sendKeys(arr[1]);
		String email = Functions.logindata().get("b");
		elements.webuserEmail.sendKeys(email);
		String age = Functions.logindata().get("c");
		elements.age.sendKeys(age);
		String salary = Functions.logindata().get("d");
		elements.salary.sendKeys(salary);
		String department = Functions.logindata().get("e");
		elements.department.sendKeys(department);
		Thread.sleep(2000);
		elements.webFormsubmit.click();
		
//Buttons 
		
		
		Thread.sleep(2000);
		elements.ButtonsTab.click();
		Thread.sleep(2000);
		actions.doubleClick(elements.doubleClickBtn).build().perform();
		Thread.sleep(2000);
		
		
// upload file 
		

		Thread.sleep(2000);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		elements.uploadFiletab.click();
		Thread.sleep(2000);
		elements.uploadFile.sendKeys("C:\\Users\\Rahul Agarwal\\Documents\\Sign.jpeg");
		
		

		
	}
	

}
