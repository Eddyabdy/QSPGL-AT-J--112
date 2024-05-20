package webelemnetmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		
	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://flipkart.com");
		
		//Thread.sleep(2000);
		
		//identify the search
	driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
	
	
	
	//Thread.sleep(2000);
	driver.findElement(By.name("q")).clear();
	
	driver.findElement(By.name("q")).sendKeys("laptop", Keys.ENTER);
	
		
		
		
		
		
		
		
		
		
		

	}

}
