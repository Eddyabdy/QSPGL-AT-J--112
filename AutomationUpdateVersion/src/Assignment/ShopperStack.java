package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack {
	
	
	
public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://shoppersstack.com/");
		
		WebElement iphoneProduct = driver.findElement(By.xpath("//img[@alt='APPLE iPhone 14 Pro']"));
		iphoneProduct.click();
		
		WebElement checkDelivery = driver.findElement(By.id("Check Delivery"));
		checkDelivery.sendKeys("456123");
	WebElement check = driver.findElement(By.xpath("//button[@id='Check']"));
	check.click();
	

}
}