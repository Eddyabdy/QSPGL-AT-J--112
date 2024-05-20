package keywordactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KyesEnum {
	
	
	public static void main(String[] args) {
		
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// clicking on accept all button 
driver. findElement(By.xpath("//input[@name='username']")).sendKeys("Admin",Keys.TAB,"admin123",Keys.TAB,Keys.ENTER);
	
	
	
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static Object findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
