package Selenium_java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webelement_Commands2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		// Creating a object for chrome
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		// Search with mobiles
		WebElement ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		ele.sendKeys("Bletooth Speakrs");
		ele.submit();
		Thread.sleep(3000);

		Thread.sleep(5000);

		List<WebElement> items = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

		// Iterate through each element

		
		for (int i = 1; i <= items.size(); i++)
		{

			List<WebElement> itemText = driver
					.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
			List<WebElement> itemPrice = driver.findElements(By.xpath("//Span[@class='a-price-whole']"));
			String itemText1 = itemText.get(i).getText();
			String itemPrice1 = itemPrice.get(i).getText();

			

			System.out.println(i + ")Item Name is =" + itemText1 + i + " )and Item Price is= " + itemPrice1);

		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)","");
        WebElement next = driver.findElement(By.xpath("//*[text()='Next']"));
        next.click();
        
    	for (int i = 1; i <= items.size(); i++)
		{

			List<WebElement> itemText = driver
					.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
			List<WebElement> itemPrice = driver.findElements(By.xpath("//Span[@class='a-price-whole']"));
			String itemText1 = itemText.get(i).getText();
			String itemPrice1 = itemPrice.get(i).getText();

			

			System.out.println(i + ")Item Name is =" + itemText1 + i + " )and Item Price is= " + itemPrice1);

		}
    	
    	

    	
    		File file = new File("E:\\AutoIT\\Excel.xlsx");
    		
    		XSSFWorkbook book = new XSSFWorkbook();
    		 XSSFSheet	sheet = book.createSheet("TestData");
    		
    		XSSFRow row =  sheet.createRow(0);
    		row.createCell(0).setCellValue("Name");
    		row.createCell(1).setCellValue("Location");
    		row.createCell(2).setCellValue("Food");
    		
    		 Webelement_Commands2.writeData(1, "Venkat", "Hyderabad", "Thali");
    		 Webelement_Commands2.writeData(2, "Krishna", "Hyderabad", "Biryani");
    		 Webelement_Commands2.writeData(3, "Ravi", "Hyderabad", "Roti");
    		
    		FileOutputStream fos = new FileOutputStream(file);
    		book.write(fos);
    		fos.close();
    		book.close();
    		
    		//Read the data
    		FileInputStream fis = new FileInputStream(file);
    		XSSFWorkbook book1 = new XSSFWorkbook(fis);
    		XSSFSheet sheet1 = book1.getSheet("TestData");
    		
    		//Total no of rows
    		int rows = sheet1.getLastRowNum();
    		for(int i=0;i<=rows;i++) {
    			System.out.println(sheet1.getRow(i).getCell(0).getStringCellValue());
    			System.out.println(sheet1.getRow(i).getCell(1).getStringCellValue());
    			System.out.println(sheet1.getRow(i).getCell(2).getStringCellValue());
    		}
    		
        
        
        
        
		driver.close();
	}

	private static void writeData(int i, String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}

}
