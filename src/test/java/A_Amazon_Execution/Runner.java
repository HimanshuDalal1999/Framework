package A_Amazon_Execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"src\\test\\resources\\A_Amazon_Execution\\A_Amazon.feature"},
		
		glue = {"A_Amazon_Execution"},
		
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)

public class Runner extends AbstractTestNGCucumberTests
{

}
