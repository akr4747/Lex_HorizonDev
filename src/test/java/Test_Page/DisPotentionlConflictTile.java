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

public class DisPotentionlConflictTile extends base_class {

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
	}

	@Test
	public void disclosePotentialConflict() throws IOException, InterruptedException {

		driver.get(prop.getProperty("url"));
		login_page lp = new login_page(driver);
		String username = prop.getProperty("userName");
		String password = prop.getProperty("password");
		lp.enter_email().sendKeys(username);
		lp.enter_password().sendKeys(password);
		lp.click_signin().click();
		gateway gt = new gateway(driver);
		gt.pre_approval_dis().click();

		pre_approval_disclosures dpc = new pre_approval_disclosures(driver);
		dpc.discloseAPotentialConflict().click();

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

		dapc.currentDate();

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

		dapc.clickSubmitComment();

		dapc.complianceApprover();

		dapc.requestConfirm();

	}

	@AfterTest
	public void closeWindow() {
		driver.close();
	}

}
