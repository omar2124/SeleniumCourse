import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDynamics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		Thread.sleep(2000L);
		/*
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		This options does not work is necessary to use Parent to child to locate the object
		*/
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000L);
		Select s = new Select(driver.findElement(By.cssSelector("select[id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByValue("USD");
		Thread.sleep(2000L);
		driver.quit();
		System.out.println("Test Case Pass");
	}

}
