package exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExceptions1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/");
		
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("balaji");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("balaji123");

		
		Thread.sleep(2000);

		driver.navigate().refresh();
		
		try{
			username.sendKeys("balaji");
		}catch(StaleElementReferenceException e) {
			 username=driver.findElement(By.name("email"));
			username.sendKeys("balaji");
		}
Thread.sleep(3000);
driver.close();
		
		
	}

}
