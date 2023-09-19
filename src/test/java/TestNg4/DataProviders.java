package TestNg4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviders {
	WebDriver driver;
	@BeforeTest
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Test(dataProvider ="dp")
	void login(String email,String password) {
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//button[normailze-space()='Login']")).click();
		String act = "nopCommerce demo store";
		String exp = driver.getTitle();
		
		Assert.assertEquals(act, exp);
		
		
	}
	@AfterTest
	void teardown() {
		driver.close();
		
	}
	@DataProvider(name="dp",indices= {0,4})
	String [][] loginData(){
		
		String data[][] = {{"abcee@gmail.com","12345"},
				{"aefe@gmail.com","e323e"},
			{"evfhj@gmail.com","3782ue"},
			{"naveenkumar@gmail.com","23443"}
				};
		return data;
		
		
		
	}
	
	@DataProvider
	String [][] loginData2(){
		
		String data[][] = {{"abcee@gmail.com","12345"},
				{"aefe@gmail.com","e323e"},
			{"evfhj@gmail.com","3782ue"},
			{"naveenkumar@gmail.com","23443"}
				};
		return data;
		
		
		
	}
	
	

}
