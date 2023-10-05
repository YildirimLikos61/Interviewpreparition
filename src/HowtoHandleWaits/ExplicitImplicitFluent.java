package HowtoHandleWaits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;
import utils.Constants;

public class ExplicitImplicitFluent extends CommonMethods{

	
	public static void main(String[] args) throws InterruptedException {
		
		//Implicit wait is telling WebDriver to wait for all elements to load in to the page 
		//Expilicit wait is telling WebDriver to wait for specific conditions to happen
		//Fluent wait is telling WebDriver to wait for if element is finally visible on the page 
		
		setUp();
		
		//IMPLICITWAIT
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
		
		//EXPILICITWAIT
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Constants.EXPILICIT_WAIT_TIME));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
		
		//FLUENTWAIT
		
		FluentWait<WebDriver> wait1=new FluentWait<WebDriver>(driver);
		
		
		wait1.withTimeout(Duration.ofSeconds(10));
		wait1.pollingEvery(Duration.ofSeconds(20));
		wait1.ignoring(NoSuchElementException.class);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
