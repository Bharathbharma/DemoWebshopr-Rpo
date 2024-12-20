package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.dataprovder;
import pageobject1.homepage1;
import pageobject1.login_page;
import pageobject1.myaccountpage;
import testbase1.baseclass_1;

public class T001_validate_loginpage extends baseclass_1{
	
	
	@Test(dataProvider="testuserid" ,dataProviderClass=dataprovder.class)
	public void verifyloginpage(String email ,String pwd,String Expected )
	{
		try
		{
    	homepage1 hp=new homepage1(driver);
	    hp.click_top_login();
	
        login_page lg=new login_page(driver);
	    lg.enter_email(email);
	    lg.enter_password(pwd);
	    lg.Click_login();
	    myaccountpage myacc=new myaccountpage(driver);
		Boolean displayedlogout =myacc.logout_buttondisplayed();
		Assert.assertTrue(displayedlogout);
		if(Expected.equalsIgnoreCase("valid"))
		{
			
		  if (displayedlogout=true)
	     	 {
			    myacc.click_on_logout();
			    Assert.assertTrue(true);
	         }
	      else
	    	 {
			  Assert.assertFalse(false);
	    	 }
		} 
		if(Expected.equalsIgnoreCase("invalid"))
		{
			if(displayedlogout=true)
			{
			myacc.click_on_logout();
			Assert.assertTrue(false);
			}
		
		    else
		    {
			Assert.assertTrue(true);
		    }
		}
		
		}
	catch(Exception e)
	{
		Assert.assertFalse(false);
	}
	     
	}
		

}
