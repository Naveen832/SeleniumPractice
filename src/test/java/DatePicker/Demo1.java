package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
	//	driver.findElement(By.cssSelector("input#datepicker")).click();
	//	driver.findElement(By.cssSelector("input#datepicker")).sendKeys("10/15/2022");
		//Second Approch
		String year="2026";
		String month="April";
		String date="25";
		driver.findElement(By.cssSelector("input#datepicker")).click();
		//select month and year
		while(true) {
			String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String mn = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if(mn.equals(month) && yr.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		//select day
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		/*for(WebElement dt:alldates){
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}*/
		for(int i=0;i<alldates.size();i++) {
			if(alldates.get(i).getText().equals(date)) {
				alldates.get(i).click();
				break;
				}
		}
	}

}
