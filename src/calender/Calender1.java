package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
        JavascriptExecutor je= (JavascriptExecutor) driver;
		
		je.executeScript("window.scroll(0,500)");
		
		WebElement tab=driver.findElement(By.id("dateOfBirthInput"));
		tab.click();
		
		while(true) {
			WebElement monthAndYear=driver.findElement(By.xpath("//*[@class=\"react-datepicker\"]//div[2]//div//div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']"));
		    String name=monthAndYear.getText();
		    String name1="March 2019";
	      
		    if(!name.equalsIgnoreCase(name1)) {
		    	WebElement previousMonth=driver.findElement(By.xpath("//*[@class='react-datepicker']//button[@class='react-datepicker__navigation react-datepicker__navigation--previous']"));
		    	previousMonth.click();
		    }else {
		    	break;
		    }
		    
		}
		WebElement day=driver.findElement(By.xpath("//*[@class='react-datepicker__month']//div[text()='10']"));
        day.click();
		Thread.sleep(5000);
		driver.close();
		
		   	
		}
		

}
