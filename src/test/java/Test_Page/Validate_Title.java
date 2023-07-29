package Test_Page;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Object.gateway;
import Page_Object.login_page;
import Page_Object.pre_approval_disclosures;
import Test_Base.base_class;
import junit.framework.Assert;


public class Validate_Title extends base_class{
	
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(base_class.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	} 
	
	@Test()
	public void start_apprval_request() throws IOException {
		
		
		login_page lp=new login_page(driver);
		String username=prop.getProperty("userName");
		String password=prop.getProperty("password");
		lp.enter_email().sendKeys(username);
		lp.enter_password().sendKeys(password);
		lp.click_signin().click();
		gateway gt=new gateway(driver);
		gt.pre_approval_dis().click();
		
		pre_approval_disclosures ad=new pre_approval_disclosures(driver);
		//compare the text from the browser with actual text.
		Assert.assertEquals(ad.Start_an_Approval_Request().getText(), "Start an Approvals Request");	
		log.info("Sucessfully Validated Text Message");
 //     Assert.assertTrue(ad.Start_an_Approval_Request().isDisplayed());			
	}
	
	@AfterTest
	public void closeWindow(){
		driver.close();
	} 

}
