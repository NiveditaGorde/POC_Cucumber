package ecommerce.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class PO_AddToCart 
{
	WebDriver driver;
	public PO_AddToCart(WebDriver d)
	{
		this.driver=d;
	}
	//Locators
	@FindBy(how=How.XPATH,using="")
	WebElement btn_listView;
	@FindBy(how=How.XPATH,using="//div[@class='ty-compact-list']")
	WebElement validatelistview;
	@FindBy(how=How.ID,using="button_cart_217")
	WebElement clickaddtocart;
	
	//Methods
	public void listviewbtn()
	{
		try {
		btn_listView.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void validate_ListOfView()
	{
		try {
		Assert.assertEquals(true, validatelistview.isDisplayed());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
