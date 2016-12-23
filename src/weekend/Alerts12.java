package weekend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts12 {

	WebDriver d;
	
	public void launchapp() throws Exception
	{
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.spicejet.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
	
		d.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(2000);
		
		String str= d.switchTo().alert().getText();
		
		System.out.println(str);
		
		Thread.sleep(2000);
		d.switchTo().alert().accept();
	}
	
	
	
	public static void main(String[] args) throws Exception {
		
		Alerts12 obj=new Alerts12();
		
		obj.launchapp();
		
		
		
		
		
		
	}

}
