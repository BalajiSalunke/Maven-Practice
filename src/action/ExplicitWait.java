package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();

		WebElement alert = driver.findElement(By.xpath("//*[@id=\"alert\"]"));
		alert.click();
		WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(14));
		wdw.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		System.out.println("Alert handled sucessfully");

		WebElement disply = driver.findElement(By.id("populate-text"));
		disply.click();
		WebElement text = driver.findElement(By.xpath("//*[@id=\"h2\"]"));
		wdw.until(ExpectedConditions.textToBePresentInElement(text, "Selenium Webdriver"));
		String name = text.getText();
		System.out.println("Text presented after 10 sec is : "+name);

		WebElement button = driver.findElement(By.id("display-other-button"));
		button.click();
		WebElement buttontext = driver.findElement(By.id("hidden"));
		wdw.until(ExpectedConditions.visibilityOf(buttontext));
		boolean button1 = buttontext.isDisplayed();
		System.out.println("Button displayed after 10 sec : "+button1);
			
		WebElement enable = driver.findElement(By.id("enable-button"));
		enable.click();
		WebElement enableText = driver.findElement(By.id("disable"));
		wdw.until(ExpectedConditions.elementToBeClickable(enableText));
		boolean enableButton= enableText.isEnabled();
		System.out.println("Button enabled after 10 sec : "+enableButton);
		
		WebElement check = driver.findElement(By.id("checkbox"));
		check.click();
		WebElement checkBox = driver.findElement(By.id("ch"));
		wdw.until(ExpectedConditions.elementToBeSelected(checkBox));
		boolean checkBoxButton= checkBox.isSelected();
		System.out.println("Check box selected after 10 sec :"+checkBoxButton);
		
		System.out.println("All of the above 5 test cases pass successfully");
	}

}
