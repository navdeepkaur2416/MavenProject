package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class NewTest {
	 private WebDriver driver;       
     @Test              
     public void testEasy() {    
         driver.get("http://www.guru99.com/selenium-tutorial.html");  
         String title = driver.getTitle();                
         System.out.println("Hello World");
         Assert.assertTrue(title.contains("Free Selenium Tutorials"));       
     }   
     @BeforeTest
     public void beforeTest() {  
    	 //Before Method 
         driver = new FirefoxDriver();  
     }       
     @AfterTest
     public void afterTest() {
    	 //After Method
         driver.quit();          
     }       
}
