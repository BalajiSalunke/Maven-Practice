package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	LoginPage lp;
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		lp = new LoginPage(driver);

	}

	@Test(priority = -1)
	public void verifyLoginPageTitle() {
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, "OrangeHRM");
	}

	@Test(priority = 0)
	public void verifyLoginPageUrl() {
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, "https://opensource-demo.orangehrmlive.com/");
	}

	@Test(priority = 1)
	public void corectUserData() {

		lp.enterCred("Admin", "admin123");
		lp.login();

//		lp.buttonTextName();
	}

	@Test(priority = 2)
	public void verifyHomePageTitle() {
		String expectedTitle1 = driver.getTitle();
		Assert.assertEquals(expectedTitle1, "OrangeHRM");
	}

	@Test(priority = 3)
	public void verifyHomePageUrl() {
		String expectedUrl1 = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl1, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}

	@Test(priority = 4)
	public void validUserNameAndInvalidPassword() {

		driver.navigate().back();
		lp.msgClear();
		lp.enterCred("Admin", "admi123");
		lp.login();
		String error = lp.messageValidation();

		Assert.assertEquals(error, "Csrf token validation failed");
	}

	@Test(priority = 5)
	public void InvalidUserNameAndInvalidPassword() {

		lp.msgClear();
		lp.enterCred("Amin", "admi13");
		lp.login();
		String error = lp.messageValidation();
		Assert.assertEquals(error, "Invalid credentials");

	}

	@Test(priority = 6)
	public void nullUserNameAndValidPassword() {

		lp.msgClear();
		lp.enterCred("", "admin123");
		lp.login();
		String error = lp.messageValidation();
		Assert.assertEquals(error, "Username cannot be empty");

	}

	@Test(priority = 7)
	public void nullUserData() {

		lp.msgClear();
		lp.enterCred("", "");
		lp.login();
		String error = lp.messageValidation();
		Assert.assertEquals(error, "Username cannot be empty");

	}

	@AfterClass
	public void afterClass() throws InterruptedException {

		Thread.sleep(2000);

		driver.close();
	}

}
