package NOPapplication;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlutterWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
       //Fluent Wait declaration
//       Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
//    		   .withTimeout(Duration.ofSeconds(50))
//    		   .pollingEvery(Duration.ofSeconds(15))
//    		   .ignoring(NoSuchElementException.class);
       FluentWait mywait = new FluentWait(driver);
       mywait.withTimeout(Duration.ofSeconds(50));
       mywait.pollingEvery(Duration.ofSeconds(15));
       mywait.ignoring(NoSuchElementException.class);
       
//       WebElement username = mywait.until(new Function<WebDriver,WebElement>r(){
//    	   public WebElement apply(WebDriver driver) {
//    		   return driver.findElement(By.xpath("//input(@placeholder='username']"));
//    	   }
//       }
//       );
       
       WebElement username = (WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input(@placeholder='Username']")));
       username.sendKeys("Admin");
       WebElement password = (WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input(@placeholder='Password']")));
       password.sendKeys("admin123");
    	   }
       
       
       
	
}
