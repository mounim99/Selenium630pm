package weekend;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Dropdown_testing1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		
		
		InternetExplorerDriver d=new InternetExplorerDriver();
		d.get("http://newtours.demoaut.com");
		d.manage().window().maximize();
		
		//click REGISTER link
		d.findElement(By.linkText("REGISTER")).click();
		
		//identify the drop down
		WebElement drop= d.findElement(By.name("country"));
		
	List<WebElement>  items=	 drop.findElements(By.tagName("option"));
	
	System.out.println(items.size());
	
	Thread.sleep(3000);	
	for (int i = 0; i < items.size(); i++) 
	{
		 String  str= items.get(i).getText();
		
		
		items.get(i).click();
		
		//item selected or not
		if(items.get(i).isSelected())
			System.out.println("Element is Working=="+ str);
		else
			System.out.println("Element is not Working==" + str);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
