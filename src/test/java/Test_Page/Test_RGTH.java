package Test_Page;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Object.Disclose_a_Potential_Conflict;
import Page_Object.RGTH_Request;
import Page_Object.gateway;
import Page_Object.login_page;
import Page_Object.pre_approval_disclosures;
import Test_Base.base_class;
import utilities.ExcelUtils;


public class Test_RGTH extends base_class {
	
	@BeforeTest
	 public void initialize() throws IOException {
		 
		  driver=initializeDriver();
		  }
	

	@Test
	public void receiptGiftTravelHospitality() throws IOException, InterruptedException {

		driver.get(prop.getProperty("url"));
		login_page lp=new login_page(driver);
		String username=prop.getProperty("userName");
		String password=prop.getProperty("password");
		lp.enter_email().sendKeys(username);
		lp.enter_password().sendKeys(password);
		lp.click_signin().click();
		gateway gt=new gateway(driver);
		gt.pre_approval_dis().click();
		
		pre_approval_disclosures rgth=new pre_approval_disclosures(driver);
		rgth.disclose_the_receipt_of_a_gift_travel_or_hospitality().click();
		
		RGTH_Request drgth=new RGTH_Request(driver);
		
	
			ExcelUtils eu = new ExcelUtils();
			
			ArrayList data=eu.getData("Request_Name");
			String request_name= (String) data.get(1);
			drgth.rgthRequestName().sendKeys(request_name);
			Thread.sleep(1000);
			
			ArrayList data1=eu.getData("Full_Name");
			String name= (String) data1.get(1);
			drgth.partyFullName().sendKeys(name);
			Thread.sleep(1000);
			
			ArrayList data2=eu.getData("Employer");
			String employer_name= (String) data2.get(1);
			drgth.partyEmployer().sendKeys(employer_name);
			Thread.sleep(1000);
			
			ArrayList data3=eu.getData("Offical_Position");
			String position= (String) data3.get(1);
			drgth.titleOrOfficialPosition().sendKeys(position);
			Thread.sleep(1000);
			
			drgth.partyHomeCountry(0);
			Thread.sleep(1000);
			
			ArrayList data4=eu.getData("email_address");
			String mail= (String) data4.get(1);
			drgth.partyEmailAddress().sendKeys(mail);
			Thread.sleep(1000);
			
			drgth.partyBusinessButton();
			
		/*	drgth.typeBenefit(0);
			
			drgth.typeLocation(0);
			
			ArrayList data5=eu.getData("Description");
			String desc= (String) data5.get(1);
			drgth.Description().sendKeys(desc);
			
			ArrayList data6=eu.getData("Business_Purpose");
			String purpose= (String) data6.get(1);
			drgth.businessPurposeOrRationale().sendKeys(purpose);
			
			ArrayList data7=eu.getData("Monetary_Value");
			String value= (String) data7.get(1);
			drgth.estimatedMonetaryValue().sendKeys(value);
			*/
	}
	
	
}
