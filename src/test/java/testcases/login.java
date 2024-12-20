package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject1.homepage1;
import pageobject1.login_page;
import pageobject1.myaccountpage;
import testbase1.baseclass_1;

public class login extends baseclass_1
{
	
	@Test
	public void login_to_webshop()
	{
		try
		{
		homepage1 hp=new homepage1(driver);
		hp.click_top_login();
		
	    login_page lg=new login_page(driver);
		lg.enter_email(p.getProperty("A"));
		System.out.println(p.getProperty("A"));
		lg.enter_password(p.getProperty("B"));
		lg.Click_login();
		
		
		myaccountpage myacc=new myaccountpage(driver);
		Boolean displayedlogout =myacc.logout_buttondisplayed();
		
		Assert.assertTrue(displayedlogout);
		}
		catch(Exception e)
		{
			Assert.assertFalse(false);
		}
		
		//myacc.click_on_logout();
		
		

	}
	

}
