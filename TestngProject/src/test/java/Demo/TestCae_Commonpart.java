package Demo;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Functions.General_Functions;

import java.io.File;
import java.io.IOException;

import Testing_Base.Testing_Base;
import Testing_Pages.Elements_Page;
import Util.ExtentFactory;
import Util.ScenarioContext;
import Util.TestUtil;

public class TestCae_Commonpart extends Testing_Base {
	ExtentReports extent;
	public ExtentTest extentTest;
	Elements_Page elements;
	TestUtil testUtill;
	General_Functions Functions;
	ScenarioContext scenariocontext;
	
	
	String Browserused = prop.getProperty("browser");
	
	@BeforeMethod
	public void login() throws InterruptedException {
		Thread.sleep(3000);
		extent = ExtentFactory.instance();
		
		initialization();
		elements = new Elements_Page();
		Functions = new General_Functions();
		//extent.loadConfig(new File("\\E:\\Eclipse\\Workspace\\TestngProject\\src\\main\\java\\Config_Testing\\extent-config.xml"));
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		
		System.out.println("After Method");
		if(result.getStatus()==ITestResult.FAILURE) {
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to a name in extent report
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
			
			String screenshotpath = Testing_Base.takeScreenShot(driver, result.getName());
			
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotpath));
		}
		
		else if(result.getStatus()==ITestResult.SKIP) {
			
			extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS "+result.getName());
			
		}
		
		else if(result.getStatus()==ITestResult.SUCCESS) {
	//		extentTest.log(LogStatus.PASS, "TEST CASE PASS IS "+result.getName()); //to a name in extent report
	//		extentTest.log(LogStatus.PASS, "TEST CASE PASS IS "+result.getThrowable()); //to add error/exception in extent report
			
			String screenshotpath = Testing_Base.takeScreenShot(driver, result.getName());
			
			extentTest.log(LogStatus.INFO, extentTest.addScreenCapture(screenshotpath));
			
		}
		
		extent.endTest(extentTest);
		extent.endTest(extentTest);
		extent.flush();
		
	}
	
	

}

