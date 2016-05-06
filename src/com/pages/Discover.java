
package src.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Discover
{
	WebDriver driver;

	public Discover(WebDriver driver)
	{
		this.driver = driver;
	}

	By firstThumbnail = By.xpath(".//*[@id='main-body']/div[2]/div/div[1]/div[3]");
	By coolCharactersBonus = By.xpath(".//*[@id='main-body']/div[2]/div/div[19]/div[3]");


	public WebElement firstThumbnail()
	{
		return driver.findElement(firstThumbnail);
	}

	public WebElement coolCharactersBonus()
	{
		return driver.findElement(coolCharactersBonus);
	}
}
