
package src.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MovieDetails
{
	WebDriver driver;

	public MovieDetails(WebDriver driver)
	{
		this.driver = driver;
	}

	By play = By.xpath(".//*[@id='watch-featured']");
	By preview = By.xpath(".//*[@id='watch-trailer']");
	By tangledBonusThumbnail = By.xpath(".//*[@id='main-body']/div[3]/div/div[1]/div[2]/div[1]/ul/li[1]/div[2]");
	
	public WebElement play()
	{
		return driver.findElement(play);
	}

	public WebElement preview()
	{
		return driver.findElement(preview);
	}

	public WebElement tangledBonusThumbnail()
	{
		return driver.findElement(tangledBonusThumbnail);
	}
}	
