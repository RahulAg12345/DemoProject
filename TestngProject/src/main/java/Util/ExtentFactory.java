package Util;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
	
	public static ExtentReports instance() {
		
		ExtentReports report;
		String dataName = new SimpleDateFormat("yyy-MM-dd-hhmm").format(new Date());
		String path_user = System.getProperty("user.dir");
		String destination = path_user + "\\test-output\\" + "\\Reports\\" + dataName + "Report.html";
		//String destination = path_user + "\\test-output\\Reports\\Report.html";
		String path = destination;
		report = new ExtentReports(path, false);
		
		return report;
		
	}

}

