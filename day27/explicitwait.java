package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) throws InterruptedException{
		
		 WebDriver driver = new ChromeDriver() ;
		 WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
	      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      driver.manage().window().maximize();
	      
	    WebElement userName= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
	       
	      userName.sendKeys("Admin");
	      
	      WebElement Password= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
	       
	      Password.sendKeys("admin123");
	      
	      WebElement Loginbtn= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
	       
	      Loginbtn.click();
	      
	      
		
		

	}

}
