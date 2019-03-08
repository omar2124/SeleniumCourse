import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class e2eClearTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		//Select From
		driver.findElement(By.cssSelector("input[id='FromTag']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[id='FromTag']")).clear();
		driver.findElement(By.cssSelector("input[id='FromTag']")).sendKeys("GUAD");
		Thread.sleep(5000);	
		driver.findElement(By.cssSelector("input[id='FromTag']")).sendKeys(Keys.ENTER);
		//Select Destination
		driver.findElement(By.xpath("//input[@id='ToTag']")).click();
		driver.findElement(By.xpath("//input[@id='ToTag']")).sendKeys("NEW Y");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='ToTag']")).sendKeys(Keys.ENTER);
		//Select the current day
		driver.findElement(By.cssSelector(".ui-datepicker-days-cell-over.undefined.selected")).click();
		//Select any number of adults
		Select a= new Select(driver.findElement(By.id("Adults")));
		a.selectByValue("6");
		//Select any number of children
		Select c= new Select(driver.findElement(By.id("Childrens")));
		c.selectByValue("2");
		//Select any number of infants
		Select i= new Select(driver.findElement(By.id("Infants")));
		i.selectByValue("6");
		//Select more options link
		driver.findElement(By.cssSelector("a[id='MoreOptionsLink']")).click();
		//Select class of travel
		Select cl= new Select(driver.findElement(By.xpath("//select[@id='Class']")));
		cl.selectByValue("First");
		//Select Preferred airline
		driver.findElement(By.name("airline")).click();
		driver.findElement(By.name("airline")).clear();
		driver.findElement(By.name("airline")).sendKeys("aerome");
		Thread.sleep(5000);
		driver.findElement(By.name("airline")).sendKeys(Keys.ENTER);
		//Click to search
		driver.findElement(By.id("SearchBtn")).click();
		Thread.sleep(20000);
		System.out.println(driver.findElement(By.xpath("//div[@class='warningMessage']")).getText());
		Thread.sleep(20000);
		driver.quit();
		System.out.println("Test Case Pass");
	}

}
