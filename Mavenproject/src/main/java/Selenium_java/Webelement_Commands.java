package Selenium_java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webelement_Commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		

	

	

		// Creating a object for chrome
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		

		// Search with mobiles
	WebElement ele=	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			
			ele.sendKeys("Bletooth Speakrs");
			ele.submit();
		Thread.sleep(3000);
		
	//	driver.findElement(By.xpath("//*[@class=\'a-size-medium a-color-base a-text-normal\']"));

		Thread.sleep(5000);

		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,200)", "");
		 */
		// Get the each mobile name and price
		List<WebElement> items = driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']"));

		// Iterate through each element
		for (int i = 1; i <= items.size() ; i++)
		{
			/*
			 * WebElement itemName =dr
			 * By.xpath([//*[@class="a-size-medium a-color-base a-text-normal"]](i)); By
			 * price = By.xpath("[//*[@class='a-price-whole']](i)"); 
			 * 
			 * String itemText = driver.findElement(itemName).getText(); String itemPrice =
			 * driver.findElement(price).getText();
			 * WebElement page=driver.findElement(By.xpath("//a[@aria-label='Go to page["+ i +"]']"));
			
			page.click();
			
			 */
			WebElement itemText=driver.findElement(By.xpath("[[@class='a-size-medium a-color-base a-text-normal']](i)"));
			WebElement itemPrice=driver.findElement(By.xpath("[//Span[@class='a-price-whole']](i)"));
			String itemText1 = itemText.getText();
			String itemPrice1 = itemText.getText();
			
			System.out.println("Item Name is " + itemText1 + " and Item Price is " + itemPrice1);
			
		}

	}

}
