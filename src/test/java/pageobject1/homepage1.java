package pageobject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage1 extends basepage_1{

	
	
	public WebDriver driver;

	public homepage1(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//a[@class='ico-register']")
	WebElement clickRegisterbuttonn;
	
	@FindBy(xpath="//a[normalize-space()='Log out']")  
	WebElement logOut;
	
	@FindBy(xpath="//a[normalize-space()='Log in']")
	WebElement top_logIn_button;
	
	
	
	public void click_top_login()
	{
		top_logIn_button.click();
	}
	public void click_logout()
	{
		logOut.click();
	}
	
	public void clickRegisterbuttonMn()
	{
		clickRegisterbuttonn.click();
	}
}
