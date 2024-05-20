package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFacebookSignUp {
	
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	WebElement CreatNewAccount = driver.findElement(By.xpath("//a[@role='button']"));
	CreatNewAccount.click();
	
	WebElement firstName = driver.findElement(By.xpath("//input[@name= 'firstname']"));
	firstName.sendKeys("Eddy");
	WebElement lastname = driver.findElement(By.xpath("//input[@name= 'lastname']"));
	firstName.sendKeys("Abdy");
	WebElement mobileNumber = driver.findElement(By.xpath("//input[@data-type='text']']"));
	mobileNumber.sendKeys("703-653-4802");
			
	WebElement newPassword = driver.findElement(By.xpath("//input[@data type= 'password']"));
	
	
	
		
		
		
		
		
	}	
	}
	
	
	
	
	
	
	
	
	
	
	
	


