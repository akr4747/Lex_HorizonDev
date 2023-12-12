package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ANA_Request;
import pageObjects.Gateway;
import pageObjects.Login;
import pageObjects.PreApprovalDisclosures;
import testComponents.BaseClass;

public class Test_ANA_Request extends BaseClass{
	
	 public static Logger log =LogManager.getLogger(BaseClass.class.getName());
	 @BeforeTest 
	  public void initialize() throws IOException {
	 
	  driver=initializeDriver();
	  }
	 
	 
	 @Test(dataProvider="login_getData")
	public void anaTile(String name, String year, String drop_bo, String name_ac, String therapeautic,
		    String functioanl , String product, String disease ,String utowner,
			String utBudget, String vendor_data, String ven_contact, String note, String business,
			String title, String num, String pro_num, String est_num, String target, String info) throws IOException, InterruptedException {
		
		driver.get(prop.getProperty("url"));
		Login lp=new Login(driver);
		String username=prop.getProperty("userName");
		String password=prop.getProperty("password");
		lp.enter_email().sendKeys(username);
		lp.enter_password().sendKeys(password);
		lp.click_signin().click();
		Gateway gt=new Gateway(driver);
		gt.pre_approval_dis().click();
		
		PreApprovalDisclosures pad=new PreApprovalDisclosures(driver);
		pad.annual_need_assessment().click();
		
		ANA_Request ar=new ANA_Request(driver);
		ar.tileName().sendKeys(name);
		ar.calendar().sendKeys(year);
		ar.businessOwner(drop_bo);
		ar.AanCategory(name_ac);
		ar.TherapeuticArea(therapeautic);
		ar.FunctionalArea(functioanl);
		ar.ProductRelates(product);
		ar.DiseaseState(disease);
		ar.UtBusinessOwner().sendKeys(utowner);
		ar.UtBudgetOwner().sendKeys(utBudget);
		ar.Vendor(vendor_data);
		ar.VendorContact().sendKeys(ven_contact);
		ar.VendorHCP();
		ar.VendorNote().sendKeys(note);
		ar.BusinessNeed().sendKeys(business);
		ar.attachActivityPlan();
		ar.TitlesDates().sendKeys(title);
		ar.ProjectedLive().sendKeys(num);
		ar.ProjectedVirtual().sendKeys(pro_num);
		ar.advisoryboardsSeries();
		ar.advisoryboardsjoint();
		ar.EstimatedNumberOfHCP().sendKeys(est_num);
		ar.TargetHCPSpecialties(target);
		ar.anyAdditionalInformation().sendKeys(info);
		ar.uploadFile();
		ar.SubmitRequest().click();
		ar.Requestor();
		ar.business_Owner();
		ar.initial_Compliance();
		ar.final_Compliance();
		ar.request_confirm().click();
	}
	
	 @AfterTest
	 public void closeWindow() {
		 driver.close();
	 }
	  
	@DataProvider
	public Object[][] login_getData() {
		
		Object[][] data=new Object[1][20];
		data[0][0]="ANA_Automation";
		data[0][1]="1234";
		data[0][2]="Brady Y";
		data[0][3]="Advisory Board Annual Plan";
		data[0][4]="Cardiovascular";
		data[0][5]="Accounting";
		data[0][6]="Not Applicable";
		data[0][7]="Lung Perfusion";
		data[0][8]="Akshay";
		data[0][9]="Budget Owner";
		data[0][10]="Agile Pharma Solutions";
		data[0][11]="vendor@gmail.com";
		data[0][12]="Vendor Notes TextArea";
		data[0][13]="Business need for Advisory Boards Text Area";
		data[0][14]="Titles, Dates and Topics TextArea";
		data[0][15]="10";
		data[0][16]="20";
		data[0][17]="30";
		data[0][18]="Administration: CEO/President";
		data[0][19]="Please provide any additional information below and/or upload any additional files to support your approval request.";
	//	data[0][20]="Akshay";
	//	data[0][21]="Akshay";
	//	data[0][22]="Akshay";
	//	data[0][23]="Akshay"; 
	
		return data;
	}

}
