package HowToHandleAlert;

import org.openqa.selenium.Alert;

import utils.CommonMethods;

public class HandlingAlert extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		//WebBase pop up can be handled by creating an Alert interface
		//After we create an Alert interface we can ;
		//accept , dismiss, sendText to the alert, getText of the alert
		
		setUp();
		
	   Alert alert=driver.switchTo().alert();
	   
	   alert.accept();
	   alert.dismiss();
	   alert.getText();
	   alert.sendKeys(" ");
		
		tearDown();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
