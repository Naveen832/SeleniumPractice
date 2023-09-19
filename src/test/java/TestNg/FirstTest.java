package TestNg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FirstTest {
	
	WebDriver driver;
	@Test(priority =1)
     void openapp() {
    	 System.out.println("Test Case1 passed");
     }
	@Test(priority =2)
     void login() {
		System.out.println("Test Case2 passed");
    }
    	 
     
	@Test(priority =3)
     void close() {
		System.out.println("Test Case3 passed");
    }
    	 
     }
 
