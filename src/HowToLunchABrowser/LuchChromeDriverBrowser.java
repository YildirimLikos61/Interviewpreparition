package HowToLunchABrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LuchChromeDriverBrowser {

	
	public static void main(String[] args) throws InterruptedException {
		
		//We need to set the property
		//Create an object of it
		//and then navigate to it
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
	
		Thread.sleep(1000);
			
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
