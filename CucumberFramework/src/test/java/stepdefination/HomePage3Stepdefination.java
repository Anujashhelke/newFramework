package stepdefination;

import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import bddFrameUtility.BaseClass;
import bddFrameUtility.ConfigRead;
import bddFrameUtility.ExtentReport;
import bddFrameUtility.Logs;
import bddFrameUtility.Snapshot;
import bddframePageobject.HomePage3;
import bddframePageobject.Homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class HomePage3Stepdefination {
	public static ExtentReport extent;
	WebDriver driver;
	Logs logger;
	Logger log;
	HomePage3 h=new HomePage3();
	ConfigRead read;
	Snapshot snap;
	
	@Given("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
		  extent=new ExtentReport();
			read=new ConfigRead();
			
			
				// TODO Auto-generated catch bloc
			  //extent. createReport();
			    driver=BaseClass.setUp();
						driver.get(read.getUrl());
		    extent.createReport();
		  extent.createTest(getClass().getName());
		  
		  extent.logPass("browser launched successfully");
	  
	}

	@When("^user click on link$")
	public void user_click_on_link() throws Throwable {
		Thread.sleep(3000);
		h.clickOnLink();
		extent.logPass("successfully clicked");
		
		
	
		

	}

	@When("^verifies the text \"([^\"]*)\"$")
	public void verifies_the_text(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		h.textContain(arg1);
		extent.logPass("successfully verified"+arg1);
	}

	@When("^clicks on stories$")
	public void clicks_on_stories() throws Throwable {
		Thread.sleep(3000);
		h.stories();
		extent.logPass("successfully clicked");
	}

	@Then("^successfully got the response$")
	public void successfully_got_the_response() throws Throwable {
		h.getUserResponse();
		Thread.sleep(3000);
		 snap=new Snapshot();
		 String path=snap.takeSnapshot(driver);
			extent.logPass(path);
		extent.endReport();
		Thread.sleep(3000);
		driver.close();
		
		
	}


	
}
