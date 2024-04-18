package extentReorts;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentReportDemo {
	
	
	public void ExtentreporDemo2()
	{
// Initiate extent report engine
// The ExtentReports report client for starting reporters and building reports.For most applications,
//you should have one ExtentReports instance for theentire JVM.
//ExtentReports itself does not build any reports,
//but allows reporters toaccess information, which in turn create the reports.
		
		ExtentReports ex = new ExtentReports();
		
		// initiate extent report reporter --> SparkReporter
		// create a folder in which the extent report will be placed
		// C:\Users\sonal\Eclipse-2023\Phase2-TestNGScriptsReports\\extentreports\\report.html
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter("C:\\Users\\deepa\\eclipse-workspace\\RLL_FirstCry_Project\\src\\test\\java\\Pagefactory\\PreSchool.java.html");
	
	// connect the ententreport object to extent reporter object
	
	ex.attachReporter(sparkreporter); // report gets created
	
	ex.flush(); // generate the report in the required folder of the project
	
		
	}
	@Test
	public void ExtentreporDemo3() throws IOException
	{
		ExtentReports ex = new ExtentReports();
		
		File file = new File("report.html");
		
	ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
	
	ex.attachReporter(sparkreporter); // report gets created
	
 // generate the report in the required folder of the project
	
	// automatically see the report on the desktop browser
	
	
	 ExtentTest test1 = ex.createTest("Test1");
	    test1.pass("Test Case passed");
	   
	    ExtentTest test2 = ex.createTest("Test2");
	   test2.log(Status.FAIL, "This test has failed");
	   
	    ExtentTest test3 = ex.createTest("Test3");
	    test3.skip("This test has skipped");
	   
	    ExtentTest test4 = ex.createTest("Test4");
	    test4.fail("This test has failed");
	
	   
	ex.flush();
	Desktop.getDesktop().browse(new File("report.html").toURI());
	
	
	
		
	}

		
}