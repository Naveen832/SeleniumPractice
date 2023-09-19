package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DOUBLEclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");//Switch to frame
		WebElement f1=driver.findElement(By.cssSelector("input#field1"));
		f1.clear();
		f1.sendKeys("Welcome");
		WebElement bu = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		Actions act = new Actions(driver);
		act.doubleClick(bu).perform();
		WebElement f2=driver.findElement(By.cssSelector("input#field1"));
		String str = f2.getAttribute("value");
		
		//gettext() --->Returns only inner text of the element
		//getAttribte-->returns value of the element
		System.out.println("Coied Text is: "+str);
		if(str.equals("Welcome")) {
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test is failed");
		}
	}

}
