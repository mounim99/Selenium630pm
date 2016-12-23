package webTables;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebtableTesting233 {
	static FirefoxDriver driver;
	
	public static void main(String[] args) {
	
		driver=new FirefoxDriver();
		driver.get("http://www.timeanddate.com/worldclock/");
	
		String part1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
		String part2="]/td[";
		String part3="]";
		
		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=3;j++)
			{
				String x=driver.findElement(By.xpath(part1+i+part2+j+part3)).getText();
				System.out.print(x+"   ");
			}
			System.out.println();
		}
			
		}
		
		
		
		
		
		
		

}
