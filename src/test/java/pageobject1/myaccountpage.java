package pageobject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myaccountpage extends basepage_1 {
	
	public myaccountpage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[@class='ico-logout']") 
	WebElement logout;
	
	public Boolean logout_buttondisplayed() 
	{
		Boolean displayed=logout.isDisplayed();
		return displayed;
	}
	public void click_on_logout() 
	{
		logout.click();	
	}
}

