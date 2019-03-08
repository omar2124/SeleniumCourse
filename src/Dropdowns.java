import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://odm.com.mx/");
		Select s = new Select(driver.findElement(By.cssSelector("select[name='adultos']")));
		s.selectByIndex(2);
		s.selectByIndex(6);
		s.selectByVisibleText("10");
		
		driver.quit();
		System.out.println("Test Case Pass");
	}

}
