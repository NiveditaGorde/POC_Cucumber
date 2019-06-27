package ecommerce.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ecommerce.po.PO_Search_product;
import junit.framework.Assert;
import manager.Webdrivermanager;

public class Steps_CsCartProductSearch
{
	WebDriver driver = Webdrivermanager.getDriver();
	Scenario scn ;
	PO_Search_product search = PageFactory.initElements(driver,  PO_Search_product.class);
	@Before
	public void SetUp(Scenario s) 
	{
		this.scn = s;
	}
	@When("I enter {string} in top search box")
	public void i_enter_product_in_top_search_box(String productname) {
	  
	  search.SetSearchBox(productname);
	  scn.write("Product entered in the Search box: " + productname);
		
	}

	@When("click on search submit button")
	public void click_on_search_submit_button() {
		  search.ClickSearchSumitButton();
		  scn.write("Clicked on Search Button");
		  
	}

	@Then("page navigates to product search results")
	public void page_navigates_to_product_search_results() {
		String expected = "Search results";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
		scn.write("validation of the page title is successfull");
	}

	@Then("proudct results are displayed")
	public void proudct_results_are_displayed() {
		scn.write("validating the Search results");
		search.validate_search_results();
		scn.write("validation of the Search results is successfull");
	}


	


}
