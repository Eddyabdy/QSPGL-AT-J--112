package windowHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.flipkart.com/");
		
		
		WebElement search = driver.findElement(By.xpath("//input[@name ='q']"));
		search.sendKeys("iphone",Keys.ENTER);
	
		

		WebElement product = driver.findElement(By.xpath("(//div[@class = 'KzDlHZ'])[1]"));
		product.click();
		
		
		// usse getWindowHandle(

		for(String id: 
	
	
	
	
	
	
	
	
	
	
	
	
	

}
