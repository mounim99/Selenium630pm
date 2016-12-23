package sample2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Dynamic_Xpath {

	public static void main(String[] args)  {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://in.yahoo.com/");
		d.manage().window().maximize();
	
		
		Sleeper.sleepTightInSeconds(3);
		
		//identify search box
		d.findElement(By.id("UHSearchBox")).sendKeys("selenium");
		
		//identify dynamic xpath links
		 List<WebElement> items= d.findElements(By.
				         xpath("//*[contains(@id,'ui_3_12_0_1_147913')]/a"));

		 Sleeper.sleepTightInSeconds(3);
		 
		 //click selenium tutorial
		 items.get(0).click();
	}

}

