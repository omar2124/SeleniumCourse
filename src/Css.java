import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\login.salesforce.com");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("Hello Omar");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Password");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.quit();
		System.out.println("Test Case Pass");
	}

}
