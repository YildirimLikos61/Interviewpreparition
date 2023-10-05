package HowToTakeScrollUpDownOrToElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class ScrollWithJavascriptExecutor extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		//We can use JavascriptExecutor to scrollUp down or to the element
		
		setUp();
		
		
		//To scroll Up
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,-400)");
		
		
		//To scroll Down
		
		js.executeScript("window.scrollBy(0,400)");
		
		//Scroll to element
		
		WebElement element=driver.findElement(By.xpath(""));
		
		JavascriptExecutor jv=(JavascriptExecutor)driver;
		
		jv.executeScript("arguments[0].scrollIntoView(true)",element );
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
