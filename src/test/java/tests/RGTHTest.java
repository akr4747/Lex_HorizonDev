package tests;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Disclose_a_Potential_Conflict;
import pageObjects.Gateway;
import pageObjects.Login;
import pageObjects.PreApprovalDisclosures;
import pageObjects.RGTH_Request;
import testComponents.BaseClass;
import utilities.ExcelUtils;

public class RGTHTest extends BaseClass {

	@Test
	public void receiptGiftTravelHospitality() throws IOException, InterruptedException {

		Gateway gt = new Gateway(driver);
		gt.pre_approval_dis().click();

		PreApprovalDisclosures rgth = new PreApprovalDisclosures(driver);
		rgth.disclose_the_receipt_of_a_gift_travel_or_hospitality().click();

		RGTH_Request drgth = new RGTH_Request(driver);
		
		ExcelUtils eu = new ExcelUtils();
		
		ArrayList data = eu.getData("Request_Name");
		String request_name = (String) data.get(1);
		drgth.rgthRequestName().sendKeys(request_name);
		
		Thread.sleep(1000);
		ArrayList data1 = eu.getData("Full_Name");
		String name = (String) data1.get(1);
		drgth.partyFullName().sendKeys(name);
		Thread.sleep(1000);
		
		ArrayList data2 = eu.getData("Employer");
		String employer_name = (String) data2.get(1);
		drgth.partyEmployer().sendKeys(employer_name);
		Thread.sleep(1000);
		
		ArrayList data3 = eu.getData("Offical_Position");
		String position = (String) data3.get(1);
		drgth.titleOrOfficialPosition().sendKeys(position);
		Thread.sleep(1000);
		
		drgth.partyHomeCountry();
		
		drgth.partyEmailAddress();
		
	/*	ArrayList data4 = eu.getData("email_address");
		String mail = (String) data4.get(1);
		drgth.partyEmailAddress().sendKeys(mail); */
		
		drgth.partyBusinessButton();
		
		drgth.typeBenefit();
		
		drgth.typeLocation();
		
		ArrayList data5 = eu.getData("Description");
		String desc = (String) data5.get(1);
		drgth.Description().sendKeys(desc);
		
		ArrayList data6 = eu.getData("Business_Purpose");
		String purpose = (String) data6.get(1);
		drgth.businessPurposeOrRationale().sendKeys(purpose);
		
		drgth.expectedDateOfReceipt();
		
		ArrayList data7 = eu.getData("Monetary_Value");
		String value = (String) data7.get(1);
		drgth.estimatedMonetaryValue().sendKeys(value);
		
		drgth.fileUploaded();
		
		drgth.rgthSubmitRequest();
		
		drgth.approverManager();
		
		drgth.approverLocalLegalRecipient();
		
		drgth.approverComplianceOps();
		
		drgth.approverCompliance();
		
		drgth.finalRequestSumit();
		 
	}
}