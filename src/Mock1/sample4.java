package Mock1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample4 
{
	
		public static void main(String[] args)
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			WebElement result = driver.findElement(By.xpath("(//img[@loading='eager'])[1]"));
			
			Actions act=new Actions(driver);
			act.doubleClick(result).perform();
		
		}

	}


