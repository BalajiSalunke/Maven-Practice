package excelSheet;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Excel {
	public String readData(int r,int c) throws IOException {
	//step-1 get the path	
	String path=System.getProperty("user.dir")+"\\TestData.xlsx";	
	
	//step-2 use file class
	File file = new File(path);
	
	//step-3 read file
	FileInputStream fis = new FileInputStream(file);
	
	//step-4 handling excel workbook
	XSSFWorkbook wb = new XSSFWorkbook(fis); 
	
	//step-5 locate sheet inside workbook
	XSSFSheet sheet= wb.getSheet("Sheet1");
	
	//step-6 get row and column
	XSSFRow row=sheet.getRow(r);
	XSSFCell cell=row.getCell(c);
	
	//step-7 get value from cell
	String value= cell.getStringCellValue();
	
	//step-8 close workbook
	wb.close();
	
	return value;
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		Excel ref = new Excel();
		
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\Chrome driver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/login");
		
		
		WebElement userName= driver.findElement(By.id("txtUsername"));
		userName.sendKeys(ref.readData(0, 0));
		WebElement password= driver.findElement(By.id("txtPassword"));
		password.sendKeys(ref.readData(1, 0));	
		Thread.sleep(2220);
		driver.close();
		
	}

}
