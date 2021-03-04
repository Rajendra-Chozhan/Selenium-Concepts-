package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Link_Test {

	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome Driver\\chromedriver.exe");
		
		ChromeDriver  driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("SIGN-ON")).click();// giving the name in the Hyperlink 
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("rajchozhan024@gmail.com");// Abs X path 
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");// Ab x path 
		//driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	
		driver.findElement(By.linkText("registration form")).click(); // partial link text - giving the partial value 
		Thread.sleep(2000);
		driver.quit();
	}

}
