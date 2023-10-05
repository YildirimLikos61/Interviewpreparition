package HowToHandleActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class ActionsExample extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
	
		
		//Selenium provides an Actions class which allows us to perform any keyboard and mouse 
		//operations ... 
		//So we can perform any Action with Actions class
		
		
		setUp();
		
	
		Actions action=new Actions(driver);
		
		WebElement el=driver.findElement(By.xpath(""));
		
		action.doubleClick(el);
		action.contextClick(driver.findElement(By.xpath("")));
		action.dragAndDrop(el,el);
		action.clickAndHold(el);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
