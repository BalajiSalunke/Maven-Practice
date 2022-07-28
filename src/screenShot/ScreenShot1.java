package screenShot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\Chrome driver\\\\chromedriver.exe");	

	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.makemytrip.com");
	
	
	TakesScreenshot tsc= (TakesScreenshot)driver;
	
	File source=tsc.getScreenshotAs(OutputType.FILE);
	
	File file= new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium-Practice\\ScreenShot\\imge.png");
   
	FileHandler.copy(source, file);
	
	System.out.println("Screenshot captured sucessfully");
	
	driver.close();
	}

}
