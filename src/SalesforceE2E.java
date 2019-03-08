import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceE2E {

	public static void main(String[] args) {
		// This exercise is to use the regular expression for Css and Xpath
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Hello Omar");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("1234325562455");
		driver.findElement(By.xpath("//input[contains(@name, 'proc')]")).click();
		
		driver.quit();
		System.out.println("Test Case Pass");
	}

}
