package alertHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Chrome driver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropDown= driver.findElement(By.id("oldSelectMenu"));
		dropDown.click();
		
		Select sel= new Select (dropDown);
		
		sel.selectByIndex(3);
		
		
		
	}

}
