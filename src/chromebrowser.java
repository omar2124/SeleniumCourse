import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\facebook.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Hello Omar");
		//driver.findElement(By.id("email")).sendKeys("omarmerka@hotmail.com");
		//driver.findElement(By.cssSelector("#email")).sendKeys("hola");
		
		//driver.findElement(By.name("pass")).sendKeys("1234");
		//driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.findElement(By.id("u_0_2")).click();
		
		driver.navigate().back();
		//driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
		driver.quit();
		System.out.println("Test Case Pass");
	}

}
