import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		String checkbox = driver.findElement(By.cssSelector("input[value='option3']")).getAttribute("value");
		System.out.println("The Value of checkbox is: " + checkbox);
		driver.findElement(By.cssSelector("input[value='option3']")).click();
		Select s = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		s.selectByValue(checkbox);
		driver.findElement(By.id("name")).sendKeys(checkbox);
		driver.findElement(By.id("alertbtn")).click();
		String alert = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(alert);
		if (alert.contains(checkbox))
		{
			System.out.println("Text of checkbox and editbox are similar");
		}
		else
		{
			System.out.println("Text of checkbox and editbox are different");
		}
		
		driver.quit();
		System.out.println("Test Case Pass");
	}

}
