package alertHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopup {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
				
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://webcamtests.com/check");
	}

}
