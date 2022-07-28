package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slide1 {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demoSite/practice/slider/range.html");
		
		driver.manage().window().maximize();
		
		WebElement slide= driver.findElement(By.xpath("//div[@id='slider-range']//span[@style='left: 5.4%;']"));
		
		Actions ref= new Actions(driver);
		ref.clickAndHold(slide).moveByOffset(600, 0).build().perform();
	}

}
