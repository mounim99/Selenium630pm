package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown1 {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://newtours.demoaut.com");
		d.manage().window().maximize();
		
		
		//identify the REGISTER link
		
		d.findElement(By.xpath("html/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		
		//identify the drop down
		  WebElement drop= d.findElement(By.name("country"));
		  
		  //identify the dropdown items
		List<WebElement>   items=  drop.findElements(By.tagName("option"));
		System.out.println(items.size());
		
		
		for(int j=0;j<items.size();j++)
		{
			String  itemname= items.get(j).getText();
			System.out.println(itemname);
		}
		
		
	}

}

