package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;
	
	
	public static void setUp() throws InterruptedException 
	{
		  ConfigsReader.readProperties(Constants.CONFIGURATIONS_FILE_PATH);
		  String browser=ConfigsReader.getProperty("browser");
		  
		  switch(browser.toLowerCase()) 
		  {
		  case "chrome":
			  System.setProperty("webdriver.chrome.driver", Constants.CHROMEDIRVER_PATH);
			  driver=new ChromeDriver();
		    break;
		  case "firefox":  
		      System.setProperty("user.dir", Constants.GECKODRIVER_PATH);
		      driver=new FirefoxDriver();
		    break;
		    
		    default:
		    	break;
		  }
		  
		  String url=ConfigsReader.getProperty("url");
		  driver.get(url);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
		  Thread.sleep(1000);	  
	}
	
	
	public static void tearDown() 
	{
		if(driver!=null) 
		{
			driver.quit();
		}
	}
	
	
	
	
	
	
}
