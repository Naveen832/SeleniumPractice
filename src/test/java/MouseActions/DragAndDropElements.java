package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       WebDriver driver =new ChromeDriver();
       driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
       driver.manage().window().maximize();
       Actions act = new Actions(driver);
       
       
       WebElement Seoul = driver.findElement(By.xpath("//div[@id='box5']"));
       WebElement itely = driver.findElement(By.xpath("//div[@id='box106']"));
       act.dragAndDrop(Seoul,itely).perform();
       
       WebElement osel = driver.findElement(By.cssSelector("div#box1"));
       WebElement Spain = driver.findElement(By.cssSelector("div#box107"));
       act.dragAndDrop(osel, Spain).perform();
       
       WebElement rome = driver.findElement(By.cssSelector("div#box6"));
       WebElement Southkorea = driver.findElement(By.cssSelector("div#box105"));
       act.dragAndDrop(rome, Southkorea).perform();
	}

}
