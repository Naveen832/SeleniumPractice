package NOPapplication;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		//select single check box
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		List<WebElement> chckbox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type = 'checkbox']"));
	System.out.println("total number of checkboxes:"+chckbox.size());
	//select all the check boxes
//	for(int i=0;i<chckbox.size();i++) {
//		chckbox.get(i).click();
//	}
	//select all the cehck boxes
//	for(WebElement chkbox:chckbox) {
//		chkbox.click();
//	}
	//select last 3 check boxes
	//total number of checkboxes-how many checkboxes to be selectd = statiagn index
//	for(int i=4;i<chckbox.size();i++) 
//	{
//		chckbox.get(i).click();
//	}
	//select first 2 check boxes
//	for(int i=0;i<2;i++) {
//		chckbox.get(i).click();
//	}
//	for(int i=0;i<chckbox.size();i++) {
//		if(i<2) {
//		chckbox.get(i).click();
//		}
//	}  
	
	
   //Deselect the checkboxes
//	for(int i=0;i<chckbox.size();i++) {
//	chckbox.get(i).click();
//	}
//	Thread.sleep(4000);
//	for(int i=0;i<chckbox.size();i++) {
//	chckbox.get(i).click();
//}
	//select and deslect 2 check boxes,For using normal each loop
	/*for(int i=0;i<chckbox.size();i++) {
		if(i<3) {
			chckbox.get(i).click();
		}
	}
	Thread.sleep(3000);
	for(int i=0;i<chckbox.size();i++) {
		if(chckbox.get(i).isSelected()) {
			chckbox.get(i).click();
		}
	}*/
	//For Using for-Each loop
	for(int i=0;i<chckbox.size();i++) {
		if(i<3) {
			chckbox.get(i).click();
		}
	}
	Thread.sleep(4000);
	for(WebElement chkbox:chckbox) {
		if(chkbox.isSelected()) {
			chkbox.click();
		}
		
		
	}
	
	
	}
	}
