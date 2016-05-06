
package src.reg.tests.event1;

import src.com.pages.Featured;
import src.com.pages.Discover;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class AssetStartDiscover extends src.com.helper.Base
{
	@BeforeMethod
	public void start()
	{
		this.setupDriver();	
	}

	@Test
	public void bonusPlayMovieDetailsSignedIn()
	{
		this.signInStart();
		this.signInComplete();

		Featured featured = new Featured(driver);
		featured.navigationBarDiscover().click();

		Discover discover = new Discover(driver);
		discover.firstThumbnail().click();

		this.waitFiveSeconds();
	}

	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}	
}
