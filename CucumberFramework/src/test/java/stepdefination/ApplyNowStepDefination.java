package stepdefination;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import bddFrameUtility.BaseClass;
import bddframePageobject.ApplyNowPageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class ApplyNowStepDefination extends BaseClass {
	WebDriver driver;
	ApplyNowPageObject h=new ApplyNowPageObject();

	@When("^user clicks on carriers$")
	public void user_clicks_on_carriers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		h.clickOnCarriers();
		
		
	
	}

	@And("^user clicks on ApplyNow$")
	public void user_clicks_on_ApplyNow() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		h.clickOnApply();
		Thread.sleep(3000);
		
	}

	@And("^click on ApplyNow$")
	public void click_on_ApplyNow() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		h.clickOnApply2();
		Thread.sleep(3000);
	   
	}

	@Then("^application page verified$")
	public void application_page_verified() throws Throwable {
		Thread.sleep(3000);
	    System.out.println("ApplyNowStepDefination.application_page_verified()");
	    Thread.sleep(2000);
	   
	    
	}
	

}
