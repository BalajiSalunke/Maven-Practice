package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	Launching IE Browser	

		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\Internet Explorer driver\\IEDriverServer.exe");

//	Step -1 Launch browser

		WebDriver driver = new InternetExplorerDriver();

//	Step -2 max window

		driver.manage().window().maximize();

//	Step -3 open web application

		driver.get("https://www.google.com/");
		
	
		driver.close();

	}

}
