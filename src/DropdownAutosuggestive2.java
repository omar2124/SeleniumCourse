import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownAutosuggestive2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("beng");
		//Javascript DOM can extract hidden elements, because Seleniumc cannot identify hidden elements (Ajax implementation)
		//Investigate the properties of object if it have any hidden text
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;"; // Get the text
		String text = (String) js.executeScript(script); // Execute the function
		System.out.println(text); // Just print the value
		int i=0;
		while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT"))
		{
			i++;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script); 
			System.out.println(text);
			if (i>10)
			{
				break;
			}
		}
		if (i>10)
		{
			System.out.println("Option is not present");
		}
		else
		{
			System.out.println("Element was found");
		}
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ENTER);
		
		
	}

}
