package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_url {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().minimize();
		
				
		String myUrl="https://www.facebook.com/";
		
		
		
		driver.get(myUrl);
		String getUrl=driver.getCurrentUrl();
		
		System.out.println(getUrl);
		
				
		if(getUrl.equals(myUrl)) {
			
			System.out.println("Test case pass");
			
		}else {
			System.out.println("Test case fail");
		}
		
		driver.close();

	}

}
