package stepdefination;

import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import bddFrameUtility.ConfigRead;
import bddFrameUtility.ExtentReport;
import bddFrameUtility.Logs;
import bddframePageobject.HelpCenter;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class HelpCenterStepDefination {
	public static ExtentReport extent;
	WebDriver driver;
	Logs logger;
	Logger log;
	HelpCenter l=new HelpCenter(driver);
	ConfigRead read;
	
	@When("^clicks on Help$")
	public void clicks_on_Help() throws Throwable {
		Thread.sleep(3000);
		l.clickOnHelp();
	}
	
	@When("^click on the link$")
	public void click_on_the_link() throws Throwable {
		Thread.sleep(3000);
		 l.clickOnLink();
	  
	}	
 
   
   
    
	@Then("^verifies the page by comparing \"([^\"]*)\"$")
	public void verifies_the_page_by_comparing(String arg1) throws Throwable {
		Thread.sleep(3000);
		l.getText(arg1);
		 Thread.sleep(2000);

	    
	}

}
