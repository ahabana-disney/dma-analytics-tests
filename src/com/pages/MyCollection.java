
package src.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyCollection
{
	WebDriver driver;

	public MyCollection(WebDriver driver)
	{
		this.driver = driver;
	}

	By signIn = By.xpath("//a[@class='signin']");
	By firstMyMoviesPoster = By.xpath(".//*[@id='my-collection']/dma-movie-slider[1]/div/dma-slider/div/div[1]/ul/li[1]/a/div/img");
	By tangledPoster = By.xpath("//img[@alt='Tangled']");

	public WebElement signIn()
	{
		return driver.findElement(signIn);
	}

	public WebElement firstMyMoviesPoster()
	{
		return driver.findElement(firstMyMoviesPoster);
	}

	public WebElement tangledPoster()
	{
		return driver.findElement(tangledPoster);
	}
}
