package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/buttons");
		
		WebElement rightClickButton=driver.findElement(By.id("rightClickBtn"));
		
		
		
		Actions ref=new Actions(driver);
		
		ref.contextClick(rightClickButton).perform();
		String actualName="You have done a right click";
		WebElement rightClickButtonText=driver.findElement(By.xpath("//*[@id='rightClickMessage']"));
		String name=rightClickButtonText.getText();
		System.out.println(name);
		
		if(name.equals(actualName)) {
			System.out.println("Test Case pass");
		}else
		{
			System.out.println("Test Case Fail");
		}
		Thread.sleep(8000);
		driver.close();

	}

}
