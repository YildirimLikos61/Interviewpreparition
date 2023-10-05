package HowToSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class SelectDropdown extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		//To be able to select dropDwon button we can use Select class object
		//By creating a Select object we can select the dropDwon by;
		//index , value, visibileText
		//Select object accept WebElement no List !!!
		//WebElement should be the select type if not use driver.findElements end put them in a list !!!
		
		setUp();
		
		WebElement element=driver.findElement(By.xpath(""));
		
		Select sel=new Select(element);
		
		sel.selectByIndex(0);
		sel.selectByValue(" ");
		sel.selectByVisibleText(" ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
