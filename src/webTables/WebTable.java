package webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
	
	public static void main(String[] args) {
	
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		
		//xpath for webTAble
		WebElement table= d.findElement(By.
				    xpath("html/body/div[1]/div[7]/section[2]/div[1]/table"));
		
		//identify the rows in webtable
		 List<WebElement> rows= table.findElements(By.tagName("tr"));
		 System.out.println(rows.size());
		 
		 //loop for rows
		 for (int i = 0; i < rows.size(); i++) 
		 {
			 //identify the columns in rows
			List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
			System.out.println(cols.size());
			
			//loop for columns
			for (int j = 0; j < cols.size(); j++) {
				
				System.out.print(cols.get(j).getText()+"    ");
			}
			
			System.out.println(rows.get(i).getText()+"  ");
			
		}
		
	}
}
