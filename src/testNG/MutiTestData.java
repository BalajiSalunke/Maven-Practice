package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class MutiTestData {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

	}

	@Test(dataProvider = "testData")
	public void f(String email, String password) throws InterruptedException {
		WebElement userName = driver
				.findElement(By.xpath("//*[@class='_36HLxm col col-3-5']//div//form//div//input[@type='text']"));
		userName.sendKeys(email);
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.xpath("//*[@class='IiD88i _351hSN']//input[@type='password']"));
		pass.sendKeys(password);
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.xpath("//*[@class='_1D1L_j']//button[@type='submit']"));
		login.click();
		Thread.sleep(1000);

		userName.clear();
		Thread.sleep(1000);
//		pass.clear();
//		Thread.sleep(1000);
	}

	@DataProvider
	public Object[][] testData() {

		String[][] data = { { "9021198773", "ghdshj" }, { "8007799983", "jhsdhdh" } };

		return data;
	}

	@AfterClass
	public void afterClass() throws InterruptedException {

		Thread.sleep(2000);
		driver.close();
	}

}
