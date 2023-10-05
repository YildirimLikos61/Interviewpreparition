package LocatorsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		
		//There are 8 locators in Selenium
		//we can find the WebElement by 
		
		//id
		//name
		//className
		//tagName
		//LinkText
		//partialLinktext
		//cssSelector
		//Xpath
		
		// /following-sibling::div* = all the sisters after myself
		// /preceding-sibling::div =  before myself
		
		// /parent::div locate the child then use this to go to parent or /..
		// /child::input locate the parent the use this to go to child 
		
		
		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://neotechacademy-sis.com:9000/Test/");
		
		driver.findElement(By.xpath
	("//tr/child::td[@style='height: 27px; width: 15px;']/following-sibling::td[2]//input[@id='tUsername']"));
		
		driver.findElement(By.cssSelector("input[name='tPassword']"));
		
		driver.findElement(By.id("bLogin"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
