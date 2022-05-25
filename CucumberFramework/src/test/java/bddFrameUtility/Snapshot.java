package bddFrameUtility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Snapshot {


		WebDriver driver;
		public Snapshot() {
			this.driver=driver;
		}
		public String takeSnapshot(WebDriver driver2) throws IOException {
			TakesScreenshot sshot=(TakesScreenshot)driver2;
			String date=new SimpleDateFormat("MM-dd-yyyy-HH-mm-ss").format(new Date()) ;
			File src=sshot.getScreenshotAs(OutputType.FILE);
			String timeStamp=System.getProperty("user.dir")+"./snapshot/snapshot"+date+".png";
			File dest=new File(timeStamp);
			FileUtils.copyFile(src,dest);
			return timeStamp;
			
			
	}


}
