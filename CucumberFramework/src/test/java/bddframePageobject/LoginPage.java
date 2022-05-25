package bddframePageobject;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;


import bddFrameReusable.WebDriverHelper;
import bddFrameUistore.CarriersUi;
import bddFrameUistore.LoginUi;
import bddFrameUtility.ExtentReport;
import bddFrameUtility.Logs;
public class LoginPage {

	
		public static WebDriverHelper helper;
		public static WebDriver driver;
		Logs logUtil;
		Logger log;
		
			public ExtentReport extent;
		
			public LoginPage() {
				 helper=new WebDriverHelper();
				 this.driver=driver;
				 logUtil=new Logs();
					log=logUtil.createLog();
				 extent=new ExtentReport();
				 
				 
			}

			public void hover() {
				helper.action(LoginUi.hover);
				log.info("hovered successfully");
				
			}

			public void login() {
				helper.click(LoginUi.login);
				log.info("clicked successfully");
				
				
			}

			public void enterEmail(String string) {
				helper.sentText(LoginUi.email, string);
				log.info("sent successfully");
				
			}

			public void enterPass(String string) {
				helper.explicitWaitOfvisibilityOfElementLocated(LoginUi.pass,50);
				helper.sentText(LoginUi.pass,string);
				log.info("sent successfully");
				
			}

			public void submit() {
				helper.click(LoginUi.submit);
				log.info("clicked successfully");
			}

			public void errorGet() {
				helper.getText(LoginUi.error);
				log.info("got successfully");
				
			}

			public void requiredField() {
				helper.ErrorMassage(LoginUi.requiredField);
				log.info("got successfully");
				
			}
			public void close() {
				driver.close();
				
			}
	}


