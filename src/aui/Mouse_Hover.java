package aui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Mouse_Hover {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.emirates.com/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		
		//identify BOOK link
		WebElement book=  d.findElement(By.xpath(".//*[@id='book']/a/span[1]"));
		
		//identify EXPERIENCE link
		WebElement exep=  d.findElement(By.xpath(".//*[@id='inFlight']/a/span[1]"));
		
//create Actions class Object
		Actions obj=new Actions(d);
		
		Sleeper.sleepTightInSeconds(3);
		
		obj.moveToElement(book).moveToElement(exep).build().perform();
	
	}

}



