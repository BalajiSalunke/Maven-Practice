package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Group {
	
	 WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	@Test (priority=1, groups="sanity")
	public void verifyTitle() throws InterruptedException {
		System.out.println("verify facebook title");
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
	
	@Test(priority=2,groups="sanity")
	public void verifyUrl() {
		
//		driver.navigate().to("https://www.bookmyshow.com");
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/");
		System.out.println("verify facebook url");
	}
	@Test(priority=3,groups="integration")
	public void verifyLoginButton() {
//		driver.navigate().back();
		boolean loginButton=driver.findElement(By.name("login")).isEnabled();
		Assert.assertTrue(loginButton);
		System.out.println("verify facebook Login button");
	}
	@Test(priority=4,groups="integration")
	public void verifyCreateNewAccountButton() {
		String colour=driver.findElement(By.xpath("//a[text()='Create New Account']")).getAttribute("name");
		System.out.println(colour);
//		String s=Color.fromString(colour).asHex();
//		System.out.println(s);
		boolean createNewAccButton=driver.findElement(By.xpath("//a[text()='Create New Account']")).isEnabled();
		Assert.assertTrue(createNewAccButton);
		System.out.println("verify facebook url");
	}
	@AfterClass
	public void afterclass() throws InterruptedException {
		driver.close();
	}

}
