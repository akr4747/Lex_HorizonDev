package tests;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Gateway;
import pageObjects.Login;
import pageObjects.PGTH_Request;
import pageObjects.PreApprovalDisclosures;
import pageObjects.RGTH_Request;
import testComponents.BaseClass;
import utilities.ExcelUtils;

public class PGTH extends BaseClass {

	
	@Test
	public void Provide_a_Gift_Travel_or_Hospitality() throws IOException, InterruptedException
	{

	Gateway gt=new Gateway(driver);
	gt.pre_approval_dis().click();
	
	PreApprovalDisclosures pgth=new PreApprovalDisclosures(driver);
	pgth.provide_a_gift_travel_or_hospitality().click();
	
	
	PGTH_Request pgth_r=new PGTH_Request(driver);
	

		ExcelUtils eu = new ExcelUtils();
		
		ArrayList data1 = eu.getData("RequestName");
		String request_name = (String) data1.get(1);
		pgth_r.GTH_Request().sendKeys(request_name);
		
		pgth_r.approximateDate1();
		
		pgth_r.currentDate1();
		
		pgth_r.approximateDate2();
		
		pgth_r.currentDate2();
		
		pgth_r.selectCountry(1);
		
		ArrayList data2 = eu.getData("Describe the gift");
		String textarea_gift = (String) data2.get(1);
		pgth_r.qActivityDetailsPurpose().sendKeys(textarea_gift);
		
		pgth_r.fileUploaded();
		
		pgth_r.qActivityProvideRecipientsSubstantiveEducationYes();
		
		pgth_r.qSupportConnectionWithCompInspNo();
		
		pgth_r.qBenefitsForCompanyFromActivityNo();
		
		pgth_r.qGthComplyWithApplicableProvisionsYes();
		
		pgth_r.qRecipientSelectionOfMeetingLocationNo();
		
		pgth_r.qOfferedToProvideOrSupportNo();
		
		pgth_r.qRefrainFromActivitylForAnyReasonNo();
		
		pgth_r.qActivViolateApplicableLawsRegulationsEtcNo();
		
		pgth_r.qBenefitsForFamilyRelativeNo();
		
		pgth_r.qSecretiveUnusualNotTransparentNo();
		
		ArrayList data3 = eu.getData("Additional Information");
		String addtional_information = (String) data3.get(1);
		pgth_r.qAdditionalInformationUpload().sendKeys(addtional_information);
		
		pgth_r.clickNextButton();
		
		pgth_r.addCategory();
		Thread.sleep(2000);
		
		pgth_r.categoryEntertainment();
		Thread.sleep(3000);
		
		ArrayList data4=eu.getData("Sort Description");
		String entertainment_sort_description=(String) data4.get(1);
		pgth_r.qShortDescription().sendKeys(entertainment_sort_description);
		
		ArrayList data5=eu.getData("Amount");
		String amount_recipient=(String) data5.get(1);
		pgth_r.amountPerRecipient().sendKeys(amount_recipient);
		Thread.sleep(2000);
		
		pgth_r.supportMethod(0);
		Thread.sleep(2000);
		
		pgth_r.saveAndClose();
		Thread.sleep(2000);
		
		pgth_r.clickAddRecipient();
		
		pgth_r.clickGovernmentOfficial();
		
		ArrayList data6=eu.getData("FullName");
		String name=(String) data6.get(1);
		pgth_r.goFullName().sendKeys(name);
		Thread.sleep(1000);
		
		ArrayList data7=eu.getData("Employer");
		String emp=(String) data7.get(1);
		pgth_r.goEmployer().sendKeys(emp);
		Thread.sleep(1000);
		
		ArrayList data8=eu.getData("Title");
		String titleGO=(String) data8.get(1);
		pgth_r.goTitle().sendKeys(titleGO);
		Thread.sleep(1000);
		
		pgth_r.goHomeCountry();
		
		pgth_r.goEmailAddress();
		
/*		ArrayList data9=eu.getData("Email");
		String email=(String) data9.get(1);
		pgth_r.goEmailAddress().sendKeys(email);
		Thread.sleep(2000);*/
		
		pgth_r.qRecipientHaveInfluence();
		Thread.sleep(1000);
	
		
		pgth_r.goNext();
		Thread.sleep(2000);
		
		pgth_r.plusSupportCategory();
		
		pgth_r.editSupportCategory();
		
		pgth_r.qLocation();
		
		pgth_r.updateSupportCategory();
		
		pgth_r.saveAndCloseSupportCategory();
		
		pgth_r.submitRequest();
		
		pgth_r.approverManager();
		
		pgth_r.approverLocalLegalRecipient();
		
		pgth_r.approverComplianceOps();
		
		pgth_r.approverCompliance();
		
		pgth_r.finalRequestSumit();  
			
}
	
	
}
