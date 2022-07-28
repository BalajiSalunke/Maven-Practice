package fileUploadAndDownload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=104.0.5112.29/");
		
		driver.findElement(By.xpath("//a[text()='chromedriver_linux64.zip']")).click();
		
		Thread.sleep(3030);
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
