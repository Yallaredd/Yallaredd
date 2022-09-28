package Selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Bletooth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromiumdriver().setup();
		
		ChromeDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bletooth Speakrs");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		Thread.sleep(3000);
		 List <WebElement> items=driver.findElementsByXPath("//span[@class='a-size-medium a-color-base a-text-normal']");
		
		 for(int i=1;i<=items.size();i++) {
			 String s= items.get(i).getText();
			 System.out.println(i+" )"+s);
		 }
		
		//driver.quit();
		
		


	}
	

}
