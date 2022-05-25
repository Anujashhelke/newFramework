package bddframePageobject;

import org.openqa.selenium.WebDriver;



	
		import org.apache.logging.log4j.Logger;
		import org.openqa.selenium.WebDriver;

import bddFrameReusable.WebDriverHelper;
import bddFrameUistore.CarriersUi;
import bddFrameUistore.DecorUi;
import bddFrameUtility.ExtentReport;
import bddFrameUtility.Logs;

		public class ProductDetailsPageObject {

			
				public static WebDriverHelper helper;
				public static WebDriver driver;
				Logs logUtil;
				Logger log;
				
					public ExtentReport extent;
				
					public ProductDetailsPageObject() {
						 helper=new WebDriverHelper();
						 this.driver=driver;
						 logUtil=new Logs();
							log=logUtil.createLog();
						 extent=new ExtentReport();
					}

				

					public void hoverOndecor() {
						helper.action(DecorUi.decor);
						log.info("hovered successfully");
						
					}



					public void clickOnDoormat() {
						helper.click(DecorUi.doormat);
						log.info("clicked successfully");
						
					}
                    
					public void closePopup() {
						helper.closePopup(DecorUi.popup);
						log.debug("popup closed successfully");
						log.info("closed successfully");
						
					}


					public void hoverOnRecommended() {
						helper.explicitWaitOfvisibilityOfElementLocated(DecorUi.recommended, 50);
						helper.action(DecorUi.recommended);
						log.info("hovered successfully");
						
					}



					public void clickOnArrival() {
						helper.click(DecorUi.New);
						log.info("clicked successfully");
						
					}



					public void getdimension(String string) {
						//helper.explicitWaitOfvisibilityOfElementLocated(DecorUi.dimensions, 50);
					helper.getPageSource(string);
					log.info("got successfully");
						
					}
					public void clickOnProduct() {
						helper.click(DecorUi.mat);
						log.info("clicked successfully");
						
					
				}
					public void close() {
						driver.close();
						
					}
					
	}


