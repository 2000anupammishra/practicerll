package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.cucumber.java.it.Date;


public class ItestListenerclass implements ITestListener {
	//private WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed");
	}

	@Override
	 public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed");
	/*	Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/"+sdf.format(d)+".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("TestNG started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("TestNG finished");
	}



}