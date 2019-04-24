package firstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstScript {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\seleniumSoftware\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().deleteCookieNamed("yt.innertube::requests");
		driver.get("https://www.facebook.com/");
		
		//user nam sendkeys
		
		WebElement subBtn = driver.findElement(By.id("submit button_12"));
		
		//email addres  send
		
		subBtn.click();
		
		subBtn.click();
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.click();
		userName.sendKeys("Aravind@fb.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.click();
		password.sendKeys("Aravind");
		
		
		WebElement submitBtn = driver.findElement(By.id("u_0_2"));
		submitBtn.click();
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
