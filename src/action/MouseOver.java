package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		WebElement username=driver.findElement(By.xpath("//*[@id='nav-tools']//a//span[2]//span[2][@class='nav-icon nav-arrow']"));
		WebElement marathi=driver.findElement(By.xpath("(//*[text()='MR'])[1]"));
////	marathi.click();
		Actions act= new Actions(driver);		
  act.moveToElement(username).moveToElement(marathi).click().build().perform();
  
  Thread.sleep(2000);
  
  driver.close();
	
	
	
	}
	
}