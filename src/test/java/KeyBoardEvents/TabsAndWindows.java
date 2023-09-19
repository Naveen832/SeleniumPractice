package KeyBoardEvents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabsAndWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	       WebDriver driver =new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       driver.get("https://text-compare.com/");
	       //driver.switchTo().newWindow(WindowType.TAB);
	       driver.switchTo().newWindow(WindowType.WINDOW);
	       driver.get("https://www.opencart.com/");
	       driver.quit();
	       

	}

}
