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
import testComponents.BaseClass;
import utilities.ExcelUtils;

public class DisPotentionlConflictTile extends BaseClass {


	@Test(groups= {"smokeTests"})
	public void disclosePotentialConflictCompetitors() throws IOException, InterruptedException {

		
		Gateway gt = new Gateway(driver); 
		gt.pre_approval_dis().click(); 

		PreApprovalDisclosures dpc = new PreApprovalDisclosures(driver);
		dpc.disclose_potential_conflict().click();
	

		Disclose_a_Potential_Conflict dapc = new Disclose_a_Potential_Conflict(driver);

		ExcelUtils eu = new ExcelUtils();

		ArrayList data = eu.getData("Request Name");
		String request_name = (String) data.get(1);
		dapc.DPC_Request().sendKeys(request_name);

		dapc.Category(0);

		ArrayList data1 = eu.getData("competitor");
		String competor = (String) data1.get(1);
		dapc.potentialCompetitor().sendKeys(competor);

		dapc.ApproximateDate();

		ArrayList data2 = eu.getData("company competes");
		String company = (String) data2.get(1);
		dapc.companyCompetes().sendKeys(company);

		dapc.currentlyCompeting();

		dapc.collaborativeRelationships();

		ArrayList data3 = eu.getData("relationship");
		String relation = (String) data3.get(1);
		dapc.reportingRelationship().sendKeys(relation);

		dapc.formerManager();

		ArrayList data4 = eu.getData("additional");
		String ad = (String) data4.get(1);
		dapc.additionalInformation().sendKeys(ad);

		dapc.fileUploaded();

		dapc.submitRequest();

		dapc.managerApprover();

		dapc.complianceApprover();

		dapc.requestConfirm();

	}

	@Test
	public void disclosePotentialConflictCustomers() throws IOException, InterruptedException {

		
		Gateway gt = new Gateway(driver); 
		gt.pre_approval_dis().click(); 
		
		PreApprovalDisclosures dpc = new PreApprovalDisclosures(driver);
		dpc.disclose_potential_conflict().click();
	

		Disclose_a_Potential_Conflict dapc = new Disclose_a_Potential_Conflict(driver);

		ExcelUtils eu = new ExcelUtils();

		ArrayList data5 = eu.getData("COIRequestCustomer");
		String request_name = (String) data5.get(1);
		dapc.DPC_Request().sendKeys(request_name);

		dapc.Category(1);
		
		ArrayList data6 = eu.getData("Customer Name");
		String cutomer_name=(String) data6.get(1);
		dapc.nameOfCustomer().sendKeys(cutomer_name);
		
		dapc.approxDateOnPotentialConflictBeganCustomer();
		
		dapc.companyCurrentlyWorkingWithCustomer();
		
		dapc.active_Negotiations_To_Business_Customer();
		
		ArrayList data7 = eu.getData("RelationshipCustomer");
		String relationCustomer = (String) data7.get(1);
		dapc.desRelationshipAreReportingCustomer().sendKeys(relationCustomer);
		
		dapc.personInReportingChainDirectlyOrIndirectlyWithCustomer();
		
		dapc.formerManager();

		ArrayList data4 = eu.getData("additional");
		String ad = (String) data4.get(1);
		dapc.additionalInformation().sendKeys(ad);

		dapc.fileUploaded();
		
		dapc.submitRequest();

		dapc.managerApprover();

		dapc.complianceApprover();

		dapc.requestConfirm();

	} 

}
