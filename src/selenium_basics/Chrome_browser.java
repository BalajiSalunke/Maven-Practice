package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Launching Chrome Browser	

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");

//		Step -1 Launch browser

		WebDriver driver = new ChromeDriver();

//		Step -2 max window

		driver.manage().window().maximize();

//		Step -3 open web application

		driver.get("https://in.bookmyshow.com/");
		
		driver.close();
		
		

	}

}
