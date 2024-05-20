package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateDemoWebShopPage {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement loginButton = driver.findElement(By.xpath("//a[@class='ico-login']"));
		loginButton.click();
		
		WebElement putEmail = driver.findElement(By.id("Email"));
		putEmail.sendKeys("eddy.abdy@yahoo.com");
		
		WebElement putPassword = driver.findElement(By.id("Password"));
		putPassword.sendKeys("A88594959a$");
		
		WebElement login = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		login.click();
		
		
		
		WebElement addToCart = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/ancestor::div[@class='details']/descendant::input[@value='Add to cart']"));
		addToCart.click();
		
		WebElement clcikOnCart = driver.findElement(By.xpath("(//span[@class='cart-label'])[1]"));
		clcikOnCart.click();
		
	
		WebElement GoToCart = driver.findElement(By.xpath("(//input[@value='Go to cart']"));
		GoToCart.click();
		
		Thread.sleep(3000);

		WebElement agreeButton = driver.findElement(By.id("termsofservice"));
		agreeButton.click();
		

	}

}
