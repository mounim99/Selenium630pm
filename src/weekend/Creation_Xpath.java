package weekend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Creation_Xpath {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://google.com");
		d.manage().window().maximize();
		
			d.findElement(By.xpath("//input[@id='lst-ib' and @type='text']")).
			                                      sendKeys("selenium");
	}

}
