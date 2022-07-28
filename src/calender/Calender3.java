package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://v5.material.angular.io/components/datepicker/overview");

		driver.manage().window().maximize();

		WebElement button = driver.findElement(
				By.xpath("//*[@class='mat-input-suffix mat-form-field-suffix ng-tns-c21-3 ng-star-inserted']"));

		button.click();

		while (true) {
			WebElement monthButton = driver.findElement(By.xpath("//button[@class='mat-calendar-period-button mat-button']//span[@class='mat-button-wrapper']"));

			String monthButton1 = monthButton.getText();
			System.out.println(monthButton1);
			if (!monthButton1.equalsIgnoreCase("MAR 2020")) {

			driver.findElement(By.xpath("//button[@class='mat-calendar-previous-button mat-icon-button']")).click();
				
					

			} else {
				break;
			}

		}
		driver.findElement(By
				.xpath("//*[@class=\"mat-calendar-content\"]//mat-month-view//table//tbody//tr//td//div[text()='11']"))
				.click();

	}

}
