package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWithGetPageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		
		//fetch the source code
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
	
	
		
		

	}

}
