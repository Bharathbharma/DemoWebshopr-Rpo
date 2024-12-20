package testbase1;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class baseclass_1
{
	public WebDriver driver;
	public Properties p;
	@BeforeClass
	@Parameters({"browser","os"})
	public void setup(String brow,String ops) throws IOException
	{
		FileInputStream file=new FileInputStream("./src//test//resources//config.properties");
		Properties p=new Properties();
		p.load(file);
		
		if(p.getProperty("Execution").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities cap=new DesiredCapabilities();
			String Huburl="http://localhost:4444/wd/hub";
			
			if(ops.equalsIgnoreCase("Windows"))
			{
				cap.setPlatform(Platform.WIN11);
			}
			else if (ops.equalsIgnoreCase("Mac"))
			{
				cap.setPlatform(Platform.MAC);
			}
			else
			{
				System.out.println("invalid os found");
			}
			
			
			switch(brow.toLowerCase())
			{
			case "chrome":cap.setBrowserName("chrome");
			break;
			case "edge": cap.setBrowserName("MicrosoftEdge");
			break;
			default : System.out.println("invalid browser");
			return;
			}
			
			WebDriver driver=new RemoteWebDriver(new URL(Huburl),cap);
			
		}
		
		if(p.getProperty("Execution").equalsIgnoreCase("Local"))
		{
			 switch(brow.toLowerCase())
		        {
		          case "chrome":
			             driver=new ChromeDriver();
			             break;
		          case "edge":
	            		driver=new EdgeDriver();
		            	break;
		         default:
			              System.out.println("invalid browser");
			             return;
		        }
		}
		
		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");

		//driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
	}
	
	
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
	public String randomstring()
	{
		String randomname=RandomStringUtils.randomAlphabetic(6);
		return randomname;
	}
	public String randomemail()
	{
		String randomapphaemail=RandomStringUtils.randomAlphabetic(5);
		String randomanumemail=RandomStringUtils.randomNumeric(2);
		String randomemail=randomapphaemail+randomanumemail+"@gmail.com";
		return randomemail;
	}
	public String randomphonenumber() 
	{
		String Randommobilenum=RandomStringUtils.randomNumeric(10);
		return Randommobilenum;
	}
	
	
}
