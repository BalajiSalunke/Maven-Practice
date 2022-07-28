package alertHandling;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Chrome driver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("window.scroll(0,400)");
		
		WebElement radio= driver.findElement(By.xpath("//input[@value='Radio4']"));
		WebElement checkBox= driver.findElement(By.id("checkBoxOption2"));
		WebElement checkBox1= driver.findElement(By.id("checkBoxOption1"));
		radio.click();
		checkBox.click();
		
		Thread.sleep(3000);
		System.out.println(checkBox.isDisplayed());
		System.out.println(checkBox.isEnabled());
		System.out.println(checkBox.isSelected());
		System.out.println(radio.isDisplayed());
		System.out.println(radio.isEnabled());
		System.out.println(radio.isSelected());
		System.out.println(checkBox1.isDisplayed());
		System.out.println(checkBox1.isEnabled());
		System.out.println(checkBox1.isSelected());
		
		java.util.List<WebElement> allCheckBoxs= driver.findElements(By.xpath("//*[@class='extradiv col-lg-3 col-md-6 col-12']//label"));
		
		
	}}
