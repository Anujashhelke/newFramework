package stepdefination;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import bddFrameUtility.ExcelRead;
import bddFrameUtility.ExtentReport;
import bddFrameUtility.Snapshot;
import bddframePageobject.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefination {
	ExcelRead excel;
	WebDriver driver;
	String path;
	LoginPage l=new LoginPage();
	ExtentReport extent=new ExtentReport();
	
@When("^user hovers on login$")
public void user_hovers_on_login() throws Throwable {
	Thread.sleep(3000);
	l.hover();
	Thread.sleep(3000);
	
	}

@And("^clicks on Login$")
public void clicks_on_Login() throws Throwable {
	Thread.sleep(3000);
	l.login();
	
}

@Then("^Login window popup$")
public void login_window_popup() throws Throwable {
	Thread.sleep(3000);
	System.out.println("poped up");
	
}

@And("^Enters  fill invalid email ,password$")
public void enters_fill_invalid_email_password() throws Throwable {
	excel=new ExcelRead();
	ArrayList<String> data=excel.excelTest();
	l.enterEmail(data.get(0));
	l.enterPass(data.get(1));
}

@And("^clicks on submit$")
public void clicks_on_submit() throws Throwable {
	Thread.sleep(3000);
	l.submit();
	Thread.sleep(2000);
}

@Then("^error massage displayed$")
public void error_massage_displayed() throws Throwable {
	Thread.sleep(3000);
	l.errorGet();
	Thread.sleep(2000);
}

@And("^try to click on submit with empty fields$")
public void try_to_click_on_submit_with_empty_fields() throws Throwable {
	Thread.sleep(3000);
	l.submit();
}

@Then("^displays fields are mandatory$")
public void displays_fields_are_mandatory() throws Throwable {
	Thread.sleep(3000);
	l.requiredField();
}


}
