package weekend;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Multiple_Screens {

	public static void main(String[] args) throws IOException {
		
		//String nam;
		FirefoxDriver d=new FirefoxDriver();
		
        // System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		
		//InternetExplorerDriver d=new InternetExplorerDriver();
		d.get("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		//identify the no of links
		List<WebElement>   links=  d.findElements(By.tagName("a"));

		System.out.println(links.size());
		
		for( int i=0;i<links.size();i++)
		{
			
			String name= links.get(i).getText();
			
			links.get(i).click();
			
			//screen shots
		   File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			
		   FileUtils.copyFile(src, new File("D:\\Weekend_selenium\\screens\\"+name+".jpg"));
		   
		  
		  d.navigate().back();
			
		  links=  d.findElements(By.tagName("a"));
			
			
			
		}

	}

}
