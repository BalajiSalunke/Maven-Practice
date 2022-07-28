package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_browser {
	
	
	
	public static void main(String[]args) {
		
//	Launching FireFox Browser	

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\FireFox driver\\geckodriver.exe");

//	Step -1 Launch browser

		WebDriver driver = new FirefoxDriver();

//	Step -2 max window

		driver.manage().window().maximize();

//	Step -3 open web application

		driver.get("https://www.swiggy.com/");
		
		driver.close();
		
		
		
}
}
