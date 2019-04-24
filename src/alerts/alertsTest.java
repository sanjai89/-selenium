package alerts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsTest
{
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\seleniumSoftware\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin");
		
		WebElement help = driver.findElement(By.linkText("Help"));
		help.click();
		Set<String> allWindowIDS = driver.getWindowHandles();
		for (String windowID : allWindowIDS)
		{
			driver.switchTo().window(windowID);
		}
		
	}
	}
	
		
		
	
