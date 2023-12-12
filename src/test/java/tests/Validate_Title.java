package tests;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.Gateway;
import pageObjects.Login;
import pageObjects.PreApprovalDisclosures;
import testComponents.BaseClass;


public class Validate_Title extends BaseClass{
	
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(BaseClass.class.getName());
	
	
	@Test
	public void preAprovalTileValidation() throws IOException {
		
		Gateway gt=new Gateway(driver);
		gt.pre_approval_dis().click();
		
		PreApprovalDisclosures ad=new PreApprovalDisclosures(driver);
		//compare the text from the browser with actual text.
	//	Assert.assertEquals(ad.Start_an_Approval_Request().getText(), "Start an Approvals Request");	
	//	log.info("Sucessfully Validated Text Message");
    //    Assert.assertTrue(ad.Start_an_Approval_Request().isDisplayed());	
	
	  
	}
	
}
