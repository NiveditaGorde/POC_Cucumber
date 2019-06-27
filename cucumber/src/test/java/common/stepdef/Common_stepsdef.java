package common.stepdef;

import org.openqa.selenium.WebDriver;


import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import manager.Webdrivermanager;

public class Common_stepsdef
{
	
	WebDriver driver;
	static Webdrivermanager browserManager;
	Scenario scn ;

	@Before
	public void SetUp(Scenario s) 
	{
		this.scn = s;
	}
	
	@Given("navigate to url as {string}")
	public void navigate_to_url(String url) 
	{
		driver.get(url);
		scn.write("Navigated to URL: " + url);
	}
	
	@Given("As a user when I launch application in {string}")
	public void as_a_user_launch_application(String browser) 
	{
			driver = browserManager.getDriver();
			scn.write("Chrome Driver Invoked");
	}
	
	@Then("close the browser")
	public void close_the_browser() {
		
		//browserManager.CloseDriver();
		scn.write("Browser Closed");
	}
}



