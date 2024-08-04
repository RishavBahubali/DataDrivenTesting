package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlescheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.manage().window().maximize();
		 
	
		 driver.get("https://testautomationpractice.blogspot.com/");
		 
		 //1. Select specific checkbox
		// driver.findElement(By.xpath("//input[@id='sunday']")).click();
		 
		 //2. Select all the checkboxes
		List<WebElement>checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		 
		/* for(int i=0;i<checkboxes.size();i++)
		 {
			 checkboxes.get(i).click();
		 }
		 */
		
		/*for( WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}
		*/
		
		//3. want to select 3 checkboxes
		//formula - Total number of checkboxex-how many checkbox want to select
		//7-3=4
		
		/*for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		*/
		
		/*//want to select first 3 checkboxes
        for(int i=0;i<3;i++)
        {
        	checkboxes.get(i).click();
        }*/
		
		//4. unselect checkboxes if they are already selected
		for(int i=0;i<3;i++)
        {
        	checkboxes.get(i).click();
        }
		
		Thread.sleep(3000);
		for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}
		
	}

}
