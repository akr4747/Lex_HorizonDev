package Test_Page;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Object.gateway;
import Page_Object.login_page;
import Test_Base.base_class;

public class test_gateway extends base_class{

	
	// If we want to run our test cases in parellel mode So to avoid the error we are declaring the driver below
	// otherwise If we want tio run our testcases in sequential mode so need to declare the driver below.
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(base_class.class.getName());
	  @BeforeTest 
	  public void initialize() throws IOException {
	  
	  driver=initializeDriver();
	  driver.get(prop.getProperty("url"));
	  }
	 
	@Test()
	public void gateway_page() throws IOException {
		
		
		login_page lp=new login_page(driver);
		String username=prop.getProperty("userName");
		String password=prop.getProperty("password");
		lp.enter_email().sendKeys(username);
		lp.enter_password().sendKeys(password);
		lp.click_signin().click();
		gateway gt=new gateway(driver);
		gt.pre_approval_dis().click();
		log.info("User sucessfully click on Landing page");
		
		
	}
	
	@AfterTest
	public void closeWindow() {
		driver.close();
	}
	
	
}
