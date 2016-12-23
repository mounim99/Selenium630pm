package desktop_Components;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;




public class AutoIT_Upload {
	
	 WebDriver d;
	
	
  @Test
  public void f() throws IOException 
  {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("http://toolsqa.com/automation-practice-form/");
		d.manage().window().maximize();
		
		//click Browse Button
	  d.findElement(By.xpath(".//*[@id='photo']")).click();
	  
	  Sleeper.sleepTightInSeconds(3);
	  
	  //Execute AutoIT script for  File upload
	  Runtime.getRuntime().exec("D:\\FastTrack\\Upload_Auto.exe");
	  
	  
	  
  }
  
}




