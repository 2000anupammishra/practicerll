package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Listeners;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ItestListenerclass;
@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\deepa\\eclipse-workspace\\RLL_FirstCry_Project\\src\\test\\java\\pages\\LoginPage.java",glue = {"stepdefinitations"},
plugin = {"pretty","html:target/cucumber-reports/cucumber-preety",
		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:\", \"timeline:test-output-thread/" }
)
//plugin = {"pretty","html:target/cucumber-reports/cucumber-preety",
		//"json:target/cucumber-reports/CucumberTestReport.json"})
		//"return:target/cucumber-reports/return.txt"})

public class TestRunner {
	
	// we dont write anything over here.
	
}




	