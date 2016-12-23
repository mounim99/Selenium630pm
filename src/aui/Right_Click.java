package aui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		
		//identify the Gmail link
	 WebElement rc=	d.findElement(By.linkText("Gmail"));
	 
	 Actions obj=new Actions(d);
	 
	 //obj.contextClick(rc).sendKeys("W").perform();
	 
	 // OR
	 
	 //obj.contextClick(rc).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().build().perform();
	 
	 
	 // for double click operation
		obj.doubleClick(rc).perform();
		

	}

}
