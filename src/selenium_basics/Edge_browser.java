package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_browser {

	public static void main(String[] args) {

//	Launching Edge Browser	

		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\Edge driver\\msedgedriver.exe");

//		Step -1 Launch browser

		WebDriver driver = new EdgeDriver();

//		Step -2 max window

		driver.manage().window().maximize();

//		Step -3 open web application

		driver.get("https://www.petpooja.com/");
		
		driver.close();

	}
}