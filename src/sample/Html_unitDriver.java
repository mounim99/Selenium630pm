package sample;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

//import com.thoughtworks.selenium.webdriven.commands.GetTitle;





public class Html_unitDriver {

	public static void main(String[] args) {
		
		
		
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
		

	}

}





