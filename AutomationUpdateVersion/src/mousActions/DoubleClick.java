package mousActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		
		
		WebElement yesButton = driver.findElement(By.id("btn20"));
		
		// create the object of Actions class
		
		Actions act = new Actions(driver);
		act.doubleClick(yesButton).perform();
		
		act.doubleClick(driver.findElement(By.id("btn22"))).perform();
	
	
	
	
	}
}
