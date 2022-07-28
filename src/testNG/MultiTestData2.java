package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class MultiTestData2 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}

	@Test(dataProvider = "testData")
	public void login(String email, String pass) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(500);
		driver.findElement(By.id("pass")).sendKeys(pass);
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@name='login']")).click();
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
		driver.findElement(By.id("email")).clear();

	}

	@DataProvider
	public String[][] testData() {

		String[][] data = { { "abc@gmail.com", "123456" }, { "cvg@gmail.com", "456788" },
				{ "tfg@gmail.com", "98765" } };
		return data;
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(2000);

		driver.close();
	}

}
