package Day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignments {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.manage().window().maximize();
		 
		 //1. Provide some strings search for it
		 driver.get("https://testautomationpractice.blogspot.com/");
		 WebElement searchbutton =driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		 searchbutton.sendKeys("Selenium");
		 searchbutton.submit();
		 
		 //2. count number of links
		 List<WebElement> link =driver.findElements(By.partialLinkText("Sel"));
		 System.out.println("Total number od link: "+ link.size());
		 
		

	}
	

}
