package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class MutiTestDataUsingProvider {
	
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\Chrome driver\\\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		

		
		
	}

	@Test (dataProvider="testdata")
	public void login(String username, String password) throws InterruptedException {
		
	WebElement email1=driver.findElement(By.id("email"));
	email1.sendKeys(username);
	Thread.sleep(1000);
	WebElement pass=driver.findElement(By.id("pass"));
	pass.sendKeys(password);
	Thread.sleep(1000);
	WebElement login=driver.findElement(By.name("login"));	
	login.click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
//	email1.clear();
		driver.findElement(By.id("email")).clear();
	
	
	}
	@DataProvider 
	
	public String [][] testdata(){
		
		String [][] name= {{"abc@gmail.com","1234"},{"xyz@gmail.com","57883"}};
		
		return name;
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
