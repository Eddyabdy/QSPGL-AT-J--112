package mousActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClick {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		
		
		

		WebElement more = driver.findElement(By.xpath("//button[@id='btn30']"));
		
		
		// create the object of Actions class
		
		Actions act = new Actions(driver);
		//act.contextClick().perform(); // context method without argument it only right click on web  page
	
	//contectClick with argument
		
		act.contextClick(more).perform();
		
		WebElement yes = driver.findElement(By.xpath("(//div[@class ='py-1 ps-1 hover:bg-orange-300'])[1]"));
	
	yes.click();
	
	
	
	}
	

}
