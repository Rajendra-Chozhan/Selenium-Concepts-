package selenium_concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Class {

	public static void main(String[] args) throws AWTException, InterruptedException {
	
	
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome Driver\\chromedriver.exe");
		
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		 driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();	
		 
		 
         Robot robot = new Robot();  // Robot class throws AWT Exception	
         Thread.sleep(2000); // Thread.sleep throws InterruptedException	
        // robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
         
         Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
         robot.keyPress(KeyEvent.VK_TAB);	
         Thread.sleep(2000);	
         robot.keyPress(KeyEvent.VK_TAB);	
         Thread.sleep(2000);	
         robot.keyPress(KeyEvent.VK_TAB);	
         Thread.sleep(2000);	
         robot.keyPress(KeyEvent.VK_ENTER);	
     // press enter key of keyboard to perform above selected action	
         Thread.sleep(8000);
         driver.quit();
	
	}

}
