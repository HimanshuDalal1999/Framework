package A_Amazon_Execution;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import A_Amazon_Pages.A_Amazon_POM_Class;
import A_Amazon_QA.Driver_Factory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Step_Definitions 
{
	WebDriver driver;
    A_Amazon_POM_Class Apom = new A_Amazon_POM_Class(Driver_Factory.GetDriver());

	
	@Given("User should be at HomePage")
	public void user_should_be_at_home_page() 
	{
	     driver = Driver_Factory.GetDriver();
	     driver.get("https://www.amazon.in/");
	}

	@Then("User should be able to see the CartIcon")
	public void user_should_be_able_to_see_the_cart_icon() 
	{
	    boolean Result = Apom.VerifyCartIcon();
	    Assert.assertTrue(Result);
	}

}
