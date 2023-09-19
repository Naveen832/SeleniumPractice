package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	public WebDriver driver;
	
	//Constructor
	
	LoginPage(WebDriver driver){
		this.driver = driver;
		//PageFactory.initElements(driver, this );
	}
	//Locators
	By logo_image = By.xpath("//img[@alt='company-branding']");
//	@FindBy(xpath="//img[@alt='company-branding']") WebElement img_logo;
	By txt_username = By.cssSelector("input[placeholder='Username']");
	By txt_password = By.xpath("//input[@placeholder='Password']");
    By txt_Login = By.name("//button[normalize-space()='Login']");
    
    
    
    //Actions
    
    public void setUsername(String name) {
//    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.presenceOfElementLocated(txt_username));
    	driver.findElement(txt_username).sendKeys(name);
    }
    public void setPassword(String Password) {
//    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.presenceOfElementLocated(txt_password));
    	driver.findElement(txt_password).sendKeys(Password);
    }
    public void ClickSubmit() {
//    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.presenceOfElementLocated(txt_Login));
    	driver.findElement(txt_Login).click();
    }
    public boolean checkLogo() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(logo_image));
    	boolean status = driver.findElement(logo_image).isDisplayed();
    	return status;
    }
}
