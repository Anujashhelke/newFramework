package stepdefination;

import org.junit.runner.RunWith;

import bddframePageobject.ProductDetailsPageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class DecorStepDefination {
	
	
	ProductDetailsPageObject h=new ProductDetailsPageObject();
	@When("^user hover on decor text in menu$")
	public void user_hover_on_decor_text_in_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		h.hoverOndecor();
		Thread.sleep(3000);
	}

	@And("^click on Doormat$")
	public void click_on_Doormat() throws Throwable {
		Thread.sleep(3000);
		h.clickOnDoormat();
	}

	@And("^closes popUp if any$")
	public void closes_popUp_if_any() throws Throwable {
		Thread.sleep(3000);
		h.closePopup();
	}

	@And("^hovers on recommended item list$")
	public void hovers_on_recommended_item_list() throws Throwable {
		Thread.sleep(3000);
		h.hoverOnRecommended();
	}


	@And("^click on product$")
	public void click_on_product() throws Throwable {
		Thread.sleep(3000);
	   h.clickOnProduct();
	}

	@Then("^user got dimension of product$")
	public void user_got_dimension_of_product() throws Throwable {
		Thread.sleep(2000);
		h.getdimension("Kyra Door Mat");
	}



	
		

}
