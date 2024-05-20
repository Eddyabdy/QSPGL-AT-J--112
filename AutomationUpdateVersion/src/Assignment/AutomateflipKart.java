package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateflipKart {
	
	public static void main(String[] args) {
		
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://flipkart.com");
		
		// clicking on accept all button 
	driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
	
	List<WebElement> allProductName = driver.findElements(By.xpath("//dive[@class='KzD1HZ']"));
	
	for(WebElement name:allProductName) {
		String productName = name.getText();
	
		String productPrice = driver.findElement(By.xpath("//div[text()='"+productName+"']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bgj _4b5Dir']")).getText();
		System.out.println(productName+"----" + productPrice);
	}
	
	
	
	}

}
