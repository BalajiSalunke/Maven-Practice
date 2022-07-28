package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.navigate().forward();
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	driver.close();
	
    
	
	
	
	
	}

}
