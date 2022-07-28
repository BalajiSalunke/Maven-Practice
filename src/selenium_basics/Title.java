package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
				
		if(driver.getTitle().equals("Facebook – log in or sign up")) {
			
			System.out.println("Test case pass");
				
			}else {
				System.out.println("Test case fail");
			}
		
		
		driver.close();
		
		
	}

}
