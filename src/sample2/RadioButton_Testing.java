package sample2;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton_Testing {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://echoecho.com/htmlforms10.htm");
		d.manage().window().maximize();
		
		String xpath="html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td";
		//identify the block of the radio buttons
		WebElement block= d.findElement(By.xpath(xpath));
		
		//identify first 3 radio buttons
		List<WebElement> radios = block.findElements(By.name("group1"));
		
		System.out.println(radios.size());
		
		for (int i = 0; i < radios.size(); i++) 
		{
			
			System.out.println(radios.get(i).getAttribute("value")+"-------"
			                               +radios.get(i).getAttribute("checked"));
			
			
			
			//System.out.println(radios.get(i).getAttribute("checked"));
			
		}
	
	}

}

