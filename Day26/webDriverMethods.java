package Day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverMethods {

	public static void main(String[] args) throws InterruptedException {
     
		WebDriver driver = new ChromeDriver();
		
		//get(url)--launch the driver
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
		//getTitle("")--Returns the title of the page
		//System.out.println(driver.getTitle()); 
		
		//getCurrentUrl()--return url of the page
		//System.out.println(driver.getCurrentUrl());
		
		//getPageSource()
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle()--Return window Id for single window
		//String WindowId = driver.getWindowHandle();
		//System.out.println("Window Id:"+ WindowId);
	    
	    
	  //getWindowHandles()--Return Multiple window Id
		/*driver.findElement(By.cssSelector("a[href='http://www.orangehrm.com']")).click();
		Set<String> Muliptlewindow=driver.getWindowHandles();
		System.out.println(Muliptlewindow);*/
		 
		
		//Conditional Methods//--Returns boolean value(true/false)
		
		
		
	}
	

}
