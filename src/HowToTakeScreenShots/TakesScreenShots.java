package HowToTakeScreenShots;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import utils.CommonMethods;

public class TakesScreenShots extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		
		//To be able to take Screen shot we need to use TakesScreenshot interface
		//and follow the way below !!!
		
		setUp();
		
		TakesScreenshot ss=(TakesScreenshot) driver;
		
		File file=ss.getScreenshotAs(OutputType.FILE);
		
		try
		{
		  Files.copy(file, new File("destinition of where to store ss !!!"));
		}catch(Exception a) 
		{
			a.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
