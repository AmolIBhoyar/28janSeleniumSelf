package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_isenable1 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean result=driver.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
		System.out.println(result);
		if(result)	
		{
			System.out.println("is enable");
		}
		else
		{
			System.out.println("is diesable");
		}
			
			}

}
