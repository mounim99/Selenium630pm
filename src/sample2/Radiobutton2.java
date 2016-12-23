package sample2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Radiobutton2 {
	
  
	public static void main(String[] args)  {
	  
	  FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		
	//xpath of the complete block of 2 radio groups
			WebElement block=driver.findElement(By.xpath("html/b.......ody/tr/td"));
			
			//loop for two groups
			for(int k=1;k<=2;k++)
			{
			   List<WebElement> radio=block.findElements(By.name("group"+k));
			   
			   //loop for group radio buttons
			   for(int i=0;i<radio.size();i++)
		 	   {
				   radio.get(i).click();
				  
				   //loop for print radio buttons values
				   for(int j=0;j<radio.size();j++)
				   {
					   System.out.println(radio.get(j).getAttribute("value")+"---"
				                  +radio.get(j).getAttribute("checked"));
				   }
				   System.out.println("########################");
				}
			}
			
  }
  
}
  

