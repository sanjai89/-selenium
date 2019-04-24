package firstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample
 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\seleniumSoftware\\chromedriver.exe");
		
     {
		WebDriver driver = new ChromeDriver();
		//driver.manage().deleteCookieNamed("yt.innertube::requests");
		driver.get("https://www.gmail.com/");
		
		WebElement userName = driver.findElement(By.id("Use another account"));
		userName.click();
		
		WebElement userName1 = driver.findElement(By.id("email"));
		userName.click();
		userName.sendKeys("surendarsanjai@gmail.com");
		userName.click();

		WebElement password = driver.findElement(By.id("pass"));
		password.click();
		password.sendKeys("charu@1234");
		//nxtBtn.click();
		
		
		
		Thread.sleep(5000);
		driver.quit();
	}}
}
