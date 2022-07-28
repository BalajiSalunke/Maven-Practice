package alertHandling;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

public  void ScreenShot() throws InterruptedException {
	

//	Launching Chrome Browser	

	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");

//	Step -1 Launch browser

	WebDriver driver = new ChromeDriver();

//	Step -2 max window

	driver.manage().window().maximize();

//	Step -3 open web application

	driver.get("https://vctcpune.com/selenium/practice.html");
	
//	step- 4 scrolling
	
	JavascriptExecutor je= (JavascriptExecutor) driver;
	
	je.executeScript("window.scrollBy(0,700)");
	
//	 step-5 find drop down element
	
	WebElement dropDownButton=driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
	
//	step- 6-a using select class
	Select sel=new Select(dropDownButton);
	
	sel.selectByVisibleText("Option2");
	Thread.sleep(2000);
	
	sel.deselectByVisibleText("Option2");
//	List<WebElement>list=sel.getOptions();
//	
//	for(WebElement w:list) {
//	
//		String value=w.getText();
//		System.out.println(value);
//		if(value.equals("Option2")) {
//			w.click();
//		}
//	}
	
	Thread.sleep(2000);
	
	driver.close();
	
	
	
}
	
	
public static void main(String[] args) throws InterruptedException {

	
	
	DropDown ss= new DropDown();
	
	ss.ScreenShot();
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
