package weekend;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Element_Exist {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		
		InternetExplorerDriver d=new InternetExplorerDriver();
		d.get("http://icicibank.com");
		d.manage().window().maximize();

		
		String str= d.getPageSource();
		System.out.println(str);
		
	
		if(str.contains("Find ATM Branch"))
			System.out.println("Element is exist");
		else
			System.out.println("Element is not exist");
		
		
	}

}
