package A_Amazon_QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver_Factory 
{
	static WebDriver driver;
	
	public WebDriver InItBrowser(String BrowserName) 
	{
		if(BrowserName.contains("Chrome"))
		{
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
		}
		else if(BrowserName.contains("FireFox"))
		{
			 driver = new FirefoxDriver();
		}
		
		return driver;
		
	}
	
	public static WebDriver GetDriver()
	{
		return driver;
	}

}
