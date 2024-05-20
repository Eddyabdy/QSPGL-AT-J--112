package keywordactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	
public static void main(String[] args) throws AWTException {
		
		

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.navigate().to("https://myntra.com");
	
	Robot r =new Robot();
	
	// to press the key
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_SHIFT);
	//r.keyPress((KeyEvent.VK_I);
	
	
	// to create relse the key
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_SHIFT);
	
	
	
	
	
	
	
	
	
	
	
}
	
}
