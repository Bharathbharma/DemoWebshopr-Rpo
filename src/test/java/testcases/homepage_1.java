package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject1.Registrationpage;
import pageobject1.homepage1;
import testbase1.baseclass_1;

public class homepage_1 extends baseclass_1{

	@Test
	public void registerpage()
	{
		
		homepage1 hp=new homepage1(driver);
		hp.clickRegisterbuttonMn();
		Registrationpage reg=new Registrationpage(driver);
		reg.mail_button();
		reg.firstNamem(randomstring());
		reg.lastNamem("kkk");
		reg.emailm(randomemail());
		reg.passwordm("bharma@123");
		reg.confirmPasswordm("bharma@123");
		reg.register_buttonm();
		Assert.assertEquals("Your registration completed", reg.Registrationcompletemsgm());
		System.out.println(reg.Registrationcompletemsgm());
		
		
	}
}
