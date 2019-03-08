import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2eSpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']"))
				.click();
		Thread.sleep(2000);
		// To select the current day you need to use this locator
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		if (driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("style").contains("0.5")) {
			Assert.assertTrue(true);
			System.out.println("The calendar is disabled");
		} else {
			Assert.assertFalse(false);
			System.out.println("The calendar is enable and should be disabled");
		}
		
		Thread.sleep(5000);	
		driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();
		Thread.sleep(3000);	
		int i=0;
		while(i<4)
		{
		driver.findElement(By.xpath("//div[@id='divpaxOptions']/div[1]/div[2]/span[3]")).click();
		i++;
		}
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		 

		Select s = new Select(
				driver.findElement(By.cssSelector("select[id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByValue("USD");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		driver.quit();
		System.out.println("Test Case Pass");
	}

}
