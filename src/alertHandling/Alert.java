package alertHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\Chrome driver\\\\chromedriver.exe");	
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	
//	WebElement clickButton= driver.findElement(By.id("timerAlertButton"));
//	clickButton.click();
//	Thread.sleep(7000);
//	driver.switchTo().alert().accept();
	WebElement clickButton1= driver.findElement(By.id("confirmButton"));
	clickButton1.click();
	driver.switchTo().alert().accept();
	WebElement text= driver.findElement(By.id("confirmResult"));
	String textName=text.getText();
	
	if(textName.contains("Ok")) {
System.out.println("Test case pass");		
	}else {
		System.out.println("Test case fail");
	}
	
	
	WebElement clickButton2= driver.findElement(By.id("promtButton"));
	clickButton2.click();
	driver.switchTo().alert().sendKeys("Balaji");
	WebElement text1= driver.findElement(By.id("promptResult"));
	String textName1=text1.getText();
	
	if(textName1.contains("Balaji")) {
System.out.println("Test case pass");		
	}else {
		System.out.println("Test case fail");
	}
	Thread.sleep(3000);
	driver.close();
	
	}

}
