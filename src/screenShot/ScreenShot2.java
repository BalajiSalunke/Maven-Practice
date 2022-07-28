package screenShot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot2 {

	public static void main(String[] args) throws IOException, InterruptedException {
   
	System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Chrome driver\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.paytm.com");
	
	TakesScreenshot ref =(TakesScreenshot) driver;
	
	File source=ref.getScreenshotAs(OutputType.FILE);
	
	File file= new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium-Practice\\ScreenShot\\image3.png");
	
	FileHandler.copy(source, file);
	
	System.out.println("Paytm Screenshot captured sucessfully "); 
	
	Thread.sleep(2000);
	
	//================================================================================//
	
	driver.navigate().to("https://www.redbus.com");
	File source1=ref.getScreenshotAs(OutputType.FILE);
	File file1= new File("C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\Selenium-Practice\\\\ScreenShot\\\\image4.png");
	
	FileHandler.copy(source1, file1);
	System.out.println("Redbus Screenshot captured sucessfully "); 
	Thread.sleep(2000);
	driver.close();
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
