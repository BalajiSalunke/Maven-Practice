package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Progress_bar {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\Chrome driver\\\\chromedriver.exe");	
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/progress-bar");
		
		WebElement button=driver.findElement(By.id("startStopButton"));
		button.click();
		WebElement progressBar=driver.findElement(By.xpath("//*[@id=\"progressBar\"]//div"));	
		String perctenge=progressBar.getText();
		System.out.println(perctenge);
		
//		while(true) {
//			
//		
//		if(perctenge.equals("52%")) {
//			button.click();
//		}
//	}
	}
}
