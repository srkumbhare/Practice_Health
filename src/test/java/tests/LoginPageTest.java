package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import pages.BaseClass;
import pages.LoginPage;

public class LoginPageTest extends BaseClass {
public WebDriver driver;
	public LoginPage lp;
	public void initObjects() {
	lp = new LoginPage(driver);
	}
	
	@BeforeClass
	public void init() throws InterruptedException {
		launchBrowser();
		initObjects();
	}
	
  @Test (priority=1)
  public void loginApplication() throws InterruptedException {
	  lp.loginCred();
  }
  
  @Test (priority=2)
  public void clickButton() throws InterruptedException {
	  lp.clickloginButton();
  }
  
  @AfterClass
  public void closeBrowser() throws InterruptedException {
	  tearDown();
  }
}
