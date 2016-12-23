package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class NewTest {
 
	@Test
  public void f() {
	  
	  System.out.println("FIRST");
  }
  
	
	
  @Test
  public void aa()
  {
	  System.out.println("SECOND");
  }
  

	@Test
public void r() {
	  
	  System.out.println("FIRSTfcf");
}

	
	
@Test
public void dd()
{
	  System.out.println("SECONDfdggfr");
}


  @BeforeTest
  public void beforeMethod() {
	  
	  System.out.println("START"); 
  }

  @AfterTest
  public void afterMethod() {
	  
	  System.out.println("STOP");
  }

}
