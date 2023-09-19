package FRames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summery.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();//FRame1
		driver.switchTo().defaultContent();//Switch to back page
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("WebDriver")).click();//frame 2
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("(//div//ul/li[text()='Overview'])[1]")).click(); //(//li[@class='navBarCell1Rev'])[1]
		
	}

}
