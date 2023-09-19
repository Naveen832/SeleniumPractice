package NOPapplication;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
			List<WebElement> list = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
			System.out.println("total number of elements:"+list.size());
	}

}
