package NOPapplication;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HavingWithSelectClassDropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		WebElement drpcountyele=driver.findElement(By.xpath("//select[@id='country-list']"));
		Select drpCountry = new Select(drpcountyele);
		//1)selecting an option from the dropdown
		    //drpCountry.selectByVisibleText("France");
		 //   drpCountry.selectByValue("1");
		   // drpCountry.selectByIndex(3);
		//Total number of option in dropdown box
		    List<WebElement> options = drpCountry.getOptions();
		    System.out.println("Total number of options: "+options.size());
		    //Print to console in values
//		    for(int i=0;i<options.size();i++) {
//		    	System.out.println(options.get(i).getText());
//		    	
//		    }
		    for(WebElement op:options) {
		    	System.out.println(op.getText());
		    }
		//System.out.println("rgfrf");
	}
	

}
