package alertHandling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\Edge driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.irctc.com/");

		driver.manage().window().maximize();

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("window.scroll(0,700)"); // scroll down
		Thread.sleep(2000);

		jse.executeScript("window.scrollBy(0,-700)"); // scroll up
		Thread.sleep(2000);

		driver.close();

	}

}
