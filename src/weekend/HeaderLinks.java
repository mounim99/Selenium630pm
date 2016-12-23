package weekend;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinks {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.bing.com/");
		d.manage().window().maximize();
		
		//Identifgy the block/ Header
		 WebElement block= d.findElement(By.id("sc_hdu"));
		
		//identify the no of links
		List<WebElement>  link=  block.findElements(By.tagName("a"));
		System.out.println(link.size());
		
		for (int i = 0; i < link.size(); i++) 
		{
			
			System.out.println(link.get(i).getText());
			
			
		}
		
			
	}

}
