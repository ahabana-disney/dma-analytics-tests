
package src.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignIn
{
	WebDriver driver;

	public SignIn(WebDriver driver)
	{
		this.driver = driver;
		driver.switchTo().frame(3);
	}

	By close = By.xpath("//button[@id='disneyid-close']");
	By username = By.xpath("//*[@id='username']");
	By password = By.xpath("//*[@id='password']");
	By signIn = By.xpath("//*[@id='log-in-button']");


	public WebElement close()
	{
		return driver.findElement(close);
	}

	public WebElement username()
	{
		return driver.findElement(username);
	}	

	public WebElement password()
	{
		return driver.findElement(password);	
	}

	public WebElement signIn()
	{
		return driver.findElement(signIn);
	}
}
