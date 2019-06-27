package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			
		features = {"classpath:features/ecommerce"},
		glue= {"common/stepdef","ecommerce/stepdefs"},
		tags = {" @cs_cart_login"},
		plugin ={"pretty" , "html:target/CucumberResults",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true,
		dryRun=false

		)
	public class Test01Loginrunner 
	{

		
	}


