package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_TestNGKeyword3_priority2

{
	@Test                         //by default priority=0
	public void TC3()
	{
	Reporter.log("--running TC3--", true);	
	}
	@Test(priority=-2)              //-ve priority
	public void TC1()
	{
	Reporter.log("--running TC1--", true);
	}
	@Test(priority=3)             //duplicate priority
	public void TC4()
	{
	Reporter.log("--running TC4--", true);
	}

}
