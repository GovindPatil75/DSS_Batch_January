package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {
	
	public static ExtentReports extent;
	public static ExtentReports getReports() {
		
		String path="C:\\Users\\Dell\\eclipse-workspace\\DSS_Batch_January\\Reports\\index.html";
		
		//ExtentSparkReporter --> Title,ReportName,Theme
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("DSS_Test Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("System Name", "DSS Project");
		extent.setSystemInfo("Module Name", "DSS Jan");
		extent.setSystemInfo("QA", "XYZ");
		extent.setSystemInfo("O.S.", "Windows");
		return extent;
	}

}
