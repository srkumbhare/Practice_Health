package tests;

import org.testng.annotations.*;

import pages.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends BaseClass {
	
	public HomePage hp;
	public LoginPageTest lpt;
	public void iniObjects() {
		hp = new HomePage(driver);
		lpt = new LoginPageTest();
	}
	
	@BeforeClass
	public void init() throws InterruptedException {
		launchBrowser();		
		iniObjects();
		
	}

	@Test (priority=1)
	public void enterCredential() throws InterruptedException {
		hp.loginCred();
		Thread.sleep(2000);
	}
	
	@Test (priority=2)
	public void loginHRMApp() throws InterruptedException {
		hp.clickloginButton();
		Thread.sleep(5000);
	}
	
  @Test (priority=3)
  public void ModulePIM() throws InterruptedException {
	  hp.clickPIMmodule();
	  Thread.sleep(10000);
  }
  
  @Test (priority=4)
  public void clickEmpAdd() throws InterruptedException {
	  hp.addEmployee();
	  Thread.sleep(3000);
  }
  
  @Test (priority=5)
  public void enterFName() throws InterruptedException {
	  hp.enterFirstName();
	  Thread.sleep(3000);
  }
  
  @AfterClass
  public void closeBrowser() throws InterruptedException {
	  tearDown();
  }
  
}
