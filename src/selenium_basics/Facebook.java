package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
//	    List<WebElement> link = driver.findElements(By.tagName("a"));
//	    
//	    int n=link.size();
//	    
//	    System.out.println(n);
//	    
//	    for(WebElement e:link) {
//	    	
//	    	String name=e.getText();
//	    	
//	    	System.out.println(name);
//	    }
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement EmailBox=driver.findElement(By.id("email"));
		jse.executeScript("document"+EmailBox+"value='abc@gmail.com'");
//		EmailBox.sendKeys("abc@gmail.com");
		
		WebElement PassBox=driver.findElement(By.name("pass"));
		
		PassBox.sendKeys("balaji@12345");
		
        WebElement LoginBox=driver.findElement(By.name("login"));
        LoginBox.click();
        
        driver.close();	    
       
        
       
		
		
		
		
	}

}
