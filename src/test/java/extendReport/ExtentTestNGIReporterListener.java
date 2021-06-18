package extendReport;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentTestNGIReporterListener {

	ExtentHtmlReporter  htmlReporter = new ExtentHtmlReporter("C:\\Users\\xooa\\eclipse-workspace\\Xooa_NFT\\test-output");
	
	 ExtentReports extent = new ExtentReports();
     
     ExtentTest test = extent.createTest("", "");

}

//(System.getProperty("user.dir") +"/test-output/testReport.html")
