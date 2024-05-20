package selectclass;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDublicateFromDropdown {
	
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("file:///C:/Users/hp/OneDrive/Desktop/newDropdown.html");
				
			
			//Identify the dropdown
			WebElement dropdown = driver.findElement(By.id("Dropdown"));
			
			// Create the object of the select class
			Select s = new Select(dropdown);
			
			// Use get options
		List<WebElement>allOptions= s.getOptions();
		
			
			TreeSet<String> set = new TreeSet<String>();
			
			for(int i =0; i<allOptions.size(); i++) {
				
				
			String value = allOptions.get(i).getText();
			set.add(value);
				
				
			}
			
			
			
			
	// to print the values present inside tree set. 
	
	
	
	for(String opt: set ) {
		
		System.out.println(opt);
		
	}
	
	
	
	
	
	

}

	
	}
