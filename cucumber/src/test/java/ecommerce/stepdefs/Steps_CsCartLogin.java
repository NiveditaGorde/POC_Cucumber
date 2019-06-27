package ecommerce.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ecommerce.po.PO_Login;
import junit.framework.Assert;
import manager.Webdrivermanager;

public class Steps_CsCartLogin 
{
	WebDriver driver = Webdrivermanager.getDriver();
	Scenario scn ;
	PO_Login login = PageFactory.initElements(driver, PO_Login.class);
	@Before
	public void SetUp(Scenario s) 
	{
		this.scn = s;
	}
	@When("I click on My account link at the top right")
	public void clickOnMyAccountLink() 
	{
	  login.ClickOnMyAccount();
	  scn.write("click on My account link at the top ");
		
	}

	@When("and click on Sign in button")
	public void clickOnSigninButton() 
	{
		  login.ClickOnSignin();
		  scn.write("Clicked on signin Button");
		  
	}
	@When("sign in pop up is displayed")
	public void Openpop_up() 
	{
		  scn.write("validation of POP_UP is successfull");
		  
	}
	@When("username and password already entered")
	public void Enter_U_and_pwd_Already() 
	{
		  
		  scn.write("username and password already entered");
		  
	}
	@When("I click on sign in button")
	public void ClickOnSigninbuttonInpopup() 
	{
		  login.OpenPop_upAndClickOnSignin();
		  scn.write("click on sign in button in Pop_Up");
		 
		  
	}
	@Then("I am logged in to the application")
	public void loginapplication() 
	{
		//scn.write("validation for massage:'you have logged in successfully'is done");
		String expected = "Shopping Cart Software & Ecommerce Software Solutions by CS-Cart";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
		  scn.write("validation of the page title is successfull");
		  
	}
}
