
package src.reg.tests.event52;

import src.com.pages.Featured;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class NavigationClickMyCollection extends src.com.helper.Base
{
	@BeforeMethod
	public void start()
	{
		this.setupDriver();	
	}

	@Test
	public void executeTest()
	{
		Featured featured = new Featured(driver);
		featured.navigationBarMyCollection().click();
	}

	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}	
}
