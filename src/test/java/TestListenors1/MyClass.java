package TestListenors1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyClass {
	
	WebDriver driver;
	@BeforeClass
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)
	void testLogo() {
		try {
			boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
			Assert.assertEquals(status, true);
			}
			catch(Exception e) {
				Assert.assertTrue(false);
			}
	}
	
	@Test(priority=2)
	void testlogin() throws InterruptedException {
		try
		{
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = 'Email']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'Password']")).sendKeys("test123");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		Thread.sleep(3000);
	//	boolean status = driver.findElement(By.linkText("My account")).isDisplayed();
	
		Assert.assertEquals(true, false);
	}
		catch(Exception e) {
			Assert.fail();
		}

}
	@Test(priority=3,dependsOnMethods = {"testlogin"})
	void testlogout() throws InterruptedException {
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(3000);
		boolean status = driver.findElement(By.linkText("Register")).isDisplayed();
		Assert.assertEquals(status, true);
	}
@AfterClass
	void teardown() {
		driver.quit();
	}
}