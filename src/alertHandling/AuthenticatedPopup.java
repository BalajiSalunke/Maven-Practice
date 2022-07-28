package alertHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AuthenticatedPopup {

	public static void main(String[] args) {

		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//syntax for authenticated pop up
		//protocol ://username:password@URL
		
	}

}
