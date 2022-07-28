package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class MutiTestData1 {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@Test(dataProvider = "negativeTestData")
	public void negativeTestData(String email, String password) throws InterruptedException {
		WebElement userName = driver
				.findElement(By.id("txtUsername"));
		userName.sendKeys(email);
		Thread.sleep(500);
		WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.sendKeys(password);
		Thread.sleep(500);
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
		Thread.sleep(500);
        driver.navigate().back();
		userName.clear();
		Thread.sleep(1000);
		userName.clear();
		pass.clear();
//		Thread.sleep(1000);
	}
	@Test(dataProvider = "positiveTestData")
	public void positiveTestData(String email, String password) throws InterruptedException {
		
			WebElement userName = driver
					.findElement(By.id("txtUsername"));
			userName.sendKeys(email);
			Thread.sleep(500);
			WebElement pass = driver.findElement(By.id("txtPassword"));
			pass.sendKeys(password);
			Thread.sleep(500);
			WebElement login = driver.findElement(By.id("btnLogin"));
			login.click();
			Thread.sleep(500);
	        driver.navigate().back();
			userName.clear();
			Thread.sleep(1000);
			userName.clear();
			pass.clear();
	}

	@DataProvider
	public Object[][] negativeTestData() {

		String[][] data = { { "admin", "ghdshj" }, { "adghmn", "jhsdhdh" },{ "76328", "uaias" },{ "89932", "askss" } };

		return data;
	}
	@DataProvider
	public Object[][] positiveTestData() {

		String[][] data = { { "Admin", "admin123" }};
 
		return data;
	}

	@AfterClass
	public void afterClass() throws InterruptedException {

		Thread.sleep(2000);
		driver.close();
	}

}
