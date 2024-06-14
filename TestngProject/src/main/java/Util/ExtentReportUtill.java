package Util;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.HTMLReporter;

public class ExtentReportUtill {
	
	public static ExtentReports extent;
	public ExtentTest extentTest;
	
	public static HTMLReporter htmlReporter;
	
	public static ExtentReports getExtentInstance() {
		if (extent == null) {
			htmlReporter = new HTMLReporter(System.getProperty("user.dir") + "./Output/extentReport.html");
			extent = new ExtentReports("./Output/extentReport.html", true);
		}
		return extent;
	}

}
