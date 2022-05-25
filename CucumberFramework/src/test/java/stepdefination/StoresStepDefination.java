package stepdefination;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import bddFrameUtility.ConfigRead;
import bddFrameUtility.ExtentReport;
import bddFrameUtility.Logs;
import bddframePageobject.HomePage2;
import bddframePageobject.StoresPageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StoresStepDefination {
	
	public static ExtentReport extent;
	WebDriver driver;
	Logs logger;
	Logger log;
	StoresPageObject h=new StoresPageObject();
	ConfigRead read;
	
	@When("^user click on stores$")
	public void user_click_on_stores() throws Throwable {
		h.clickOnStores();
		Thread.sleep(2000);
		
		
		
		
		
	}

	@And("^navigated to next page and check the page by verifying text$")
	public void navigated_to_next_page_and_check_the_page_by_verifying_text() throws Throwable {
		h.textContain("Stores");
		Thread.sleep(3000);
		h.clickOnviewDetails();
	}

	@And("^clicks on location$")
	public void clicks_on_location() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		h.clickOnLocation();
	   
	}

	@Then("^location page successfully verified$")
	public void location_page_successfully_verified() throws Throwable {
		Thread.sleep(3000);
		h.getTitle();
	   
	}



}
