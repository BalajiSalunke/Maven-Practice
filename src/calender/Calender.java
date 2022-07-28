package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/datepicker/");

		driver.manage().window().maximize();

		WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(frame);

		WebElement monthValue = driver.findElement(By.id("datepicker"));
		monthValue.click();

		while (true) {
			WebElement month = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']"));
			String month1 = month.getText();
			
			
			if (!month1.equalsIgnoreCase("March 2020")) {

            driver.findElement(By.xpath("//*[@id='ui-datepicker-div']//div//a[@title='Prev']")).click();
				
				
			} else {
				break;
			}

			

		}driver.findElement(By.xpath("//*[@class=\"ui-datepicker-calendar\"]//tbody//tr//td//a[@data-date='23']"))
		.click();
		
		Thread.sleep(4000);
		driver.close();
		
	}
	
}
