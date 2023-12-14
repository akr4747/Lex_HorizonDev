package tests;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;
import pageObjects.Gateway;
import pageObjects.PreApprovalDisclosures;
import testComponents.BaseClass;

public class PreApprovalHeadingValidation extends BaseClass {
	
	 SoftAssert softAssert = new SoftAssert();
	
	
	@Test(retryAnalyzer=listeners.Retry.class)
	public void preApprovalHeadingValidation() throws IOException {
		
		Gateway gt=new Gateway(driver);
		gt.pre_approval_dis().click();
		
		PreApprovalDisclosures pad=new PreApprovalDisclosures(driver);
//		Assert.assertEquals(pad.Start_an_Approval_Request().getText(), "Start an Approvals Request");
		softAssert.assertEquals(pad.Start_an_Approval_Request().getText(), "Start an Approvals Request","Title is not Matching");
		softAssert.assertAll(); 
	}

	
}
