package Day28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closingspecificwindow {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	         driver.manage().window().maximize();
	      
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
        Set<String> windowsID =driver.getWindowHandles();
        
         for( String windid:windowsID)
         {
        	String title=driver.switchTo().window(windid).getTitle() ;
        	System.out.println(title);
        	
        	if(title.equals("OrangeHRM"))
        	{
        		driver.close();
        	}
         }
	}

}
