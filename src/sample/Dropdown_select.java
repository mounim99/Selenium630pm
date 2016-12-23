package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown_select {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://newtours.demoaut.com");
		d.manage().window().maximize();
		
		
		//identify the REGISTER link
		
		d.findElement(By.xpath("html/................e/tbody/tr/td[2]/a")).click();
		
		//identify the drop down
		WebElement drop= d.findElement(By.name("country"));
		
		 //identify the dropdown items
		 List<WebElement> items=  drop.findElements(By.tagName("option"));
		System.out.println("Total Items are==="+items.size());
		
		
		for(int i=0;i<items.size();i++)
		{
			// item name
			String str= items.get(i).getText();
			
			
			items.get(i).click();
			
			//item selected or not
			if(   items.get(i).isSelected())
			{
				System.out.println("item is working==="  + str);
			}
			else
			{
				System.out.println("item is not working===" + str);
			}
			
			
		}
	}

}
