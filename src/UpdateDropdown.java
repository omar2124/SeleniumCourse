import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000L);
		driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();
		//Select s = new Select(driver.findElement(By.cssSelector("div[id='divpaxinfo']")));
		
		driver.quit();
		System.out.println("Test Case Pass");
	}

}
