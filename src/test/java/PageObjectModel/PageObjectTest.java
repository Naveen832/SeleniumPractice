package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageObjectTest {
	
	WebDriver driver;
	LoginFactory lp;
	
	@BeforeClass
	void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//ChromeOptions op = new ChromeOptions();
		//op.addArguments("--remote-allow-origins=*");
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	
	}
	
	@Test(priority=1)  
	void testLogo() throws InterruptedException {
		lp = new LoginFactory(driver);
		
		boolean s = lp.checkLogo();
		Assert.assertEquals(s, true);
		Thread.sleep(3000);
	}
	@Test(priority=2)
	void login() {
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		lp.ClickSubmit();
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
		}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
}
