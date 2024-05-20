package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatAirVistra {
	
	
public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.airvistara.com/in/en");
		
		// clicking on accept all button 
	WebElement cookies = driver.findElement(By.id("acceptAllBtn"));
	cookies.click();
	
	//click on one way trip radio button
      driver.findElement(By.id("onewaytrip")).click();
      //Thread.sleep(3000);
      
      
      // enter some value inside textfiled
      WebElement fromTextFiled = driver.findElement(By.xpath("//input[@name='flightSearchFrom"));
      fromTextFiled.sendKeys("PNQ",Keys.ARROW_DOWN,Keys.TAB);
      
      WebElement toTextField = driver.findElement(By.xpath("//input[@name='flightSearchTo"));
      toTextField.sendKeys("DXB",Keys.ARROW_DOWN.TAB);
      
      //click on departure
      WebElement departure = driver.findElement(By.id("departureCalendar"));
      departure.click();
      
      Thread.sleep(2000);
      
      //click on 27 date
      WebElement date = driver.findElement(By.xpath("//a[@date-date='27']"));
      date.click();
      
      
      
	// click on passengers
      WebElement passenger = driver.findElement(By.id("passengers"));
      passenger.click();
      
     Thread.sleep(3000);
     
      
      //start a for to select 4 adults
      for(int i =0;i<3; i++) {
    	  
    	  driver.findElement(By.xpath("//button[@id='adds_adult']")).click();
    	  try {
    		  
    	  
    	  Thread.sleep(2000);
    	  
      } catch (InterruptedException e) {
    	  e.printStackTrace();

    	  
      }
      }
    
 WebElement done = driver.findElement(By.xpath("//button[@class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']"));
 
 
}
}