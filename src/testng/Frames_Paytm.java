package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Frames_Paytm {
  @Test
  public void f() {
	  
	  FirefoxDriver  d=new FirefoxDriver();
		d.navigate().to("https://paytm.com/");
		d.manage().window().maximize();
		
		
		//click login link
		d.findElement(By.xpath("html/body/.........]/div[3]/div")).click();
		
		Sleeper.sleepTightInSeconds(3);
		
		
		 List<WebElement> fms= d.findElements(By.tagName("iframe"));
		 
		 System.out.println(fms.size());
		 
		 d.switchTo().frame(0);
		 
		 
		 
		 for (int i = 0; i < fms.size(); i++) 
		 {
			 
			 try {
				 d.findElement(By.id("input_0")).sendKeys("dfdfdfd");
			} 
			 catch (Exception e)
			 
			 {
				
				 d.switchTo().defaultContent();
			}
		
		}
		
		 
  }
}
