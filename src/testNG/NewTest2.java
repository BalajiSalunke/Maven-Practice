package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
public class NewTest2 {
//   1) (priority=1)	
//   2) (dependsOnMethods="HomePage")
//   3) (enabled=false)	
//   4) (invocationCount=4)	
//   5) (timeOut=2000)	
//   6) (description="Login Successful")	
	
  @Test (threadPoolSize=1)
  public void Login()  {
	  System.out.println("Login to Home Page");
	  
	}
  @Test 
  public void HomePage() {
	  System.out.println("Home Page Opened");  
	  
  }
  @Test 
  public void Recharge() {
	  System.out.println("Recharge"); 
	  
  }
}
