
package src.reg.tests.event1;

import src.com.pages.Featured;
import src.com.pages.MyCollection;
import src.com.pages.MovieDetails;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class AssetStartBonus extends src.com.helper.Base
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
		featured.navigationBarMyCollection().click();

		this.waitFiveSeconds();

		MyCollection myCollection = new MyCollection(driver);
		myCollection.tangledPoster().click();

		this.waitFiveSeconds();

		MovieDetails movieDetails = new MovieDetails(driver);
		movieDetails.tangledBonusThumbnail().click();
		
		for (int i = 0; i < 3; i++)
		{
			this.waitFiveSeconds();
		}
	}

	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}	
}
