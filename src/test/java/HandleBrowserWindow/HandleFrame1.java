package HandleBrowserWindow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@target='_blank'])[5]")).click(); //a[normalize-space()='OrangeHRM, Inc']
		//Approach 1
		Set<String> windowIds = driver.getWindowHandles();
		Thread.sleep(5000);
		List<String> windowsList = new ArrayList(windowIds);
		
		
		String parentwindow = windowsList.get(0);
		String childwindoe = windowsList.get(1);
		System.out.println(parentwindow);
		//Swtich to child window
		driver.switchTo().window(childwindoe);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Contact Sales")).click();
		Thread.sleep(5000);
		//Swirch to parent window
		driver.switchTo().window(parentwindow);
		Thread.sleep(5000);
		
		driver.findElement(By.name("username")).sendKeys("frffr");
		
		
		//approach 2
		for(String wind:windowIds) {
			String title = driver.switchTo().window(wind).getTitle();
			if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM")) {
				driver.findElement(By.linkText("Contact Sales")).click();
			}
		}
		//Closing the winodes
		for(String wind:windowIds) {
			String title = driver.switchTo().window(wind).getTitle();
			if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM")) {
				driver.close();
			}
		}
	}

}
