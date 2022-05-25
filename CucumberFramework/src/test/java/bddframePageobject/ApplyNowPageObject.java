package bddframePageobject;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import bddFrameReusable.WebDriverHelper;
import bddFrameUistore.ApplyNow;
import bddFrameUtility.ExtentReport;
import bddFrameUtility.Logs;

public class ApplyNowPageObject {
	

	public static WebDriverHelper helper;
	public static WebDriver driver;
	Logs logUtil;
	 Logger log;
		
		public ExtentReport extent;
  public ApplyNowPageObject() {
		 helper=new WebDriverHelper();
		 this.driver=driver;
		 logUtil=new Logs();
			log=logUtil.createLog();
		 extent=new ExtentReport();
		
	}
public void clickOnCarriers() {
	helper.click(ApplyNow.carriers);
	log.info("clicked successfully");
	
}
public void clickOnApply() {
	helper.click(ApplyNow.apply);
	log.info("clicked successfully");
}
public void clickOnApply2() {
	helper.click(ApplyNow.apply2);
	log.info("clicked successfully");
	
}
public void close() {
	driver.close();
	
}


}
