package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Zerodha {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
ChromeOptions option = new ChromeOptions();
option.addArguments("--disable-notifications");

WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://kite.zerodha.com/?msclkid=21629aabcf8911ecb4b73c0c8d5b7d76");

		

		WebElement IdBox = driver.findElement(By.id("userid"));
		
		IdBox.sendKeys("CIP550");
		
//		Thread.sleep(2000);
		
		WebElement PassBox = driver.findElement(By.id("password"));
		
		PassBox.sendKeys("Balaji@123");
		
//		Thread.sleep(2000);
		
		WebElement LoginBox = driver.findElement(By.tagName("button"));
		
		LoginBox.click();
		
//		Thread.sleep(2000);
		
		WebElement PinBox = driver.findElement(By.id("pin"));
		
		PinBox.sendKeys("072907");
		
//		Thread.sleep(2000);
		
		WebElement LoginBox1 = driver.findElement(By.tagName("button"));
		
		LoginBox1.click();
		
		
		
		WebElement link = driver.findElement(By.xpath("//input[@icon='search']"));
       link.sendKeys("INFY");
       WebElement INFY = driver.findElement(By.xpath("(//*[@class='omnisearch-results']//div//li//span[text()='INFY'])[1]"));
       INFY.click();
       System.out.println("hello");
//       WebElement INFY1 = driver.findElement(By.xpath("(//span[text()='INFY']"));
//       INFY1.click();
//       WebElement buy = driver.findElement(By.xpath("//*[@id=\"mobile-context-menu-420\"]/ul/li[1]/a"));
//       buy.click();
//		link.click();

	}

}
