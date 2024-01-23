package A_Amazon_Execution;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import A_Amazon_QA.Driver_Factory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks 
{
	WebDriver driver;
	Driver_Factory DF;
	WebDriver Dobject;
	
	
	@Before
	public void LaunchBrowser() throws IOException
	{
		// Below four line of code define which browser we are going to launch (Chrome / Firefox)
		
		Properties Prop = new Properties();
		
		String Path = System.getProperty("user.dir")+"\\src\\test\\resources\\A_Amazon.properties";
		
		FileInputStream FIS = new FileInputStream(Path);
		
		Prop.load(FIS);
		
		
		
		// Now we are opening the browser by using below three lines
		
		String BName = Prop.getProperty("Browser");
		
		 DF = new Driver_Factory();
		
		 DF.InItBrowser(BName);
		
	//	driver.manage().window().maximize();
		
	}
	
	@After
	public void CloseBrowser() throws InterruptedException
	{
		
		 Dobject = Driver_Factory.GetDriver();
		 Thread.sleep(5000);
		Dobject.close();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
