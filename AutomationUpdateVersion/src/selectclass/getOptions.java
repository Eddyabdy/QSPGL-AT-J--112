package selectclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptions {
	
	
	
	
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
		
	
	//print all options
			
			List<WebElement> allOptions = s.getOptions();//
//	
//	// take each for loop or for loop
//	for(WebElement option: allOptions) {
//		
//		//System.out.println(option);  // this will print the object address of paticular web elemnt it should go with get.
//		
//		System.out.println(option.getText()); // print all the values in console
			
			
			for(int i=0; i<allOptions.size() ;i++) {  // size() will return how many webElement are presnt
			
			System.out.println(allOptions.get(i).getText());
			
			
			}	
	
	}
	
	
	}
		

	

