package NOPapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		//isDisplayed
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.isDisplayed());
		//IsDisplayed
		boolean s = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(s);
		//IsEnabled
		WebElement search=driver.findElement(By.id("small-searchterms"));
		System.out.println("status is:"+search.isDisplayed());
		System.out.println("status is:"+search.isEnabled());
		//isSelected
		
		//Before Slection
        WebElement male = driver.findElement(By.id("gender-male"));
        WebElement female = driver.findElement(By.id("gender-female"));
        System.out.println(male.isSelected());
        System.out.println(female.isSelected());
        //AfterSelection
        male.click();
        System.out.println(male.isSelected());
        System.out.println(female.isSelected());
        female.click();
        System.out.println(male.isSelected());
        System.out.println(female.isSelected());
		
	}

}
