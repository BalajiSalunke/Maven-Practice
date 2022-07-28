package alertHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handling {

	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");

        //Step -1 Launch browser 
		ChromeDriver driver = new ChromeDriver();

		// step-2 max window
		driver.manage().window().maximize();

		// step-3 open web application
		driver.get("https://vctcpune.com/selenium/practice.html");
		

		// step- 4 scrolling
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		

		// step-5 click on Alert button
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Thread.sleep(2000);

		// step-5- a handle alert
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
        String name="Balaji";
		driver.findElement(By.id("name")).sendKeys(name);
		Thread.sleep(2000);

		// step-6 click on confirm button
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();

		Thread.sleep(2000);
		

		if (driver.switchTo().alert().getText().contains(name)) {
			driver.switchTo().alert().accept();
		} else {
			driver.switchTo().alert().dismiss();
	
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
