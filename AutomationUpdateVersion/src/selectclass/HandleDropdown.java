package selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("file:///C:/Users/hp/OneDrive/Desktop/UniqueDropdown.html");
				
			
			//Identify that particular dropdown
			WebElement dropdown = driver.findElement(By.xpath("//select[@id='Dropdown']"));
			
			Select s = new Select(dropdown);
			
			//s.selectByIndex(6); Index
			
			//s.selectByValue("6"); value
			//s.selectByValue("Pakistan"); visible text
			
			// for loop
			for(int i =0; i<7; i++) {
				s.selectByIndex(i);
				Thread.sleep(3000);
				
				
				
			}
			
	
}
}