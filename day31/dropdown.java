package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement dropdown=driver.findElement(By.id("country"));
		Select drop=new Select(dropdown);
		drop.selectByVisibleText("Canada");
		
		List<WebElement> options=drop.getOptions();
		/*for (WebElement option : options) {
	            System.out.println(option.getText());
		 }*/
		 for (int i = 0; i < options.size(); i++) {
	            // Select each option by index
	            drop.selectByIndex(i);

	            // Perform any desired actions after selecting the option
	            System.out.println("Selected option: " + options.get(i).getText());

	}
	}

}
