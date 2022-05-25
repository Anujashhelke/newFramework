package bddframePageobject;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import bddFrameReusable.WebDriverHelper;
import bddFrameUistore.StoresUi;
import bddFrameUtility.ExtentReport;
import bddFrameUtility.Logs;


public class StoresPageObject {

	
		public static WebDriverHelper helper;
		public static WebDriver driver;
		Logs logUtil;
		Logger log;
		
			public ExtentReport extent;
		
			public StoresPageObject() {
				 helper=new WebDriverHelper();
				 this.driver=driver;
				 logUtil=new Logs();
					log=logUtil.createLog();
				 extent=new ExtentReport();
			}
		

	public void textContain(String string) {
		helper.textContains(StoresUi.heading, string);
		log.info("clicked successfully");
		
	}

	public void clickOnviewDetails() {
		helper.click(StoresUi.viewDetails);
		log.info("clicked successfully");
		
	}

	


	public void clickOnStores() {
		helper.click(StoresUi.store);
		log.info("clicked successfully");
		
	}


	public void clickOnLocation() {
		helper.click(StoresUi.click);
		log.info("clicked successfully");
		
	}


	


	public void getTitle() {
		
		helper.getTitle1();
		log.info("title got  successfully");
		
		
	}

}
