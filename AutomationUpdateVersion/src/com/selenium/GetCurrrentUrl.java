package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://facebook.com/");
		// capture the url
		
		String url = driver.getCurrentUrl();
		System.out.println("Url of facebook" + url);
		
		

	}

}
