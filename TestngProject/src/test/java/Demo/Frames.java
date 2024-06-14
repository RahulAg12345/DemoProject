package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Util.ScenarioContext;

public class Frames extends TestCae_Commonpart {
	String tcName = "TeastCase1";
	ScenarioContext scenariocontext;
	public Frames() {
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
		
		Thread.sleep(5000);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		elements.FrameAlertTab.click();
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(4000);
		elements.FrameTab.click();
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		driver.switchTo().frame(elements.frame1);
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame(elements.frame2);
		Thread.sleep(2000);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		
// Alerts PopUp
		
		elements.AlertsTab.click();	
		Thread.sleep(2000);
		elements.alertButton.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
//Handle windows 
		
//		elements.BrowserTab.click();
//		Thread.sleep(2000);
//		elements.NewTab.click();
//		Thread.sleep(3000);
//		Functions.SwitchtoWinow("demoqa.com/sample");
//		Thread.sleep(2000);
//		String heading = elements.Heading.getText();
//		System.out.println("new tab heading tab is" +heading);
		
//Drag and Drop
		
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		elements.InteractionsTab.click();
		Thread.sleep(2000);
		elements.DroppableTab.click();
		Thread.sleep(2000);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		actions.dragAndDrop(elements.draggable, elements.droppable).build().perform();
		Thread.sleep(2000);
		
//Resizable
		
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		elements.ResizableTab.click();
		Thread.sleep(2000);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(elements.ResizableButton).dragAndDropBy(elements.ResizableButton, 300, 200).build().perform();
		Thread.sleep(2000);
	
	
// Cookies 
	
	Set <Cookie> cookies = driver.manage().getCookies();  // Capture all cokkie from brower
	System.out.println("Size of cookies:" +cookies.size());
	
	for(Cookie Cookie:cookies) {
		System.out.println(Cookie.getName()+":"+Cookie.getValue());
	}
	
	
	
	}
	

}
