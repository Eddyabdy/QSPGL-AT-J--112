package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue {

	
	
	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		
		WebElement cnb = driver.findElement(By.linkText("Create new account"));
		
		
		// identify weblement color
		String color = cnb.getCssValue("color");
		System.out.println(color);
				
		// identify font size
		String fontSize = cnb.getCssValue("font-size");
		System.out.println(fontSize);
		
		
		
	}
	
	
	
	
	
	
	
	
}
