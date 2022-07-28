package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkdinMsgValidation {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\Chrome driver\\\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		WebElement email= driver.findElement(By.id("username"));
		email.sendKeys("balajisalu@gmail.com");
		
		WebElement pass= driver.findElement(By.id("password"));
		pass.sendKeys("123444");
		
		WebElement login= driver.findElement(By.xpath("//button[text()='Sign in']"));
		login.click();
		
		WebElement errorMsg= driver.findElement(By.id("error-for-password"));
		String error=errorMsg.getText();
		
		
		if(error.equalsIgnoreCase("That’s not the right password. Forgot password?")) {
			
			System.out.println("Linkdin password error validation test case is pass");
		}else {
			System.out.println("Linkdin password error validation test case is fail");
		}
		
		driver.close();
	}

}
