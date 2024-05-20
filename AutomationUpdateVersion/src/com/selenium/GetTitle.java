package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	
public static void main(String[] args) {
		
		//Launch the browsers
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//how to launch webapplication
		driver.get("https://amazon.com");
		
		//Use getTitle()
		String actual_title = driver.getTitle(); 
		
		if(actual_title.equals("Amazon.com. Spend less. Smile more.")) {
		
		System.out.println("title is correct");
		
		}
		
		else {
			System.out.println("title is wrong");
			
			
			
		}
		
}

}
