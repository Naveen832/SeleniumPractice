package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement desktop=driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[1]"));
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		Actions act = new Actions(driver);
		//MouseHover
		act.moveToElement(desktop).moveToElement(mac).click().build().perform();//Creating action then perform
	//	act.moveToElement(desktop).moveToElement(mac).click().perform();//directly performing action
		
	}

}
