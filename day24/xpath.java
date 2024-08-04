package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.get("https://demo.opencart.com/");
      driver.manage().window().maximize();
      
      //xpath with single attribute
      //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("macbook");
      
      //xpath with multiple attribute
      //driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("mobile");
      
      //xpath with AND or OR operators
     // driver.findElement(By.xpath("//input[@name='search' or @placeholder='Golu']")).sendKeys("charger");
      
      //xpath with inner text()
     // driver.findElement(By.xpath("//*[text()='MacBook']")).click();
      
   Boolean displaystatus= driver.findElement(By.xpath("//*[text()='Featured']")).isDisplayed();
    System.out.println(displaystatus);
    
    String value= driver.findElement(By.xpath("//*[text()='Featured']")).getText();
    System.out.println(value);
    
    if(value.equals("Featured"))
    {
    	System.out.println("test passed");
    }
    
    else
    {
    	System.out.println("Test failed");
    }
    
      
      
      
      //xpath with contains
     // driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("book");
      
      //xpath with starts-with method
     // driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("chair");
	
	//chained xpath
    // Boolean imagestatus= driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
    // System.out.println(imagestatus);
     
     
	
	}
	
	
	
	
	
	
	

}
