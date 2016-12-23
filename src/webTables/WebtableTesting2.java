package webTables;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebtableTesting2 {
	
	public static void main(String[] args) {
	
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.timeanddate.com/worldclock/");
	
	
		String part1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
		String part2="]/td[5]/a";
		
		for(int i=1;i<=36;i++)
		{
				String x=driver.findElement(By.xpath(part1+i+part2)).getText();
				
				// OR
				//String y=driver.findElement(By.
	//xpath("html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr["+i+"]/td[5]/a")).getText();
				
				
				System.out.println(x);
	
		}
			
		}
}
