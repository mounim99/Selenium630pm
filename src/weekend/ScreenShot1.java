package weekend;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ScreenShot1 {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		
		InternetExplorerDriver d=new InternetExplorerDriver();
		d.get("http://icicibank.com");
		d.manage().window().maximize();
		
		Thread.sleep(3000);
		
		File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("D:\\Weekend_selenium\\abc.png"));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
