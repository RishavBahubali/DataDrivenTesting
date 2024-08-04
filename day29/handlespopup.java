package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handlespopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 
	
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
         
		 //Normal alerts with only OK button
		 /*driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		 Thread.sleep(5000);
		 Alert myalert=driver.switchTo().alert();
		 System.out.println(myalert.getText());
		 myalert.accept();*/
		 
		 
		 //Confirmation alert --Ok or Cancel
		 
		/* driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		 Thread.sleep(5000);
		 Alert jsConfirm=driver.switchTo().alert();
		 System.out.println(jsConfirm.getText());
		 jsConfirm.dismiss();
		 jsConfirm.accept();*/
		 
		 //3. Prompt alert
		/* driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert myPromptalert = driver.switchTo().alert();
		
		myPromptalert.sendKeys("Welcome");
		myPromptalert.accept();*/
		
		//handle alert without using switch() and using explicit method
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		 Thread.sleep(5000);
		Alert myalert= mywait.until(ExpectedConditions.alertIsPresent());
		 System.out.println(myalert.getText());
		 myalert.accept();
		
	}

}
