package ecommerce.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ecommerce.po.PO_AddToCart;
import ecommerce.po.PO_Login;
import ecommerce.po.PO_Search_product;
import junit.framework.Assert;
import manager.Webdrivermanager;

public class Steps_CsCartAddToCart 
{
	WebDriver driver = Webdrivermanager.getDriver();
	Scenario scn ;
	PO_Login login = PageFactory.initElements(driver, PO_Login.class);
	PO_Search_product search = PageFactory.initElements(driver,  PO_Search_product.class);
	PO_AddToCart addcart= PageFactory.initElements(driver, PO_AddToCart.class);
	@Before
	public void SetUp(Scenario s) 
	{
		this.scn = s;
	}
	@Then("product results are displayed")
	public void proudct_results_are_displayed()
	{
		scn.write("validating the Search results");
		search.validate_search_results();
		scn.write("validation of the Search results is successfull");
	}
	@When("I click on list view button")
	public void i_click_on_list_view() 
	{
	  addcart.listviewbtn();
	  scn.write("click on list view button");
		
	}
	
}
