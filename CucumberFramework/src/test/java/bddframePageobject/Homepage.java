package bddframePageobject;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import bddFrameReusable.WebDriverHelper;
import bddFrameUistore.CarriersUi;
import bddFrameUistore.HomeUi;
import bddFrameUtility.ExtentReport;
import bddFrameUtility.Logs;

public class Homepage {
	public static WebDriverHelper helper;
	public static WebDriver driver;
	Logs logUtil;
	Logger log;
	
		public ExtentReport extent;
	
		public Homepage() {
			 helper=new WebDriverHelper();
			 this.driver=driver;
			 logUtil=new Logs();
				log=logUtil.createLog();
			 extent=new ExtentReport();
		}
	

	

	public void clickOnSearch() {
		helper.explicitWaitOfvisibilityOfElementLocated(HomeUi.Search,50);
		helper.clickOnSearch(HomeUi.Search);
		log.debug("clicked successfully");
		
		
	}
	





	public void sendText() {
		helper.sentText(HomeUi.Search, "wall clock");
		log.debug("text sended successfully");
		
	}




	public void clickOnEnter() {
		helper.clickEnter(HomeUi.Search);
		log.info("entered successfully");
		
	}




	public void closePopup() {
		helper.closePopup(HomeUi.popup);
		log.debug("popup closed successfully");
		
	}




	public void verifyProduct() {
		helper.containsText(HomeUi.text);
		log.info("verified successfully");
		
	}
	public void close() {
		driver.close();
		
	}

}
