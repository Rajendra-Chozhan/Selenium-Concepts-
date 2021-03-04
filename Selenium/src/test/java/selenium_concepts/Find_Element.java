package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Find_Element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome Driver\\chromedriver.exe");
		
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	
		
	
		WebElement d = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[2]/div[1]/span[1]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(d).perform();
		WebElement e = driver.findElement(By.xpath("//body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[2]/span[1]"));
		
		e.click();
		

}}