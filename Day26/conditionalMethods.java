package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalMethods {

	public static void main(String[] args) {
		//Conditional Methods//--Returns boolean value(true/false)        
	
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demo.nopcommerce.com/register");
	  driver.manage().window().maximize();
	  
	  //isDisplayed()
	  
	/*WebElement logo =driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
	System.out.println("Display the status of logo: "+ logo.isDisplayed());
	
	Boolean status = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
	System.out.println("Display the status of logo: "+ status);
	
	//isEnabled()
	 Boolean enable = driver.findElement(By.id("FirstName")).isEnabled();
	 System.out.println("enable status:" +enable);*/
	 
	 //isSelected()
	 WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
	 WebElement female_rd=driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
     System.out.println("Before Selection....");
     System.out.println(male_rd.isSelected());
     System.out.println(female_rd.isSelected());
     
     System.out.println("After selecting male....");
     male_rd.click();//male selected
     System.out.println(male_rd.isSelected());//true
     System.out.println(female_rd.isSelected());//false
     
     System.out.println("After selecting female....");
     female_rd.click();//female selected
     System.out.println(male_rd.isSelected());//false
     System.out.println(female_rd.isSelected());//true
     
     

     

	}

}
  