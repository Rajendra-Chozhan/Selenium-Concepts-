package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_iFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome Driver\\chromedriver.exe");
		
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
	
		//iFrame is used to display a webpage inside a webpage
			Thread.sleep(5000);	
		 driver.switchTo().frame("moneyiframe"); //switching the frame by ID

			System.out.println("********We are switch to the iframe*******");
			Thread.sleep(5000);
  		WebElement a = driver.findElement(By.id("nseindex"));
  		  a.click();
       	Thread.sleep(5000);
 driver.quit();
			System.out.println("*********We are done***************");
	}

	
	
	
	
}
