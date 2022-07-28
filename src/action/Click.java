package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/buttons");
		
		WebElement Click=driver.findElement(By.xpath("//*[@id='8nGc3' and @type='button']"));
	    
		Actions ref=new Actions(driver);
		
		ref.click(Click).perform();
		
		String message=driver.findElement(By.xpath("//*[@id='dynamicClickMessage']")).getText();
		System.out.println(message);
		String name="You have done a dynamic click";
		if(name.equals(message)) {
			System.out.println("Test case pass");
		}else {
			System.out.println("Test case fail");
		}
		
		Thread.sleep(3000)
;
	driver.close();	
	}

}
