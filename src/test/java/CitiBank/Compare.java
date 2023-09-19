package CitiBank;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		
		        // Set the path to the chromedriver executable
//		ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless"); // Run Chrome in headless mode
//        WebDriver driver = new ChromeDriver(options);
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

		        // Create a new instance of the Chrome driver
		    //    WebDriver driver = new ChromeDriver();
        
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		        // Navigate to the first website
		        driver.get("https://www.privatebank.citibank.com/why-us");
		        
		        driver.manage().window().maximize();

		        // Extract information from the first website.
		        WebElement element1 = driver.findElement(By.xpath("//li[@class='breadcrumb-item']//span[contains(text(),'Why choose Citi Private Bank?')]"));
		        String data1 = element1.getText();
		        
		     // Open a new tab in the same browser window using JavaScript
		        ((JavascriptExecutor) driver).executeScript("window.open();");
		     

		        // Switch to the new tab
		        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		        driver.switchTo().window(tabs.get(1));

		        // Navigate to the second website
		        
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        driver.get("https://wwwqa.privatebank.citibank.com/why-us");
		        driver.manage().window().maximize();
		        
//		        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//		        driver.switchTo().window(tabs.get(1));

		        // Extract information from the second website
		        WebElement element2 =driver.findElement(By.xpath("//span[normalize-space()='Why choose Citi Private Bank?']"));
		        String data2 = element2.getText();

		        // Close the browser
		        driver.quit();

		        // Compare the extractedriverd data
		        if (data1.equals(data2)) {
		            System.out.println("The data from both websites is the same.");
		        } else {
		            System.out.println("The data from both websites is different.");
		        }
		        
		        
		        System.out.println("Comparing the data in firstsite: "+data1);
		        System.out.println("Comparing the data in secondsite: "+data2);
		        
		        
		    

	}

}
