package weekend;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Hidden_Links_Count {

	public static void main(String[] args) {
		
System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		
		
		InternetExplorerDriver d=new InternetExplorerDriver();
		
		
		
	//	FirefoxDriver d=new FirefoxDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		
		//identify the no of links
		List<WebElement>   links=  d.findElements(By.tagName("a"));

		System.out.println("Total Links are===="+ links.size());
		
		int count=0;
		
		for(int i=0;i<links.size();i++)
		{
			
			if(  !  links.get(i).getText().isEmpty())
			{
				count++;   //count=count+1;
			}
			
			
		}
		
		System.out.println("Visible lINKS are=="  + count);
		
		System.out.println("Hidden Links are=== " + (links.size()-count));
		
		
		
		
	}

}
