package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.server.htmlrunner.HTMLLauncher;

public class Element_Checking {

	public static void main(String[] args) {
		
	
		
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://newtours.demoaut.com");
		d.manage().window().maximize();
		
		
		
		String src=  d.getPageSource();
		
		System.out.println(src);
		
		if(src.contains("Mercury Tours"))
			
			System.out.println("element is exist");
		else
			System.out.println("element is not exist");
	
	}

}





