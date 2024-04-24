package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//This is HomePage 
public class HomePage {
	
	public WebDriver driver;
	
	@FindBy (xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy (xpath="//a[@class='oxd-main-menu-item active']")
	private WebElement PIM;
	
	@FindBy (xpath="//a[text()='Add Employee']")
	private WebElement addEmp;
	
	@FindBy (xpath="//input[@name='firstName']")
	private WebElement firstName;
	
	public HomePage(WebDriver driver) {
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
	
	public void clickPIMmodule() throws InterruptedException {
		PIM.click();
		Thread.sleep(2000);
		System.out.println("PIM Click successfully");
	}
	
	public void addEmployee() throws InterruptedException {
		addEmp.click();
		Thread.sleep(2000);
		System.out.println("add employee Click successfully");
	}
	
	public void enterFirstName() throws InterruptedException {
		firstName.sendKeys("Sachin");
		Thread.sleep(2000);
	}
}
