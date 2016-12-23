package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class DatePicker {
  @Test
  public void f() {
	  
	  FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.redbus.in/");
		
		
		Sleeper.sleepTightInSeconds(2);
		d.manage().window().maximize();
		
		
		d.findElement(By.xpath("html/body/section/div[2]/main/section/div/div[2]/section/div/div[3]/div/label")).click();
		
		
		 String doj= "15/june 2017";
		 String[] a=doj.split("/");
		 
		 String day=   a[0];
		 String month=   a[1];
		 String year=   a[2];
		 
		 
		 
		 
		 
		 
		 String calyear= d.findElement(By.className("monthTitle")).getText();
		 
		 
		 while(! calyear.equals(year))
			
		 
		 {
	//click on Arrow in calander
				d.findElement(By.xpath("html/body/div[4]/table/tbody/tr[1]/td[3]/button")).click();

	// get the calander year text
				calyear=d.findElement(By.className("monthTitle")).getText();
			}
		 
		 
		 
		 //String calyear= d.findElement(By.className("monthTitle")).getText();
		 
		 
	  
	  
  }
}
