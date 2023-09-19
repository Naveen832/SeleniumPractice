package NOPapplication;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWinidow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
     //   WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert alertwindow = driver.switchTo().alert();
        System.out.println(alertwindow.getText());
        alertwindow.sendKeys("welcome");
        alertwindow.accept();
        //alertwindow.dismiss();
        //Validation
        String ac = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String ec = "You entered: welcome";
        if(ac.equals(ec)) {
        	System.out.println("TEst is pades");
        }
        else {
        	System.out.println("passed");
        }
	}

}
