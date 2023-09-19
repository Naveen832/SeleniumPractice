package NOPapplication;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAleert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
       
      
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
     //withoyut using exlicit wait
        //Alert alertwindow = driver.switchTo().alert();
       Alert alertwindow = mywait.until(ExpectedConditions.alertIsPresent());
       System.out.println(alertwindow.getText());
       alertwindow.accept();//click on Ok
       alertwindow.dismiss();//clcik on cancel
        
	}

}
