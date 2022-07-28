package selenium_basics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceComparision {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement userName= driver.findElement(By.xpath("//*[@class='_36HLxm col col-3-5']//div//form//div//input[@type='text']"));
		userName.sendKeys("8007799983");
		WebElement password= driver.findElement(By.xpath("//*[@class='IiD88i _351hSN']//input[@type='password']"));
		
		password.sendKeys("Balaji@123");
        WebElement login= driver.findElement(By.xpath("//*[@class='_1D1L_j']//button[@type='submit']"));
		
		login.click();
		
		//driver.navigate().forward();
		WebElement search=driver.findElement(By.xpath("//*[@class=\"_3OO5Xc\"]//input[@name=\"q\"]"));
		//search.click();
		search.sendKeys("iphone 12 black 64");
		WebElement submit=driver.findElement(By.xpath("//*[@class='col-12-12 _2oO9oE']//button[@class='L0Z3Pu']"));
		submit.click();
		
		driver.navigate().forward();
		
		WebElement price=driver.findElement(By.xpath("//*[@class=\"col col-5-12 nlI3QM\"]//div//div[1]"));
		
		price.getText();
			
			
		System.out.println(price);
		
		Thread.sleep(3000);
		
	}

}
