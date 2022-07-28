package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnNDrop {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Chrome driver\\\\chromedriver.exe");
        
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://aaplesarkar.mahaonline.gov.in/en");
//		driver.switchTo().alert().dismiss();
		WebElement alert2 = driver.findElement(By.xpath("//button[text()='Close']"));
		alert2.click();
		WebElement langauge = driver.findElement(By.xpath("//*[@class='lang-btn pull-right']//a"));
		langauge.click();
		WebElement alert1 = driver.findElement(By.xpath("//button[text()='Close']"));
		try{alert1.click();
		}catch(StaleElementReferenceException e) {
			
		}JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Actions act = new Actions(driver);
		WebElement state = driver.findElement(By.xpath("(//span[@class='title'])[9]"));
		state.click();
		WebElement department = driver.findElement(By.id("track_DepartmentCode"));
		department.click();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		WebElement subDepartment = driver.findElement(By.id("track_SubDepartmentCode"));
		subDepartment.click();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		WebElement serviceCode = driver.findElement(By.id("track_ServiceCode"));
		serviceCode.click();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		WebElement applicationid = driver.findElement(By.id("txtTokenNo"));
		applicationid.sendKeys("23728");
		WebElement go = driver.findElement(By.id("btnGo"));
		go.click();
		
		Thread.sleep(4000);
		driver.close();
	}

}
