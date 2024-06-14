package Testing_Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.relevantcodes.extentreports.ExtentTest;

import Util.TestUtil;

public class Testing_Base {
	public static WebDriver driver;
	public static WebDriver driver1;
	public static Properties prop;
	ExtentTest logger;
	
	public Testing_Base() {
		
		try {
			prop = new Properties();
			String path = System.getProperty("user.dir");
			String destination = path + "\\src\\main\\java\\Config_Testing\\Config.properties";
			FileInputStream ip = new  FileInputStream(destination);
			try {
				prop.load(ip);
			}catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void initialization() {
		String browsername = prop.getProperty("browser");
		if (browsername.equals("Chrome")){
			ChromeOptions co = new ChromeOptions();
			co.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
			String path = System.getProperty("user.dir");
			String driverpath = path + "./Driver/ChromeDriver124/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverpath);
			co.addArguments("---start-maximized");
			driver = new ChromeDriver(co);
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//Below two coming from testUtil
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	public static String takeScreenShot(WebDriver driver, String screenshotName) throws IOException {
		
		String dataName = new SimpleDateFormat("yyy-MM-dd-hhmm").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir");
		String destination = path + "\\test-output\\" + "\\Screenshots\\" + screenshotName + dataName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
		
	}
	
	public static Map<String, String> Excelreader(String SheetName, String abv){
		Map<String, String> testata1 = new HashMap<String, String>();
		try {
//			String path = System.getProperty("user.dir");
//			String destination = path + "ExcelData \\testdata.xlsx";
			File fileobj = new File("ExcelData\\testdata.xlsx");
			String dirpath = fileobj.getAbsolutePath();
			FileInputStream fileinputstream = new FileInputStream(dirpath);
			XSSFWorkbook workbook = new XSSFWorkbook(fileinputstream);
			//org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0);
			XSSFSheet sheet = workbook.getSheet(SheetName);
			int lastrow = sheet.getLastRowNum();
			
			for(int i = 0; i<=lastrow; i += 2) {
				
				Row row = sheet.getRow(i);
				int lastcoloumn = row.getLastCellNum();
				org.apache.poi.ss.usermodel.Cell cell = row.getCell(0);
				if (cell.getStringCellValue().equalsIgnoreCase(abv)) {
					for(int j = 1; j < lastcoloumn; j++) {
						
						testata1.put(row.getCell(j).getStringCellValue().trim(), 
								sheet.getRow(i + 1).getCell(j).getStringCellValue().trim());
					}
					break;
				}
			}
			workbook.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return testata1;
		
	}
	
	
	


}
