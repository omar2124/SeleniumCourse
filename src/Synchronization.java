import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // The whole script will wait no more than 5 second
		driver.get("https://www.cleartrip.com/hotels");
		
		WebDriverWait d= new WebDriverWait(driver,20); // Only when you use d. it will wait for maximun 20 second
		d.until(ExpectedConditions.elementToBeClickable(By.id("Tags")));
		driver.findElement(By.id("Tags")).sendKeys("dubai");
		d.until(ExpectedConditions.elementToBeClickable(By.id("Tags")));
		driver.findElement(By.id("Tags")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("CheckInDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		
		
		
		//System.out.println("Test Case Pass");
	}

}
