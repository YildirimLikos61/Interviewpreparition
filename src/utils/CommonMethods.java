package utils;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class CommonMethods extends BaseClass{

	
	/**
	 * This method will send text to the given WebElement
	 * @param el
	 * @param text
	 */
	public static void sendText(WebElement el,String text) 
	{
		el.clear();
		el.sendKeys(text);
	}
	
    /**
     * This method will click the radio Or check box with a given attribute value
     * @param list
     * @param value
     */
	public static void clickRadioOrCheckbox(List<WebElement> list, String value) 
	{
		 for(WebElement el:list) 
		 {
			 String attributeValue=el.getAttribute("value").trim();
			 if(attributeValue.equals(value)&& el.isEnabled()) 
			 {
				 el.click();
				 break;
			 }
		 }
	}
	
	
	/**
	 * This method will select the select element by using the index of it
	 * @param el
	 * @param index
	 */
	public static void selectDropdown(WebElement el,int index) 
	{
		try 
		{
		  Select sel=new Select(el);
		  sel.selectByIndex(index);
		}catch(Exception a) 
		{
			a.printStackTrace();
		}
	}
	
	
	/**
	 * This method will select the select element by using the visibleText of it
	 * @param el
	 * @param visibleText
	 */
	public static void selectDropdown(WebElement el,String visibleText) 
	{
		try 
		{
		 Select sel=new Select(el);
		 sel.selectByVisibleText(visibleText);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	/**
	 * This method will create an Alert interface and switch to the alert and then will accept it
	 */
	public static void acceptAlert() 
	{
		try 
		{
		  Alert alert=driver.switchTo().alert();
		  alert.accept();
		}catch(NoAlertPresentException a)
		{
			a.printStackTrace();
		}
	}
	
	 
	/**
	 * This method will dismiss the alert
	 */
	public static void dismissAlert()
	{
		try 
		{
	 	  Alert alert=driver.switchTo().alert();
		  alert.dismiss();
		}catch(NoAlertPresentException a)
		{
			a.printStackTrace();
		}
	}
	
	/**
	 * This method will send text to the  alert
	 * @param text
	 */
	public static void sendAlertText(String text) 
	{
		try 
		{
		  Alert alert=driver.switchTo().alert();
		  alert.sendKeys(text);
		}catch(NoAlertPresentException a) 
		{
			a.printStackTrace();
		}
	}
	
	/**
	 * This method will get the text of the alert
	 * @return
	 */
	public static String getAlertText() 
	{
		String text=null;
		try 
		{
		  Alert alert =driver.switchTo().alert();
		  text=alert.getText();
		}catch(NoAlertPresentException a) 
		{
			a.printStackTrace();
		}
		return text;
	}
	
	
	/**
	 * This method will switch to the frame by using the index of the frame
	 * @param index
	 */
	public static void switchToFrame(int index) 
	{
		try 
		{
		  driver.switchTo().frame(index);
		}catch(NoSuchFrameException a) 
		{
			a.printStackTrace();
		}
	}
	
	/**
	 * This method will switch To the frame by using the name of id of the frame
	 * @param nameOrId
	 */
	public static void switchToFrame(String nameOrId) 
	{
		try 
		{
		  driver.switchTo().frame(nameOrId);
		}catch(NoSuchFrameException a)
		{
			a.printStackTrace();
		}
	}
	
	/**
	 * This method will switch to the frame by using WebElement of the frame
	 * @param el
	 */
	public static void switchToFrame(WebElement el) 
	{
		try 
		{
		  driver.switchTo().frame(el);
		}catch(NoSuchFrameException a) 
		{
			a.printStackTrace();
		}
	}
	
	
	
	/**
	 * This method will switch To the child window
	 */
	public static void switchToChildWindow() 
	{
		String mainId=driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		for(String handle:handles) 
		{
			if(!mainId.equals(handle)) 
			{
				driver.switchTo().window(handle);
				break;
			}
		}
	}
	
	
	/**
	 * This method will wait for the given second
	 * @param seconds
	 */
	public static void wait(int seconds) 
	{
		try 
		{
		  Thread.sleep(seconds*1000);
		}catch(InterruptedException a) 
		{
			a.printStackTrace();
		}
	}
	
	/**
	 * This method will create a WebDriverWait object and return it
	 * @return
	 */
	public static WebDriverWait getObjectWait() 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Constants.EXPILICIT_WAIT_TIME));
		return wait;
	}
	
	/**
	 * This method will wait till the given webElement is visible
	 * @param el
	 * @return
	 */
	public static WebElement waitForVisibility(WebElement el) 
	{
		return getObjectWait().until(ExpectedConditions.visibilityOf(el));
	}
	
	/**
	 * This method will wait for the given WebElement to be clickability
	 * @param el
	 * @return
	 */
	public static WebElement waitForClikability(WebElement el) 
	{
		return getObjectWait().until(ExpectedConditions.elementToBeClickable(el));
	}
	
	
	/**
	 * This method will click the given WebElement and will wait for it to be visible
	 * @param el
	 */
	public static void click(WebElement el) 
	{
		waitForVisibility(el);
		el.click();
	}
	
	
	/**
	 * This method will create a JavascriptExecutor object and return it
	 * @return
	 */
	public static JavascriptExecutor getJSObject() 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		return js;
	}
	
	
	
	/**
	 * This method will click the button with JavascriptExceutor interface
	 * @param el
	 */
	public static void jsClick(WebElement el) 
	{
		getJSObject().executeScript("arguments[0].click()", el);
	}
	
	
	/**
	 * This method will scrollUp with JavascriptExecutor interface
	 * @param pixel
	 */
	public static void scrollUp(int pixel) 
	{
		getJSObject().executeScript("window.scrollBy(0,-"+pixel+")");
	}
	
	/**
	 * This method will scrollDown by using the JavascriptExecutor interface
	 * @param pixel
	 */
	public static void scrollDown(int pixel) 
	{
		getJSObject().executeScript("window.scrollBy(0,"+pixel+")");
	}
	
	
	/**
	 * This method will scroll into view of the given element
	 * @param el
	 */
	public static void scrollToElement (WebElement el) 
	{
		getJSObject().executeScript("arguments[0].scrollIntoView(true)", el);
	}
	
	/**
	 * This method will select the calendar date by using the text of the WebElement
	 * @param list
	 * @param text
	 */
	public static void selectCalendarDate(List<WebElement> list,String text) 
	{
		for(WebElement day:list) 
		{
			String text1=day.getText();
			if(text1.equals(text)) 
			{
				if(day.isEnabled()) 
				{
					day.click();
					break;
				}else 
				{
					System.out.println("Day is not enable");
					break;
				}
			}
		}
	}
	
	
	/**
	 * This method will take a screen shot by using the TakesScreenshot interface 
	 * @param destinition
	 */
	public static void getScreenShot(String destinition) 
	{
		TakesScreenshot ss=(TakesScreenshot) driver;
		File file=ss.getScreenshotAs(OutputType.FILE);
		try 
		{
		  Files.copy(file, new File(destinition));
		}catch(Exception a) 
		{
			a.printStackTrace();
		}
	}
	
	

	/**
	 * This method will take a screen shot by using the TakesScreenshot interface 
	 * for specific WebElement 
	 * @param destinition
	 */
	public static void getScreenShot(WebElement el,String destinition) 
	{
		TakesScreenshot ss=(TakesScreenshot) el;
		File file=ss.getScreenshotAs(OutputType.FILE);
		try 
		{
		  Files.copy(file, new File(destinition));
		}catch(Exception a) 
		{
			a.printStackTrace();
		}
	}
	
	
	
	
}
