package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverWaitingMethods {

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver = new ChromeDriver() ;
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      driver.manage().window().maximize();
       //It is able to solve synchronization problem[No such exception]
       Thread.sleep(5000);//Pause the execution
      
      driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	    
		
		
		
	}

}
