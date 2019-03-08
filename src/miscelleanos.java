import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class miscelleanos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mitelmex.telmex.com/web/hogar/registro");
		int number = findFrameNumber(driver,By.xpath("//*[@id=\"recaptcha-anchor\"]/div[5]"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[5]")).click();
		
		
		
	}
	public static int findFrameNumber(WebDriver driver, By by)
	{
		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();
		for (i=0;i<framecount;i++)
		{
			driver.switchTo().frame(i);
			int count = driver.findElements(by).size();
			if (count>0)
			{
				break;
			}
			else
			{
				System.out.println("Continue looping");
			}
		}
			driver.switchTo().defaultContent();
			return i;
		
	}
}
