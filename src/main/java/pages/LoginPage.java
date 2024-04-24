package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//This is Login Page
public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy (xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginCred() throws InterruptedException {
		username.sendKeys("Admin");
		Thread.sleep(1000);
		password.sendKeys("admin123");
		Thread.sleep(2000);
		System.out.println("Enter Cred SuccessFully");
	}
	
	public void clickloginButton() throws InterruptedException {
		loginButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Login Button Successfully");
	}
}
