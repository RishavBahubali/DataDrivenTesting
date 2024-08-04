package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesBrowserWindow {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	         driver.manage().window().maximize();
	       driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
           driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
           
           
           
          Set<String> windowsID =driver.getWindowHandles();
          
         /* Approach 1
          Here i convert set into list*/
          
          List<String> WindowList=new ArrayList(windowsID);
          String ParentID=WindowList.get(0);
          String ChildID=WindowList.get(1);
          
          driver.switchTo().window(ChildID);
          System.out.println(driver.getTitle());
          
          driver.switchTo().window(ParentID);
          System.out.println(driver.getTitle());
          
          //Approach 2---Looping statement
          
          for(String winId:windowsID)
          {
        	  String title=driver.switchTo().window(winId).getTitle() ;
        	  
        	  if(title.equals("OrangeHRM"))
              {
            	  System.out.println(driver.getCurrentUrl());
              }
              
          }
          
          
	}
	

}
