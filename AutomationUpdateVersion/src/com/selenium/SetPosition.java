package com.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {
	
public static void main(String[] args) {
	
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Point p = new Point(100, 200);
		driver.manage().window().setPosition(p);

	
	
	
	
}

}
