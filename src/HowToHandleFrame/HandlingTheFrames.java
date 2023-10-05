package HowToHandleFrame;

import utils.CommonMethods;

public class HandlingTheFrames extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		
		//we need to identify the frame and switch to it  by using the;
		//index , nameOrId, WebElement of the frame
		//If there is two frame in the same package then identify the first frame then switch to it
		//then get back to the main page with driver.switchTo().contentDeafult();
		//then do the same thing to second frame and work with the webElement inside of the farme
		
		setUp();
		
		//index
		driver.switchTo().frame(0);
		
		//nameOrId
		driver.switchTo().frame(" ");
		
		//WebElement
		driver.switchTo().frame("");
		
		
		tearDown();
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
