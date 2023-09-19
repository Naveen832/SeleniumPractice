package NOPapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		//tag with id
		driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("rgrgrgfrf");
		//tag wirh class
		driver.findElement(By.cssSelector("button[name='submit_search']")).click();
		driver.findElement(By.cssSelector("input.search_query form-control ac_input[name='search_query']")).clear();
		

	}

}
