import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("Hello World");
		driver.findElement(By.name("pw")).sendKeys("Bye World");
		//driver.findElement(By.className("button r4 wide primary")).click(); // It does not work
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'error\']")).getText());
		driver.quit();
		System.out.println("Test Case Pass");
	}

}
