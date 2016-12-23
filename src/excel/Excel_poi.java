package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Excel_poi {
  @Test
  public void f() throws IOException {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("http://professional.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		
		
		FileInputStream fi=new FileInputStream
				("D:\\Workspace630pm\\Selenium630_project\\excel_input\\test.xlsx");
		
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		
		XSSFSheet ws=wb.getSheet("Sheet2");
		
		
		d.findElement(By.id("txtUsername")).sendKeys
		              (ws.getRow(1).getCell(0).getStringCellValue());
		
		d.findElement(By.id("txtPassword")).sendKeys 
		                (ws.getRow(1).getCell(1).getStringCellValue());
		
		d.findElement(By.id("btnLogin")).click();
  }
}
