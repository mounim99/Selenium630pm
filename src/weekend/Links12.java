package weekend;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links12 {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.icicibank.com/");
		d.manage().window().maximize();
		
		//identify the no of links
		List<WebElement>   links=  d.findElements(By.tagName("a"));

		System.out.println(links.size());
		
		for( int i=0;i<20;i++)
		{
			
			String str= links.get(i).getText();
			System.out.println(str);
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
