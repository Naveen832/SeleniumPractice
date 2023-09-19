package NOPapplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorforAutomationPracticeWebSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		//click on search button enter t shirts
//		driver.findElement(By.id("search_query_top")).sendKeys("t-shirts");
//		//click in search button
//		driver.findElement(By.name("submit_search")).click();
//		//click on links
//		//driver.findElement(By.linkText("Women")).click();
//		driver.findElement(By.partialLinkText("Wom")).click();
		
		//to find the number of slids in page
		List<WebElement> slides = driver.findElements(By.className("homeslider-container"));
		System.out.println("Number of slieds in this page is: "+slides.size());
		//To find total number of images
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images are: "+images.size());
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of Links in this page is : "+links.size());
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
	}

}
