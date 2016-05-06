
package src.com.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import src.com.pages.Featured;
import src.com.pages.SignIn;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class Base
{
	protected WebDriver driver;
	
	public void setupDriver()
	{
		// setup driver
		String chrome = "E:\\20151005\\pc\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome);	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// navigate to qa
		driver.get("https://qa.disneymoviesanywhere.com/?home");
	}

	public void signInStart()	
	{	
		// click signin
		Featured featured = new Featured(driver);
		featured.navigationBarSignIn().click();
	}

	public void signInComplete()	
	{
		// complete signin
		SignIn signIn = new SignIn(driver);
		signIn.username().sendKeys("guzzmendoza@gmail.com");
		signIn.password().sendKeys("number11");
		signIn.signIn().click();
	}

	public void waitFiveSeconds()
	{
		try
		{
			Thread.sleep(5000L);
		}	
		catch (Exception e)
		{
			org.testng.Assert.fail();
		}
	}
}
