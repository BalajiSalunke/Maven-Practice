package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		String size = driver.findElement(By.id("txtUsername")).getCssValue("font-size");
		String colour = driver.findElement(By.id("txtUsername")).getAttribute("title");
		String font = driver.findElement(By.id("txtUsername")).getCssValue("font-type");
		String backgoundColour = driver.findElement(By.id("txtUsername")).getCssValue("background-color");
		
		System.out.println("font size is "+size);
		System.out.println("font colour is "+colour);
		System.out.println("font type is "+font);
		System.out.println("Background colour is "+backgoundColour);
		driver.close();
//		IdBox.sendKeys("balaji");
//		WebElement PassBox = driver.findElement(By.name("password"));
//		PassBox.sendKeys("Balaji1423");
//		//WebElement LoginBox = driver.findElement(By.className("qF0y9Igw0EIwRSHeGOVacqo54EzTmbkEs3CovQjjKUp7DhRcB"));
//	    //LoginBox.click();
//		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		
//		System.out.println(IdBox.getCssValue("font-size"));
//		System.out.println(IdBox.getCssValue("font-colour"));
//		System.out.println(IdBox.getCssValue("font-type"));
//		System.out.println(IdBox.getCssValue("background-colour"));
	}

}
