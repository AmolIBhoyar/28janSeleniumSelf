package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		boolean result = driver.findElement(By.xpath("//div[@id='splash-screen']")).isEnabled();
		
		System.out.println(result);
		
	}

}
