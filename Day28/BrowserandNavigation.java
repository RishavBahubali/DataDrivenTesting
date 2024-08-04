package Day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserandNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         driver.manage().window().maximize();
       //  driver.navigate().to("https://www.google.com");
         //System.out.println("CurrentURL: " +driver.getCurrentUrl());
         //Thread.sleep(3000);
         driver.navigate().to("https://demo.nopcommerce.com/");
         driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         
         driver.navigate().back();
         System.out.println(driver.getTitle());
         
         driver.navigate().forward();
         System.out.println(driver.getTitle());
         
         driver.navigate().refresh();
         
	}

}
