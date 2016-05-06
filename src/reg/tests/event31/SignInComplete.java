
package src.reg.tests.event31;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class SignInComplete extends src.com.helper.Base
{
	@BeforeMethod
	public void start()
	{
		this.setupDriver();	
	}

	@Test
	public void generateEvent31()
	{
		this.signInStart();
		this.signInComplete();
	}


	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}	
}
