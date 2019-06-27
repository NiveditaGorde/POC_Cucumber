package ecommerce.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class PO_Login
{
	WebDriver driver;
	public PO_Login(WebDriver d)
	{
		this.driver=d;
	}
	//Locators
	@FindBy(how=How.XPATH,using="//span[text()='My Account']")
	private WebElement ClickMyAccount;
	@FindBy(how=How.XPATH,using="//a[@data-ca-target-id='login_block4']")
	private WebElement ClickSignin;
	@FindBy(how=How.XPATH,using="//div[@class='buttons-container clearfix buttons-container-picker']/div/button")
	private WebElement InPop_UpClickSignin;
	@FindBy(how=How.XPATH,using="//div[@role='dialog']")
	private WebElement validatePopup;
	@FindBy(how=How.XPATH,using="//div[contains(@class,'alert-success')]")
	private WebElement validatesucessfulLoginmsg;
	//Methods
	public void ClickOnMyAccount()
	{
		ClickMyAccount.click();
	}
	public void ClickOnSignin()
	{
		try
		{
		
		ClickSignin.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		public void OpenPop_upAndClickOnSignin()
		{
			try
			{
				Assert.assertEquals(true, validatePopup.isDisplayed());
				InPop_UpClickSignin.click();
		/*		String expected="Notice You have been successfully logged in.\r\n";
				String actual=validatesucessfulLoginmsg.getText();
				Assert.assertEquals(expected, actual); */
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}
		
		
	
		
}
