package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TitleAndUrl {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver","D:\\Selenium\\Edge driver\\msedgedriver.exe");
		

		
		WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("https://www.zerodha.com/");
		
		String title="Zerodha - Online stock trading at lowest prices from India's biggest stock broker – Zerodha";
			
		
		if(driver.getTitle().equals(title)) {
			
			System.out.println("Verify title test case pass");
			
		}else {
			System.out.println("Verify title test case fail");
		}
	
//--------------------------------------getUrl----------------------------------------------------------
		
		
		String myUrl="https://zerodha.com/";
		
		
		if(driver.getCurrentUrl().equals(myUrl)) {
			
			System.out.println("Verify url test case pass");
			
		}else {
			System.out.println("Verify url test case fail"); 
			
		}
		
		
		
		driver.close();
	}

}
