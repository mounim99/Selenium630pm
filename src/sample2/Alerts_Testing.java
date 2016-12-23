package sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Alerts_Testing {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.spicejet.com/");
		d.manage().window().maximize();
		
		//click find flights 
		
	  d.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	  
	  String str=  d.switchTo().alert().getText();
	  
	  System.out.println(str);
	  Sleeper.sleepTightInSeconds(2);
	  
	  //click OK button in alert
	  d.switchTo().alert().accept();
		

	}

}
