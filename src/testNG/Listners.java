package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNG.ListnersImplement.class)
public class Listners {

	public static WebDriver ref;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
		ref = new ChromeDriver();
		ref.manage().window().maximize();
		ref.get("https://www.facebook.com/");
	}
	@Test
	public void verifyTitle() throws InterruptedException {
		System.out.println("verify facebook title");
		Assert.assertEquals(ref.getTitle(), "Facebook – og in or sign up");
	}
	@Test
	public void verifyUrl() {
		System.out.println("verify facebook url");
		ref.navigate().to("https://www.bookmyshow.com");
		Assert.assertEquals(ref.getCurrentUrl(), "https://www.ebok.com/");
	}
	@AfterClass
	public void afterclass() throws InterruptedException {
		ref.close();
	}

}
