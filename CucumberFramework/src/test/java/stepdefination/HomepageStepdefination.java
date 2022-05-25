package stepdefination;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;



import bddFrameUtility.BaseClass;
import bddFrameUtility.ConfigRead;
import bddFrameUtility.ExtentReport;
import bddFrameUtility.Logs;
import bddFrameUtility.Snapshot;
import bddframePageobject.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class HomepageStepdefination extends BaseClass {
	public static ExtentReport extent;
	WebDriver driver;
	Logs logger;
	Logger log;
	Homepage h=new Homepage();
	ConfigRead read;
	Snapshot snap;
	String path;
  
	@Given("^user is on home page$")
	public void user_is_on_home_page() {
	  extent=new ExtentReport();
		read=new ConfigRead();
		
		
			// TODO Auto-generated catch bloc
		  //extent. createReport();
		    driver=BaseClass.setUp();
					driver.get(read.getUrl());
	    extent.createReport();
	    snap=new Snapshot();
	  extent.createTest(getClass().getName());
	  extent.logPass("browser launched successfully");
	   
	}
	@When("^user clicked on search icon$")
	public void user_clicked_on_search_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		
		h.clickOnSearch();
		Thread.sleep(3000);
		
	}

	@When("^sended the text$")
	public void sended_the_text() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		h.sendText();
		Thread.sleep(3000);
	}

	@Then("^user navigated to next page$")
	public void user_navigated_to_next_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		h.clickOnEnter();
		Thread.sleep(3000);
	    
	}
	@And("^popup closed if any$")
	public void popup_closed_if_any() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		h.closePopup();
		Thread.sleep(3000);
		
	}

	@And("^text is verified$")
	public void text_is_verified() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		h.verifyProduct();
		path=snap.takeSnapshot(driver);
		extent.logPass(path);
		extent.endReport();
		Thread.sleep(3000);
		driver.close();
		
		
	}
	
	


	

	
}


