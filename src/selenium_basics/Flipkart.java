package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Chrome driver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
			
		WebElement userName= driver.findElement(By.xpath("//*[@class='_36HLxm col col-3-5']//div//form//div//input[@type='text']"));
		WebElement password= driver.findElement(By.xpath("//*[@class='IiD88i _351hSN']//input[@type='password']"));
		
		userName.sendKeys("8007799983");
		password.sendKeys("balaji123");
		
	}

}
