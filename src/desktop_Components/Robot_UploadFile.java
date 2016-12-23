package desktop_Components;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Robot_UploadFile {
  @Test
  public void f() throws AWTException {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("http://toolsqa.com/automation-practice-form/");
		d.manage().window().maximize();
		
		//copy the file path 

		StringSelection path=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
		
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);

		//click Browse Button
	  d.findElement(By.xpath(".//*[@id='photo']")).click();
	  
	  Sleeper.sleepTightInSeconds(3);
	  
	  
	  Robot robo=new Robot();
	  
	  
	  robo.keyPress(KeyEvent.VK_ENTER);
	  robo.keyRelease(KeyEvent.VK_ENTER);
	  
	  
	  robo.keyPress(KeyEvent.VK_CONTROL);
	  robo.keyPress(KeyEvent.VK_V);
	  
	  
	  robo.keyRelease(KeyEvent.VK_V);
	  robo.keyRelease(KeyEvent.VK_CONTROL);
	  
	  robo.delay(2000);
	  
	  robo.keyPress(KeyEvent.VK_ENTER);
	  robo.keyRelease(KeyEvent.VK_ENTER);
	  
	  
	  
  }
}
