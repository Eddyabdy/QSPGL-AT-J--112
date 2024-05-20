package selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithExplicitWait {
	
	
	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			
			driver.get("https://shoppersstack.com/");
			WebElement UiClick = driver.findElement(By.xpath("//dive[@class='featuredProducts_cardFooter_B8KN4']"));
			WebElement option2 = driver.findElement(By.xpath("//input[@id='Check Delivery']"));
					option2.sendKeys("123456");
					WebElement checkButton = driver.findElement(By.xpath("//button[@id='Check']"));
					
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(checkButton));
			checkButton.click();
	

}
}