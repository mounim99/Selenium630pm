package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Frames {
  @Test
  public void f() {
	  
	 // System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");		
	//	ChromeDriver d = new ChromeDriver();
	  
	  FirefoxDriver d=new FirefoxDriver();
	  d.get("https://paytm.com/paytmwallet");
	  d.manage().window().maximize();
	  
	  Sleeper.sleepTightInSeconds(6);
	  d.findElement(By.xpath("html/body/div[3]/div[3]/div/div/div/div/div/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/md-content/div[1]/a")).click();
	  
	  Sleeper.sleepTightInSeconds(4);
 
	  List<WebElement> frames= d.findElements(By.tagName("iframe"));
	  System.out.println(frames.size());
	  
	  d.switchTo().frame(0);
	  
	  Sleeper.sleepTightInSeconds(2);
	  d.findElement(By.id("input_0")).sendKeys("412578955");
	  d.switchTo().defaultContent();
	  
	  /*for(int i=0;i<frames.size();i++)
	  {
		  
		  try
		  {
			  d.findElement(By.id("input_0")).sendKeys("412578955");
		  }
		  catch(Exception e)
		  {
			  d.switchTo().defaultContent();
			  
			  
		  }
		  
		  
	  }*/
	  
	  
	  
  }
}
