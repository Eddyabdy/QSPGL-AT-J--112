package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWIthNavigate {
	
	

	public static void main(String[] args) throws InterruptedException {
	
		
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		Thread.sleep(2000);
		
		// Launch application by using navigate method
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(2000);
		// to go back
		driver.navigate().back();
		Thread.sleep(2000);
		
		// to go forward
		driver.navigate().forward();
		Thread.sleep(2000);
		
		// to refresh the browser
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.close();
		
		
		

}
}