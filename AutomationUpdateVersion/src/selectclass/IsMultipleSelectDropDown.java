package selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleSelectDropDown {
	
	
public static void main(String[] args) {
	
	
	
	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
			
		
		//Identify the multi-select dropdown
		WebElement multiSelectDropdown = driver.findElement(By.id("select-multiple-native"));
		
		//Create object of select class
		
		Select s = new Select(multiSelectDropdown);
		boolean value = s.isMultiple();

		System.out.println(value);
	
	
	
	
}
	
	
	
	
	
	

}
