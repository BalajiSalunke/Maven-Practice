package action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Option {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Chrome driver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://vctcpune.com/selenium/practice.html");

		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,700)");
		
		dropDown.click();
		
		Actions ref=new Actions(driver);
		
		ref.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		ref.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).build().perform();
		Thread.sleep(3000);
		driver.close();
		

	}

}
