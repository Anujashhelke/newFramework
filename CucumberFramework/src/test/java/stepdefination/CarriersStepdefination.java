package stepdefination;

import java.util.ArrayList;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import bddFrameUtility.BaseClass;
import bddFrameUtility.ExcelRead;
import bddframePageobject.CarriersPageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class CarriersStepdefination extends BaseClass{
	CarriersPageObject l=new CarriersPageObject();
	WebDriver driver;
	@When("^user clicks on TVunit$")
	public void user_clicks_on_TVunit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		l.clickOnTvUnit();
	     Thread.sleep(3000);
	    
	}

	@And("^close popup$")
	public void close_popup() throws Throwable {
		Thread.sleep(3000);
		 l.closePopup();
	}

	@And("^click on product tv$")
	public void click_on_product_tv() throws Throwable {
		Thread.sleep(3000);
		 l.clickOnUnit();
	}

	@Then("^page is verified$")
	public void page_is_verified() throws Throwable {
		Thread.sleep(3000);
		 l.getText("");
	}

	@And("^user hover on material and check ckeckbox$")
	public void user_hover_on_material_and_check_ckeckbox() throws Throwable {
		  l.hoverOnMaterial();
		     Thread.sleep(2000);
		     l.clickOnCheckBox();
		     Thread.sleep(2000);
	}

	@And("^verifies correct text$")
	public void verifies_correct_text() throws Throwable {
		Thread.sleep(3000);
		   l.getTextList("Dark");
		     Thread.sleep(2000);
	}

	@And("^enter email$")
	public void enter_email() throws Throwable {
	    ExcelRead excel=new ExcelRead();
	    ArrayList<String> data=excel.excelTest();
		  l.entermail(data.get(0));
		     Thread.sleep(2000);
	    
	}

	@Then("^subscription is successfully added$")
	public void subscription_is_successfully_added() throws Throwable {
		Thread.sleep(3000);
		 l.subscribe();
		 Thread.sleep(2000);
		   
	}
	


}
