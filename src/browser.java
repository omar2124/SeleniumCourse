import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		
		for (int i=0; i<1000;i++)
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			Thread.sleep(12000);
			driver.manage().window().maximize();
			Thread.sleep(12000);
			driver.quit();
			Thread.sleep(12000);
			System.out.println(i);
			Thread.sleep(12000);
		}
	}

}
