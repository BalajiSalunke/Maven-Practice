package alertHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bhulekh.mahabhumi.gov.in/");
		JavascriptExecutor jse= (JavascriptExecutor)driver; 
		jse.executeScript("window.scrollBy(0,200)");
		WebElement operator=driver.findElement(By.id("list"));
		
		operator.click();
		
//		Actions act= new Actions(driver);
//	
//		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		
	//===================OR=========================//	
		
		Select sel= new Select(operator);
		
		sel.selectByIndex(4);
		
		System.out.println(sel.isMultiple());
		
	
//		System.out.println(sel.getAllSelectedOptions());
		
		
	}

}
