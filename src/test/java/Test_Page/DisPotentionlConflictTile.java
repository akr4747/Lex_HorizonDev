package Test_Page;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Object.Disclose_a_Potential_Conflict;
import Page_Object.gateway;
import Page_Object.login_page;
import Page_Object.pre_approval_disclosures;
import Test_Base.base_class;
import utilities.ExcelUtils;


public class DisPotentionlConflictTile extends base_class{
	
	@BeforeTest
	 public void initialize() throws IOException {
		 
		  driver=initializeDriver();
		  }
	
	
	@Test
	public void disclosePotentialConflict() throws IOException, InterruptedException {
		
		
		
		
		driver.get(prop.getProperty("url"));
		login_page lp=new login_page(driver);
		String username=prop.getProperty("userName");
		String password=prop.getProperty("password");
		lp.enter_email().sendKeys(username);
		lp.enter_password().sendKeys(password);
		lp.click_signin().click();
		gateway gt=new gateway(driver);
		gt.pre_approval_dis().click();
		
		pre_approval_disclosures dpc=new pre_approval_disclosures(driver);
		dpc.disclose_potential_conflict().click();
		
		
		
		
		Disclose_a_Potential_Conflict dapc=new Disclose_a_Potential_Conflict(driver);
		
	
			ExcelUtils eu=new ExcelUtils();
			
			ArrayList data=eu.getData("Request Name");
			String request_name= (String) data.get(1);
        	dapc.DPC_Request().sendKeys(request_name);
        	
        	dapc.Category(0);
            dapc.tenantEmployeeNo();
        	dapc.disclosedConflict();
        	dapc.fileUpload();
        	
        	ArrayList data1=eu.getData("vendorsupplier");
			String ven= (String) data1.get(1);
        	dapc.Vendor().sendKeys(ven);
        	
        	dapc.companyCurrentlyNo();
        	dapc.activeNegotiationsNo();
        	
        	ArrayList data2=eu.getData("Describe nature");
			String text= (String) data2.get(1);
        	dapc.businessTexBox().sendKeys(text);
        	
        	ArrayList data3=eu.getData("relation");
        	String rel= (String) data3.get(1);
        	dapc.reportingTextBox().sendKeys(rel);
        	
        	dapc.reportingChainNo();
    		
    		dapc.effectiveDate();
    		dapc.currentDate();
    		
    		ArrayList data4=eu.getData("additional");
			String ad= (String) data4.get(1);
        	dapc.additionalInformation().sendKeys(ad);
       
  
    		dapc.fileUploaded();
    		dapc.submitRequest().click();
    		
    		dapc.HR();
    		dapc.serviceCenter();
    		
    		dapc.requestConfirm().click();
    		Thread.sleep(3000);
	
		
	}
	
	@AfterTest
	 public void closeWindow() {
		 driver.close();
	 }  

}
