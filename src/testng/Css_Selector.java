package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;





public class Css_Selector {
  
	WebDriver d;
	
	@BeforeTest
	public void setup()
	{
		 d=new FirefoxDriver();
		d.navigate().to("http://www.amazon.in/");
		d.manage().window().maximize();
	}
	
	
	@Test
  public void f() {
		
		
		
		
		// identify search box
		d.findElement(By.cssSelector("div.nav-search-field>input#twotabsearchtextbox"))
		                                .sendKeys("java");
  }
	
	@AfterTest
	public void closeapp()
	{
		d.close();
	}
}









