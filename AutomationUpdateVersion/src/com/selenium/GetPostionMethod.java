package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPostionMethod {
	
public static void main(String[] args) {
	
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getPosition());

}
}