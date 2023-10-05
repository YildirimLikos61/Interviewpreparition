package HowToSwitchChildWindow;

import java.util.Set;

import utils.CommonMethods;

public class SwitchToChildWindow extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//First we need to get the main window id with driver.getWindowHandle();
		//and store it in to String , its is unique id , pointer of the window
		//Then get the all the pointer of the window with driver.getWindowHandles();
		//and put it in a Set list ..and Switch to child window
		

		setUp();
		
			
		String mainId=driver.getWindowHandle();
		
		Set<String> handles=driver.getWindowHandles();
		
		for(String hand:handles)
		{
			if(!mainId.equals(hand)) 
			{
					driver.switchTo().window(hand);
					break;
			}
		}
          		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
