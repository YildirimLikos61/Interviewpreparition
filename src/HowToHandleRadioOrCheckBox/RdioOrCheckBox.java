package HowToHandleRadioOrCheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class RdioOrCheckBox extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		//To be able to handle the Radio or Check box 
		//We need the identify the WebElement first and the put it in a list
		//Then get the attribute of value , with the matching value click
		
		 // Example of how we doit
		setUp();
		
		List<WebElement> list=driver.findElements(By.xpath(""));
		
		
		for(WebElement l:list) 
		{
			String value=l.getAttribute("");
			
			if(value.equals("")) 
			{
				l.click();
				break;
			}
		}
		
		
		tearDown();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
