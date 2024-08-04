package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {

	public static void main(String[] args) {
		
		//Launch Chrome
      ChromeDriver driver = new ChromeDriver();  
      
    //Launch Flipkart 
      driver.get("https://www.flipkart.com/");
      
   // for maximising window
      driver.manage().window().maximize();       
      
     
      //to store title and validate your actual title with expected title
      
      String act_title = driver.getTitle();
      if(act_title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
      {
      System.out.print("Test Passed");
	}
     else 
      {
    	  System.out.print("Test Failed");
    	  
    	  }
      
     driver.close();
	}
	}
  