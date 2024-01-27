package JavaInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samples {

	
	
	public static void main(String[] args) {
		
		
		
		int x=10;
		
		int y=5;
		
		System.out.println((x)+(y)+"Hello");
		
		System.out.println("Yildirim"+"Kiral");
		
		String king="abcba";
		
		StringBuffer sb=new StringBuffer(king);
		
		String king1=sb.reverse().toString();
		
		boolean ispoly;
		
		if(king.equals(king1.toLowerCase())) 
		{
			ispoly=true;
		}else 
		{
			ispoly=false;
		}
		
		System.out.println(ispoly);
		System.out.println(ispoly("abcba"));
		
		//System.setProperty("webdriver.chrome.driver", "");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("");
		
		WebElement el= driver.findElement(By.id(""));
		
		el.sendKeys("");
		
		System.out.println(el.isDisplayed());
		System.out.println(el.isEnabled());
	}
	
	public static boolean ispoly(String str) 
	{
		StringBuffer sb=new StringBuffer(str);
		
		String str1=sb.reverse().toString().toLowerCase();
		
		boolean ispoly;
		
		if(str.equals(str1)) 
		{
			ispoly=true;
		}else 
		{
			ispoly=false;
		}
		return ispoly;
	}
	
	
	
	
	
	
	
	
	
	
}
