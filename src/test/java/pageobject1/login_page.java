package pageobject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login_page extends basepage_1{
	public WebDriver driver;
	
	public login_page(WebDriver driver)
	{
		super(driver);
	}
	

@FindBy(xpath="//input[@id='Email']")  WebElement email;
@FindBy(xpath="//input[@id='Password']")  WebElement password;
@FindBy(xpath="//input[@value='Log in']")  WebElement logIn;

public void enter_email(String Emailid)
{
	email.sendKeys(Emailid);
}
public void enter_password(String pwd)
{
	password.sendKeys(pwd);
}
public void Click_login()
{
	logIn.click();
}


}
