package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCssValue {

	
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	WebElement cnb = driver.findElement(By.linkText("Create new account"));
	
	String color = cnb.getCssValue("color");
	System.out.println("Color is :"+color);	
	
	String fontSize = cnb.getCssValue("font-size");
	
	System.out.println("Font size is "+fontSize);
	
	
}
}