package selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectClassMethod {
	
	
	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			
			driver.get("https://demoapps.qspiders.com/");
			WebElement UiClick = driver.findElement(By.xpath("//img[@alt='image not found']/ancestor::figure[@class='w-[4rem] h-[4rem] bg-[#f9c2c2] flex justify-center items-center rounded']"));
		
		
			UiClick.click();
			
			WebElement dropDown = driver.findElement(By.xpath("//section[@class='poppins text-[14px]']/ancestor::ul[@class='mt-1 ps-3 pe-4']"));
		
			dropDown.click();
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
