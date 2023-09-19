package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SlideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	       WebDriverManager.chromedriver().setup();
	       WebDriver driver =new ChromeDriver();
	       driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");;
	       driver.manage().window().maximize();
	       Actions act = new Actions(driver);
	       //min Element
	       WebElement min_slider = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
	       System.out.println("current Location of min slier:"+min_slider.getLocation());//(59,250) x,y
	       act.dragAndDropBy(min_slider, 100, 249).perform();
	       System.out.println("current Location of  after min slier:"+min_slider.getLocation());  
	       //max Element
	       WebElement max_slider = driver.findElement(By.xpath("((//span[2]"));
	       System.out.println("current Location of max slier:"+max_slider.getLocation());//(59,250) x,y
	       act.dragAndDropBy(max_slider,-100, 249).perform();
	       System.out.println("current Location of  after min slier:"+max_slider.getLocation());  
	}

}
