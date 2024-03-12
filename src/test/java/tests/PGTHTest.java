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

public class PGTHTest extends BaseClass {

	
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
		
		pgth_r.currentDate2();
			
		pgth_r.selectCountry(2);
		
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
		
		ArrayList data5=eu.getData("Default Amount");
		String amount_recipient=(String) data5.get(1);
		pgth_r.amountPerRecipient().sendKeys(amount_recipient);
		
//		pgth_r.amountPerRecipient();
		
		pgth_r.supportMethod(3);
		Thread.sleep(2000);
		
		pgth_r.saveAndClose();
		Thread.sleep(2000);
		
		pgth_r.clickAddRecipient();
		
		pgth_r.clickGovernmentOfficial();
		
		ArrayList data6=eu.getData("FullName");
		String goname=(String) data6.get(1);
		pgth_r.goFullName().sendKeys(goname);
		Thread.sleep(1000);
		
		pgth_r.addIndividual();
		
		ArrayList data7=eu.getData("AddFullName");
		String fullname=(String) data7.get(1);
		pgth_r.addFullName().sendKeys(fullname);
		
		pgth_r.addHomeCountry();
		
		pgth_r.addEmailAddress();
		
		ArrayList data8=eu.getData("AddOfficialPosition");
		String officialPosition=(String) data8.get(1);
		pgth_r.addOfficialPosition().sendKeys(officialPosition);
		
		pgth_r.addIndividualButton();
		
		ArrayList data9=eu.getData("EmployerName");
		String emp=(String) data9.get(1);
		pgth_r.goEmployer().sendKeys(emp);
		
		pgth_r.addOrganization();
		
		ArrayList data10=eu.getData("Official Name");
		String emp_name=(String) data10.get(1);
		pgth_r.employerOfficialName().sendKeys(emp_name);
		
		pgth_r.addOrganizationButton();
		
		pgth_r.qRecipientHaveInfluence();
	
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
