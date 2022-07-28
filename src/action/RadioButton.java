package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		WebElement username=driver.findElement(By.xpath("//*[@id='nav-tools']//a//span[2]//span[2][@class='nav-icon nav-arrow']"));
 		username.click();
		Thread.sleep(2000);
	
	driver.navigate().forward();
	Thread.sleep(2000);
		WebElement marathi=driver.findElement(By.xpath("//*[@class=\"a-row a-spacing-mini\"][8]//div[@class='a-radio a-radio-fancy']"));
		marathi.click();
	}

}
