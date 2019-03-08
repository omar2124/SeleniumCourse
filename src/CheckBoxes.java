
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		System.out.println("Number of checkboxes: " + driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		System.out.println("The checkbox is: " + driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println("The checkbox is: " + driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		driver.quit();
		System.out.println("Test Case Pass");
	}

}
