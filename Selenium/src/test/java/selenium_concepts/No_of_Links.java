package selenium_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_of_Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome Driver\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	
		List<WebElement> b = driver.findElements(By.tagName("a"));
		
		int sizeofb =b.size();
		
		System.out.println(sizeofb);
				
		for(int i=1;i<=sizeofb;i++)
		{
		
			WebElement a=b.get(i);
			String c=a.getText();
			System.out.println(c);
			driver.close();
								
		}
					
	}

}
