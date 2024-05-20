package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	
	
public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	WebElement cnb = driver.findElement(By.linkText("Create new account"));
	//Fetch the height and width
	Dimension size = cnb.getSize();
	
	System.out.println(size);
	
	Point coordinate = cnb.getLocation();

	System.out.println(coordinate);
	
	
	
	
	
}
	
}
