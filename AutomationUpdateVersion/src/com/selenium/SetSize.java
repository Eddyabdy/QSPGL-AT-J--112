package com.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
	
public static void main(String[] args) {
	
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Dimension dim = new Dimension(150, 200);
		driver.manage().window().setSize(dim);

}
}