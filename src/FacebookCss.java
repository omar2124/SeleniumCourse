import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\facebook.com");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("MyOwnCss");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		driver.quit();
		System.out.println("Test Case Pass");
	}

}
