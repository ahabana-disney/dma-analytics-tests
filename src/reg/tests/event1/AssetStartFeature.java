
package src.reg.tests.event1;

import src.com.pages.Featured;
import src.com.pages.MyCollection;
import src.com.pages.MovieDetails;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class AssetStartFeature extends src.com.helper.Base
{
	@BeforeMethod
	public void start()
	{
		this.setupDriver();	
	}

	@Test
	public void myCollectionSignedIn()
	{
		this.signInStart();
		this.signInComplete();

		Featured featured = new Featured(driver);
		featured.navigationBarMyCollection().click();

		this.waitFiveSeconds();

		MyCollection myCollection = new MyCollection(driver);
		myCollection.firstMyMoviesPoster().click();

		this.waitFiveSeconds();
		
		MovieDetails movieDetails = new MovieDetails(driver);
		movieDetails.play().click();

		this.waitFiveSeconds();
	}

	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}	
}
