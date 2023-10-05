package PageFactoryandPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;
import utils.CommonMethods;

public class PageFactoryExample extends CommonMethods{

	
	//Page object model is a test desing pattern which is organizing the WebElements page to page
	//PageFactory is one way to implement it
	//In page factory we initializing the Webelements
		
		
		@FindBy(id="")
		
		public WebElement username;
		
		
		@FindBy(xpath="")
		
		public WebElement password;
		
		
		@FindBy(id="")
		
		public WebElement loginBtn;
		
		
		public PageFactoryExample() 
		{
			PageFactory.initElements(BaseClass.driver, this);
		}
		
		
		
		
		
		
	
}
