import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.findElement(By.cssSelector("input[value='Cheese']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElements(By.cssSelector("input[name='group1']")).size());
		int count= driver.findElements(By.cssSelector("input[name='group1']")).size();
		for (int i=0;i<count;i++)
		{
			driver.findElements(By.cssSelector("input[name='group1']")).get(i).click();
			System.out.println(driver.findElements(By.cssSelector("input[name='group1']")).get(i).getAttribute("Value"));
			Thread.sleep(2000);
		}
		
		for (int u=0;u<count;u++)
		{
			String text=(driver.findElements(By.cssSelector("input[name='group1']")).get(u).getAttribute("Value"));
			//System.out.println(text);
			Thread.sleep(2000);
			if (text.equals("Butter"))
			{
				System.out.println("I am inside the first if");
				driver.findElements(By.cssSelector("input[name='group1']")).get(u).click();
			}
		}
		Thread.sleep(2000);
		System.out.println("------------------------------------------------------------------------");
		
		System.out.println(driver.findElements(By.cssSelector("input[name='group2']")).size());
		int count2= driver.findElements(By.cssSelector("input[name='group2']")).size();
		for (int z=0;z<count2;z++)
		{
			driver.findElements(By.cssSelector("input[name='group2']")).get(z).click();
			System.out.println(driver.findElements(By.cssSelector("input[name='group2']")).get(z).getAttribute("Value"));
			Thread.sleep(2000);
		}
		
		for (int x=0;x<count2;x++)
		{
			String text=(driver.findElements(By.cssSelector("input[name='group2']")).get(x).getAttribute("Value"));
			//System.out.println(text);
			Thread.sleep(2000);
			if (text.equals("Beer"))
			{
				System.out.println("I am inside the second if");
				driver.findElements(By.cssSelector("input[name='group2']")).get(x).click();
			}
		}
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Test Case Pass");
	}

}
