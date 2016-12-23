package aui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_DROP {

	public static void main(String[] args) {
		
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/droppable/");
		d.manage().window().maximize();
		
		d.switchTo().frame(0);
		
		WebElement src= d.findElement(By.id("draggable"));
		
		WebElement targ= d.findElement(By.id("droppable"));
		
		Actions obj=new Actions(d);
		
		
		obj.dragAndDrop(src, targ).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
