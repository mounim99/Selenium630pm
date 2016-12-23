package sample2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Screens {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.gecko.drivere", "D:\\Selenium630_Library\\geckodriver.exe");
		
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://newtours.demoaut.com");
		d.manage().window().maximize();
		
		/*List<WebElement>    links=  d.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			
			String linkname= links.get(i).getText();
			
			
			links.get(i).click();
			
			File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D:\\Selenium630_Library\\"+linkname+".png"));
			
			d.navigate().back();
			
			links=  d.findElements(By.tagName("a"));
			
		}
		*/
		

	}

}
