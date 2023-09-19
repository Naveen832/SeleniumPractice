package NOPapplication;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithOutSelectClassDropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
      //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        List<WebElement> options=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
        ////ul[@class='multiselect-container dropdown-menu']//label
        //Print number of elements in the list
        System.out.println("Total number of options: "+options.size());
        //print the consle what we see in the driopdown list
//        for(int i =0;i<=options.size();i++) {
//        	System.out.println(options.get(i).getText());
//        }
        //Select options from fropdown
//        for(int i=0;i<options.size();i++) {
//        	//String optio = options.get(i).getText();
//        	if(options.get(i).getText().equals("Java")) {
//        		options.get(i).click();
//        		break;
//        	}
//        }
        for(int i=0;i<options.size();i++) { //for(WebElement optio:options)
        	String optio = options.get(i).getText();
        	if(optio.equals("Java") || optio.equals("Python")) {
        		options.get(i).click();
       
        	}
        }
	}

}
