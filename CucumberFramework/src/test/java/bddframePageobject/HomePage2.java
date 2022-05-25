package bddframePageobject;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;



import bddFrameReusable.WebDriverHelper;
import bddFrameUistore.CarriersUi;
import bddFrameUistore.Home2Ui;
import bddFrameUtility.ExtentReport;
import bddFrameUtility.Logs;

public class HomePage2 {
	public static WebDriverHelper helper;
	public static WebDriver driver;
	Logs logUtil;
	 Logger log;
		
		public ExtentReport extent;
	
		public HomePage2() {
			 helper=new WebDriverHelper();
			 this.driver=driver;
			 logUtil=new Logs();
				log=logUtil.createLog();
			 extent=new ExtentReport();
		}
	

     public void hover() {
		helper.action(Home2Ui.hover);
		log.info("hover successfully");
		
	}


    public void clickOnLaptop() {
		helper.click(Home2Ui.text);
		log.info("clicked successfully");
		
	}
	public void closePopup() {
		helper.closePopup(Home2Ui.popup);
		log.info("closed successfully");
	}


   public void hoverOnProduct() {
	helper.action(Home2Ui.product);
	log.info("hovered successfully");
		
	}
	public void addToCart() {
		helper.click(Home2Ui.addCart);
		log.info("added successfully");
	}

    public void clickOnAdd() {
		helper.click(Home2Ui.add);
		log.info("addedd on cart successfully");
		
	}


   public void quantity() {
		helper.select(Home2Ui.quantity);
		log.info("quantity selected successfully");
		
	}


   public void Price() {
		helper.getText(Home2Ui.price);
		log.info("text got successfully");
		
	}

   public void checkout() {
		helper.click(Home2Ui.checkout);
		log.info("checkout successfully");
		
	}


public void enterUsername(String arg1) {
helper.sentText(Home2Ui.email, arg1);
log.info("checkout successfully");
	
}


public void enterphone(String arg2) {
	helper.sentText(Home2Ui.phone, arg2);
	log.info("sent successfully");
	
}


public void enterPin(String arg3) {
	// TODO Auto-generated method stub
	helper.sentText(Home2Ui.pin, arg3);
	log.info("sent successfully");
	
}


public void enterFname(String arg4) {
	// TODO Auto-generated method stub
	helper.sentText(Home2Ui.fname, arg4);
	log.info("sent successfully");
	
}


public void enterLname(String arg5) {
	// TODO Auto-generated method stub
	helper.sentText(Home2Ui.lname, arg5);
	log.info("sent successfully");
	
}


public void enteraddress(String arg6) {
	// TODO Auto-generated method stub
	helper.sentText(Home2Ui.address, arg6);
	
}
public void close() {
	driver.close();
	
}

}
