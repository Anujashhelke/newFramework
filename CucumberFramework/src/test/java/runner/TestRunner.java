package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import bddFrameUtility.ExtentReport;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features={"C:\\Users\\mindsdet345\\eclipse-workspace\\CucumberFramework\\Feature"},
		glue={"stepdefination"},
	 
		plugin={"pretty","html:reports/rp.html"},
		monochrome=true,
		dryRun=false)

public class TestRunner {
	static ExtentReport extent;
	@BeforeClass
	public static void main() {
		 try {
			extent=new ExtentReport();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extent.createReport();
		extent.createTest(extent.getClass().getSimpleName());
	}
	//@AfterClass
	//public  void end() {
		
		//extent.endReport();
	//}
	
	
	
}
	
