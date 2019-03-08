
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownsAutosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		/* Instead using the same object multiple times, is better to create a WebElement
		 * where i will use only the "variable" for that specific object
		driver.findElement(By.cssSelector("input[id='hp-widget__sfrom']")).clear();
		driver.findElement(By.cssSelector("input[id='hp-widget__sfrom']")).sendKeys("MUM");
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("input[id='hp-widget__sfrom']")).sendKeys(Keys.ENTER);
		*/
		WebElement source = driver.findElement(By.cssSelector("input[id='hp-widget__sfrom']"));
		source.clear();
		source.sendKeys("JAL");
		Thread.sleep(2000L);
		for (int u=0;u<5;u++)
		{
			source.sendKeys(Keys.ARROW_DOWN);
		}
		source.sendKeys(Keys.ENTER);
		Thread.sleep(2000L);
		
		WebElement destination = driver.findElement(By.cssSelector("input[id='hp-widget__sTo']"));
		destination.clear();
		destination.sendKeys("DEL");
		Thread.sleep(2000L);
		for (int i=0;i<10;i++)
		{
			destination.sendKeys(Keys.ARROW_DOWN);
		}
		destination.sendKeys(Keys.ENTER);
		Thread.sleep(5000L);
		driver.quit();
		System.out.println("Test Case Pass");
	}

}
