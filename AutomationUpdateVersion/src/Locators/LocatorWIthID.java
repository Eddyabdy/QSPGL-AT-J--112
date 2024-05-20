package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorWIthID {

	
	
	
	public static void main(String[] args) {
		
	
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			WebElement seachTextField = driver.findElement(By.id("small-searchterms"));
			seachTextField.sendKeys("books");
			
			WebElement seachTextField1 = driver.findElement(By.className("search-box-button")); // no space is not allowed
			seachTextField1.click();
		
		
		
	}
}
