package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
	
	public static void main(String[] args) {
		
		//Launch the browsers
		WebDriver driver = new ChromeDriver();
		
	
		
		// How to maximize the window
		// Options opt = driver.manage();
		//Window win= opt.window();
		//win.maximize();
		
		// How to reduce codes 
		driver.manage().window().maximize();
		
		//how to launch webapplication
		driver.get("https://flipkart.com");
		
		
		
		
		
		
		
		
	}

}
