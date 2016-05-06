
package src.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Featured
{
	WebDriver driver;

	public Featured(WebDriver driver)
	{
		this.driver = driver;
	}

	By navigationBarSignIn = By.xpath("//a[@class='signin']");
	By navigationBarDiscover = By.xpath(".//*[@id='nav-discover']/a/span[2]");
	By navigationBarMyCollection = By.xpath("//*[@id='nav-mycollection']/a");
	
	public WebElement navigationBarSignIn()
	{
		return driver.findElement(navigationBarSignIn);
	}

	public WebElement navigationBarDiscover()
	{
		return driver.findElement(navigationBarDiscover);
	}

	public WebElement navigationBarMyCollection()
	{
		return driver.findElement(navigationBarMyCollection);
	}
}
