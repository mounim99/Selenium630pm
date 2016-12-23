package aui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Slider1 {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		
		///d.switchTo().frame(0);
		
		//identify the moving element
		//WebElement slider= d.findElement(By.xpath(".//*[@id='slider']/span"));
		
		
		//identify the download link
		WebElement slider12= d.findElement(By.xpath(".//*[@id='menu-top']/li[2]/a"));
	    //int y=	slider.getLocation().y;
	    
	    
	    Actions sl=new Actions(d);
	    
	    //sl.dragAndDropBy(slider, 50, y).build().perform();
	    
	    
	    sl.clickAndHold(slider12).build().perform();
	    
	
	    
	}

}
