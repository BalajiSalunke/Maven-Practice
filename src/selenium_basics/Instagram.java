package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");

		driver.manage().window().maximize();

		WebElement IdBox = driver.findElement(By.name("username"));
		IdBox.sendKeys("balaji");
		boolean a=IdBox.isDisplayed ();
		boolean b=IdBox.isEnabled ();
		boolean c=IdBox.isSelected ();
		String d=IdBox.getTagName ();
		Dimension e=IdBox.getSize ();
		Point f=IdBox.getLocation();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		
		
		
		
		
//		WebElement PassBox = driver.findElement(By.name("password"));
//		PassBox.sendKeys("Balaji1423");
//		WebElement LoginBox = driver.findElement(By.className("             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    "));
//	    LoginBox.click();
//		driver.findElement(By.xpath("//div[text()=Log In]")).click();

	}

}
