package Functions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import java.util.HashMap;
import java.util.Map;

import Testing_Base.Testing_Base;
import Testing_Pages.Elements_Page;

public class General_Functions extends Testing_Base {
	
	ExtentReports extent;
	public ExtentTest extentTest;
	Elements_Page elements;
	
	public General_Functions() {
		super();
		elements = new Elements_Page();
		
	}
		public static HashMap <String, String> logindata(){
		
			HashMap <String, String> HM = new HashMap <String, String>();
			HM.put("a", "Rahul@Agrawal");
			HM.put("b", "rahul@123.com");
			HM.put("c", "25");
			HM.put("d", "30000");
			HM.put("e", "IT");
			
			return HM;
		}
		
		public void SwitchtoWinow(String expectedTitle) {
			String currentWindow = driver.getWindowHandle();
			for (String handles : driver.getWindowHandles()) {
				if (driver.switchTo().window(handles).getTitle().equals(expectedTitle)) {
					System.out.println("Window switched as expected");
					break;
				} else {
					driver.switchTo().window(currentWindow);
					System.out.println("Window switched at current window");
				}
			}
		}
	
	

}
