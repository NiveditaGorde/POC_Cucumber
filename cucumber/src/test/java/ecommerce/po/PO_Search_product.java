package ecommerce.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class PO_Search_product
{
	WebDriver driver;
	public PO_Search_product(WebDriver d)
	{
		this.driver=d;
	}
	@FindBy(how = How.ID,using = "search_input")
	private WebElement txtbx_search_box;
	
	@FindBy(how = How.CLASS_NAME,using = "ty-icon-search")
	private WebElement btn_submit;
	
	@FindBy(how = How.ID,using = "products_search_11")
	private WebElement container_search_products;


	public void SetSearchBox(String arg) 
	{
		txtbx_search_box.sendKeys(arg);
	}
	
	public void ClickSearchSumitButton() 
	{
		btn_submit.click();
	}
	
	public void validate_search_results()
	{
		Assert.assertEquals(true, container_search_products.isDisplayed());
	}
	
}
