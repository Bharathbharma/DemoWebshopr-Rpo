package pageobject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registrationpage extends basepage_1{
	
	public WebDriver driver;

	public Registrationpage(WebDriver driver)
	{
		super(driver);
	}


	@FindBy(xpath="//input[@id='FirstName']")  
	WebElement firstName;

	@FindBy(xpath="//input[@id='LastName']")  
	WebElement lastName;

	@FindBy(xpath="//input[@id='Email']")  
	 WebElement email;

	@FindBy(xpath="//input[@id='Password']")  
	 WebElement password;

	@FindBy(xpath="//input[@id='ConfirmPassword']")  
	 WebElement confirmPassword;

	@FindBy(xpath="//input[@id='register-button']")  
	 WebElement register_button;
		
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement genderbuttonmail;
		
	@FindBy(xpath="//input[@id='gender-female']")
	WebElement genderbuttonFemail;
	
	@FindBy(xpath="//li[text()='The specified email already exists']")
	WebElement Errormsg;

    @FindBy(xpath="//div[@class='result']")
    WebElement Registrationcompletemsg;

    
    //-------------------------------------------Action methods-----------------------------------------------------------
    public String Registrationcompletemsgm()
    {
    	String regcomplete=Registrationcompletemsg.getText();
    	return regcomplete;
    }

	public String Errormsgm()
	{
		String errormessage=Errormsg.getText();
		return errormessage;
	}
	public void mail_button()
	{
		genderbuttonmail.click();
	}
	public void femail_button()
	{
		genderbuttonFemail.click();
	}

	public void firstNamem(String user_firstname)
	{
		firstName.sendKeys(user_firstname);
	}

	public void lastNamem(String user_lastname)
	{
		lastName.sendKeys(user_lastname);
	}

	public void emailm(String emailid)
	{
		email.sendKeys(emailid);
	}
	public void passwordm(String setpassword)
	{
		password.sendKeys(setpassword);
	}

	public void confirmPasswordm(String confirmpassword)
	{
		confirmPassword.sendKeys(confirmpassword);
	}
	public void register_buttonm()
	{
		register_button.click();
	}
	
	
}
