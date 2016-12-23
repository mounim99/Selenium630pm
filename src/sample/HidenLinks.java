package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HidenLinks {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://google.com/");
		d.manage().window().maximize();
		
		//identify the no.of links
		List<WebElement> links= d.findElements(By.tagName("a"));
		System.out.println( "Total links are==="  +  links.size());
		
		int count=0;
		
		for (int i = 0; i < links.size(); i++) 
		{
			//condition for visible links
			if(  !  links.get(i).getText().isEmpty())
			{
				count++;   //count =count +1;
			}
			
			
		}
		
		System.out.println("Visible links are===="  +count);
		
		System.out.println("Hidden links are==="  + (links.size()-count));
		

	}

}
