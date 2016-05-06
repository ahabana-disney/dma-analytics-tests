
package src.reg.tests.event10;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class SignInStartFeatured extends src.com.helper.Base
{
	@BeforeMethod
	public void start()
	{
		this.setupDriver();	
	}

	@Test
	public void generateEvent10()
	{
		this.signInStart();
	}


	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}	
}
