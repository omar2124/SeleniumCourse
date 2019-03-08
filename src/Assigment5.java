import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys("uni");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script); // Execute the function
		int i=0;
		while (!text.equalsIgnoreCase("United States"))
		{
			i++;
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script); 
			System.out.println(text);
			Thread.sleep(500);
			if (i>8)
			{
				break;
			}
		}
		if (i>8)
		{
			System.out.println("The element was not found");
		}
		else
		{
			System.out.println("The element is present");
		}
		
		
	}

}
