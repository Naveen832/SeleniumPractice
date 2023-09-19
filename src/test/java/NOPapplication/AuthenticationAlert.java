package NOPapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
     //   WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
        //http://the-internet.herokuapp.com/basic-auth //orginal site
      //http://admin:admin@the-internet.herokuapp.com/basic-auth //this is username and password webiste 
        driver.manage().window().maximize();
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic-auth");
        driver.manage().window().maximize();
        String text = driver.findElement(By.xpath("//p[contains(text(),'congratulations!')]")).getText();
        if(text.contains("Congragulation")) {
        	System.out.println("Successfull login");
        	
        	
        }
        else {
        	System.out.println("Login Failed");
        }
	}

}
