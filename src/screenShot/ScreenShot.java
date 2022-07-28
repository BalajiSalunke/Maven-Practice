package screenShot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	
	public  void captureScreen(WebDriver ref,String name) throws IOException {
//		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
		
//		 ref = new ChromeDriver();
		
//		driver.get("https://www.whatsapp.com");
		
//		driver.manage().window().maximize();
		
		TakesScreenshot tss= (TakesScreenshot) ref;
		
		File source=tss.getScreenshotAs(OutputType.FILE);
		
		File file=new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium-Practice\\ScreenShot\\"+name+".png");
		
		FileHandler.copy(source, file);
		
		System.out.println("Screenshot captured sucessfully");
		
	
			
	}

	public static void main(String[] args) throws IOException  {

		
	
	}

}
