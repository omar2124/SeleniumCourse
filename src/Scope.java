import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println((driver.findElements(By.tagName("a")).size()));
		WebElement fd = driver.findElement(By.id("gf-BIG"));
		System.out.println(fd.findElements(By.tagName("a")).size());
		WebElement fc = fd.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(fc.findElements(By.tagName("a")).size());
		int i;
		for (i=1;i<fc.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			fc.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(4000);			
		}
		Set<String>abc=driver.getWindowHandles();
		Iterator<String>it=abc.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		driver.quit();
		System.out.println("Test Case Pass");
	}

}
