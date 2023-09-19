package NOPapplication;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("titel of the page: "+driver.getTitle());
        System.out.println("current url: "+driver.getCurrentUrl());
//        System.out.println("page souce:"+driver.getPageSource());
//        String s = driver.getPageSource();
//        System.out.println(s.contains("html"));
        System.out.println("get the handel id:"+driver.getWindowHandle());
        Thread.sleep(4000);
        //importent
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-copyright']/a")).click();
        
        Set<String> ss = driver.getWindowHandles();
        for(String x:ss) {
        		System.out.println(x);
        }
	}

}
