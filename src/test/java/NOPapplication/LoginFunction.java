package NOPapplication;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).clear();
		WebElement e = driver.findElement(By.id("Email"));
		e.sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		WebElement p = driver.findElement(By.id("Password"));
		p.sendKeys("admi");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
//		String d = driver.getTitle();
//		System.out.println(d);
		
//		String ac = driver.getTitle();
//		String ex = "Dashboard / nopCommerce administration";
//		if(ac.equals(ex)) {
//			System.out.println("Title is matched");
//		}
//		else {
//			System.out.println("Title is not mateched");
//		}
//		String ac1 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
//		String ec1 = "Dashboard / nopCommerce administration";
//		if(ac1.equals(ac1)) {
//			System.out.println("Test is passed");
//		}
//		else
//		{
//			System.out.println("TEst is failed");
//		}
		String ac1="";
//	String	raji = driver.findElement(By.xpath("//div[@class='content-header']/child::h1")).getText();
//	System.out.println(raji);
	
	//System.out.println();
		try {
			ac1=driver.findElement(By.xpath("//div[@class='content-header']/child::h1")).getText();
		}
		catch(Exception x) {
              x.printStackTrace();
		}
		String ec1 = "Dashboard";
		if(ac1.equals(ec1)) {
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test is failed");
		}
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
