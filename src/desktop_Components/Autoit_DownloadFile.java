package desktop_Components;

import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Autoit_DownloadFile {
  @Test
  public void f() throws IOException {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.seleniumhq.org/download/");
		d.manage().window().maximize();
	  
		//click 3.0.1 link
		
		d.findElement(By.linkText("3.0.1")).click();
		
		Sleeper.sleepTightInSeconds(3);
		
		//Execute AutoIT script
		Runtime.getRuntime().exec("D:\\FastTrack\\SAve_file.exe");
		
		
  }
}





