package day2;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locatorsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://demo.opencart.com/");
       driver.manage().window().maximize();
       
       //By name
       //driver.findElement(By.name("search")).sendKeys("Mac");
       
       //By id
       // boolean logodisplaystatus = driver.findElement(By.id("logo")).isDisplayed();
       //System.out.print(logodisplaystatus);
      
       //linktext 
       //driver.findElement(By.linkText("Software")).click();
      
       // partial_linktext--> we can pass only a portion of linktest in this.But it can conflict with other link on the webpage.
       //driver.findElement(By.partialLinkText("Soft")).click();
       
       //By classname
       // List<WebElement> headerlinks=driver.findElements(By.className("list-inline-item"));
       //System.out.print("Total numbers of header link:"+headerlinks.size());
       
       //By tagname
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total numbers of link:"+links.size());
        System.out.println(driver.getCurrentUrl());
      
       
       //Count Total number of images 
       //List<WebElement> images = driver.findElements(By.tagName("img"));
      // System.out.print("Total numbers of link:"+images.size());  //it is printing total number of images in the webpage
       
       
       
	}

}
