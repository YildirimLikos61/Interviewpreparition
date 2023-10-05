package HowToSelectCalenderDate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class SelectCalenderDate extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		
		List<WebElement> list=driver.findElements(By.xpath("//table/tbody/tr"));
		
		for(WebElement el:list) 
		{
			String text=el.getText();
			if(text.equals("Whatever you trying to click")) 
			{
				el.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
