import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		if (driver.findElement(By.id("results")).isDisplayed())
		{
			System.out.println("There is something wrong");
		}
		else
		{
			System.out.println("Text is not present yet, you need to click the link");
		}
		driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
		WebDriverWait d= new WebDriverWait(driver,10); 
		d.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("results"))));
		System.out.println(driver.findElement(By.id("results")).getText());
		if (driver.findElement(By.id("results")).isDisplayed())
		{
			System.out.println("Test case Passed");
		}
		else
		{
			System.out.println("Test case Failed");
		}
		
		driver.quit();
	}

}
