package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class OrangeHRM_Login {
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeClass 
	  public void beforeClass(String browserName) {
		 if(browserName.equals("chrome")) {
		  
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 }else {
			 if(browserName.equals("firefox")) {
				 System.setProperty("webdriver.gecko.driver", "D:\\\\\\\\Selenium\\\\\\\\FireFox driver\\\\\\\\geckodriver.exe");
				 driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				 
			 }
		 }
	  }
  @Test
  public void login() throws InterruptedException {
	  
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
Thread.sleep(2000);
driver.findElement(By.id("txtPassword")).sendKeys("admin123");  
Thread.sleep(2000);
driver.findElement(By.id("btnLogin")).click(); 	  
Thread.sleep(2000);
  }
  
  @Test
  public void verifyTitle() throws InterruptedException { 
	  
	String expTitle=driver.getTitle() ; 
	Assert.assertEquals(expTitle, "OrangeHRM");
	Thread.sleep(2000);
  }
  
  

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
