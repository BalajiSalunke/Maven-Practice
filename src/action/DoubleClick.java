package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/buttons");
		
		WebElement doubleClick=driver.findElement(By.id("doubleClickBtn"));
		
		Actions ref=new Actions(driver);
		
		ref.doubleClick(doubleClick).perform();
		
		String message=driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).getText();
		
		String name="You have done a double click";
		
		if(message.equals(name)) {
			System.out.println("Test case pass");
			
		}
		else {
			System.out.println("Test case fail");
		}
	
	driver.close();
	}

}
