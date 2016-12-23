package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Sample_JXL {
  @Test
  public void f() throws BiffException, IOException {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("http://professional.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		
		
		FileInputStream fi=new FileInputStream
				("D:\\Workspace630pm\\Selenium630_project\\excel_input\\testdata.xls");
		Workbook wb=Workbook.getWorkbook(fi);
	
		Sheet ws=wb.getSheet("Sheet1");
		
		
		
		d.findElement(By.id("txtUsername")).sendKeys(ws.getCell(0, 1).getContents());
		
		d.findElement(By.id("txtPassword")).sendKeys(ws.getCell(1, 1).getContents());
		
		d.findElement(By.id("btnLogin")).click();
	 
  }
}
