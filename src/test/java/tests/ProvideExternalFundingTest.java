package tests;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import pageObjects.Gateway;
import pageObjects.PreApprovalDisclosures;
import pageObjects.ProvideExternalFunding;
import testComponents.BaseClass;
import utilities.ExcelUtils;

public class ProvideExternalFundingTest extends BaseClass{
	
	@Test
	public void provideExternalFundingRequest() throws IOException, InterruptedException {
		
		Gateway gt = new Gateway(driver);
		gt.pre_approval_dis().click();
		
		PreApprovalDisclosures exf = new PreApprovalDisclosures(driver);
		exf.provide_External_Funding().click();
		
		
		ProvideExternalFunding pxfr=new ProvideExternalFunding(driver);
		
		
		ExcelUtils eu = new ExcelUtils();
		
		ArrayList data =eu.getData("Recipient Name");
		String recipient_Name=(String) data.get(1);
		pxfr.recipientName().sendKeys(recipient_Name);
		
		pxfr.createNewButton();
		
		ArrayList data1=eu.getData("Funding Request Name");
		String request_Name=(String) data1.get(1);
		pxfr.requestName().sendKeys(request_Name);
		
		pxfr.registrationCountry();
		
		ArrayList data2=eu.getData("Year");
		String established_year=(String) data2.get(1);
		pxfr.qOorgFoundedOrEstablishedYear().sendKeys(established_year);
		
		pxfr.qOorgFoundedOrEstablishedYear();
		
		pxfr.qOrgNonProfitNo();
		
		ArrayList data3=eu.getData("Mission Description");
		String mission_description=(String) data3.get(1);
		pxfr.qMissionOfOrgDescription().sendKeys(mission_description);
		
		pxfr.qNecessaryExperienceOfOrgYes();
		
		ArrayList data4=eu.getData("Detail Organization");
		String detail_org=(String) data4.get(1);
		pxfr.qDesDetailOrgIdentified().sendKeys(detail_org);
		
		pxfr.qRecipientServeOnCommitteeNo();
		
		pxfr.qOrgIdentifiedByGovCustomerNo();
		
		pxfr.qOrgProsecutedForFraudCorrupNo();
		
		pxfr.qCompanyProvidedDonationsOrSponsorshipsToRecipientNo();
		
		pxfr.nextButton();
		
		pxfr.qFundingType();
		
		pxfr.externalFunding();
		
		pxfr.therapeuticArea();
		
		pxfr.diseaseStates();
		
		pxfr.externalFundingProduct();
		
		pxfr.approximateDate1();
		
		pxfr.currentDate2();
		
		pxfr.externalFundingCountry();
		
		ArrayList data5=eu.getData("Currency");
		String currencyAmount=(String) data5.get(1);
		pxfr.currencyBoxInput().sendKeys(currencyAmount);
		
		ArrayList data6=eu.getData("Funding Details");
		String fundingDetail=(String) data6.get(1);
		pxfr.qDescribeFundingDetail().sendKeys(fundingDetail);
		
		pxfr.qFundingOffsetOperatingNo();
		
		pxfr.qFundingSupportPatientAdvocacyOrgNo();
		
		pxfr.qFundingProvidedOrderOfferIncentiveNo();
		
		pxfr.qOrganizationAndPurposeOfFundingYes();
		
		pxfr.qFundingInvolveCashIncentiveNo();
		
		pxfr.qHesitateOrRefrainFromProvidingFundingNo();
		
		pxfr.qActivViolateApplicableLawsRegulationsEtcNo();
		
		pxfr.qHenefitsForFamilyRelativeNo();
		
		pxfr.qPositionToBenefitPersonallyFromFundingNo();
		
		pxfr.qFundingAnnouncedInPublicCeremonyYes();
		
		pxfr.qSecretiveFundingNo();
		
		pxfr.lexButtonPrimaryLexButtonRounded();
		
		pxfr.approverManager();
		
		pxfr.approverCompliance();
		
		pxfr.confirmButton();
	}
	
	
	
}
