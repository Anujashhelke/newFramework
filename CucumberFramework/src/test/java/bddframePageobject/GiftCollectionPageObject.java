package bddframePageobject;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import bddFrameReusable.WebDriverHelper;
import bddFrameUistore.GiftCollectionUi;
import bddFrameUtility.ExtentReport;
import bddFrameUtility.Logs;


public class GiftCollectionPageObject {
	public static WebDriverHelper helper;
	public static WebDriver driver;
	Logs logUtil;
	 Logger log;
		
		public ExtentReport extent;

	public GiftCollectionPageObject() {
		 helper=new WebDriverHelper();
		 this.driver=driver;
		 logUtil=new Logs();
			log=logUtil.createLog();
		 extent=new ExtentReport();
		
	}

	public void clickOnGift() {
		helper.click(GiftCollectionUi.gift);
		log.info("clicked successfully");
	}

	public void hover() {
		helper.action(GiftCollectionUi.hover);
		log.info("hovered successfully");
		
	}

	public void clickOnChoose() {
		helper.click(GiftCollectionUi.button);
		log.info("choosed successfully");
		
	}

	public void insertAccount() {
		helper.sentText(GiftCollectionUi.account,"1200");
		
	}

	public void getText() {
	helper.getText(GiftCollectionUi.text);
	log.info("got successfully");
		
	}

	public void insertDate() {
		helper.select2(GiftCollectionUi.month);
		log.info("selected successfully");
	}

	public void clickNext() {
		helper.click(GiftCollectionUi.next);
		log.info("clicked successfully");
		
	}

	public void sendText(String string, String string2, String string3, String string4, String string5) {
		helper.sentText(GiftCollectionUi.receipntName, string);
		log.info("entered receipnt name");
		helper.sentText(GiftCollectionUi.customerName, string2);
		log.info("entered receipnt mail");
		helper.sentText(GiftCollectionUi.receiprntmail, string3);
		log.info("entered customer name");
		helper.sentText(GiftCollectionUi.customerMail, string4);
		log.info("entered customer mail");
		helper.sentText(GiftCollectionUi.phone, string5);
		log.info("entered phone no");
		
		
		
		
	}

	public void clickConfirm() {
		helper.clickExecuter(GiftCollectionUi.next);
		log.info("clicked");
		
	}

	public void getTitle() {
		helper.getTitle1();
		log.info("title got successfully");
		
	}
	public void close() {
		driver.close();
		
	}

}
