package A_Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_Amazon_POM_Class 
{
	
	WebDriver driver;//4
	
	//declaration
	@FindBy(xpath = "//a[@id='nav-cart']") private WebElement CartIcon;
	
	//////////////////////////////////////////////////////////
	
	//initialization
	public A_Amazon_POM_Class(WebDriver driver)//3
	{
		//3-->2     2-->5   5-->4
				//5
		this.driver = driver;//2
		PageFactory.initElements(driver, this);//1
		
	}
	
	//////////////////////////////////////////////////////////

	
	//utilization
	public boolean VerifyCartIcon()
	{
		boolean Result = CartIcon.isDisplayed();
		return Result;
	}
	
	//////////////////////////////////////////////////////////


}
