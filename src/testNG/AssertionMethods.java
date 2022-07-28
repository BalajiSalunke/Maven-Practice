package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionMethods {
	
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com");
		
	}

	@Test
	public void verifyTitle(expectedExceptions = ElementNotFoundException) {
		
	//Hard Assert
		
    String title=driver.getTitle();
	Assert.assertNotNull(title);
	 SoftAssert sa = new SoftAssert();	
    sa.assertNotNull(title, "Facebook - log in or sign ");
    System.out.println("soft assert get fail");
    sa.assertAll();
	}
	@Test
	public void verifyButton() {
		
	//Hard Assert
		
	boolean button= driver.findElement(By.name("login")).isEnabled();		
	System.out.println(button);
	Assert.assertNotNull(button);
	
	SoftAssert sa= new SoftAssert();
	sa.assertNotNull(button,"soft assert apply");
	sa.assertAll();
	}

	@AfterClass
	public void afterClass() {
		
		driver.close();
	}

}
