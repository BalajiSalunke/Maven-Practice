package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {

		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php");
		
				
		WebElement firstName=driver.findElement(By.xpath("//*[@name='firstname']"));
		firstName.sendKeys("Balaji");
		
		WebElement lastName=driver.findElement(By.xpath("//*[@name='lastname']"));
		lastName.sendKeys("Salunke");
		WebElement mobile=driver.findElement(By.xpath("//*[@name=\"reg_email__\"]"));
		mobile.sendKeys("8007799983");
	    WebElement newPassword=driver.findElement(By.xpath("//*[@data-type=\"password\"]"));
     	newPassword.sendKeys("Balaji@123");
     	
     	
		WebElement day=driver.findElement(By.xpath("//*[@name='birthday_day']"));
		
		WebElement month=driver.findElement(By.xpath("//*[@name='birthday_month']"));
		
		WebElement year=driver.findElement(By.xpath("//*[@name='birthday_year']"));
			
		Select date=new Select(day);
		Select date1=new Select(month);
		Select date2=new Select(year);
		
		date.selectByVisibleText("18");
		date1.selectByVisibleText("Feb");
		date2.selectByVisibleText("1996");
		 WebElement gender=driver.findElement(By.xpath("//*[@type='radio' and @value='2']"));
	      	gender.click();
	      	WebElement submit=driver.findElement(By.xpath("//*[@name=\"websubmit\"]"));
	      	submit.click();
	    	
		
	}

}
