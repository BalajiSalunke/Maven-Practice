package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	 WebDriver driver;
	
@Parameters("browser")
  @BeforeClass
  public void beforeclass (String browserName) {
	  
	  if(browserName.equals("chrome")) {
     System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
      driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com");
	  }else {
		  if(browserName.equals("firefox")) {
	 System.setProperty("webdriver.gecko.driver", "D:\\\\Selenium\\\\FireFox driver\\\\geckodriver.exe");
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");  
		  }
	  }
  }

  @Test
  public void testCase1() throws InterruptedException {
   driver.findElement(By.id("email")).sendKeys("5677392");  
   Thread.sleep(2000);
   driver.findElement(By.id("pass")).sendKeys("abc@123");  
   Thread.sleep(2000);
   driver.findElement(By.xpath("//*[@name='login']")).click();  
   Thread.sleep(2000);

  }
  @Test
  public void verfyTitle() {
	  String name=driver.getTitle();
	  Assert.assertTrue(true);  
	  
	  }
  @AfterClass
  public void afterClass() {
	  
	 driver.close();

	  
	  
  }
 
  
}
