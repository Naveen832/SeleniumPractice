package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFactory {
	
	public WebDriver driver;
	
	//Constructor
	
	LoginFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this );
	}
	//Locators
//By logo_image = By.xpath("//img[@alt='company-branding']");
	@FindBy(xpath="//img[@alt='company-branding']") WebElement img_logo;
	//@FindBy(how=How.XPATH="//img[@alt='company-branding']") WebElement img_logo;
//	By txt_username = By.cssSelector("input[placeholder='Username']");
	@FindBy(xpath="//input[@name='username']") WebElement usernmae11;
//	By txt_password = By.xpath("//input[@placeholder='Password']");
	@FindBy(xpath="//input[@name='password']") WebElement passwprd;
   // By txt_Login = By.name("//button[normalize-space()='Login']");
    @FindBy(xpath="//button[normalize-space()='Login']") WebElement submit;
    
    
    
    //Actions
    
    public void setUsername(String name) {
//    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.presenceOfElementLocated(txt_username));
    	usernmae11.sendKeys(name);
    }
    public void setPassword(String Password) {
//    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.presenceOfElementLocated(txt_password));
    	passwprd.sendKeys(Password);
    }
    public void ClickSubmit() {
//    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.presenceOfElementLocated(txt_Login));
    	submit.click();
    }
    public boolean checkLogo() {
//    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.presenceOfElementLocated(logo_image));
    	boolean status = img_logo.isDisplayed();
    	return status;
    }
}
