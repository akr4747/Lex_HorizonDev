package Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pre_approval_disclosures {

	public WebDriver driver;
	
	By approval_request=By.xpath("//h1[@class='approvals-JJMhtPIrZqpQCyUUkbJ9']");
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[1]")
	private WebElement provide_a_Medical_Utility_Item_or_Promotional_Aid_Item;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[2]")
	private WebElement provide_a_Political_Contribution;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[3]")
	private WebElement annual_Needs_Assessment;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[4]")
	private WebElement engage_a_Consultant;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[5]")
	private WebElement provide_Meeting_Support;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[6]")
	private WebElement provide_a_Gift_Travel_or_Hospitality;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[7]")
	private WebElement provide_Donations_and_Sponsorships;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[8]")
	private WebElement disclose_the_Receipt_of_a_Gift_Travel_or_Hospitality;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[9]")
	private WebElement disclose_a_Potential_Conflict;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[10]")
	private WebElement provide_External_Funding;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[11]")
	private WebElement speaker_Bureau_Annual_Needs_Assessment;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[12]")
	private WebElement case_intake_request;
	
	@FindBy(xpath="(//div[@class='ant-tabs-tab-btn'])[1]")
	private WebElement submissions;
	
	@FindBy(xpath="(//div[@class='ant-tabs-tab-btn'])[2]")
	private WebElement approvals;
	
	public pre_approval_disclosures(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement Start_an_Approval_Request(){
		return driver.findElement(approval_request);
		
	}
	
	public WebElement provideAMedicalUtilityItemOrPromotionalAidItem(){
		return provide_a_Medical_Utility_Item_or_Promotional_Aid_Item;
	}
	
	public WebElement provideAPoliticalContribution(){
		return provide_a_Political_Contribution;
	}
	
	public WebElement annual_need_assessment() {
		return annual_Needs_Assessment;
	}
	
	public WebElement engageAConsultant(){
		return engage_a_Consultant;
	}
	
	public WebElement provideMeetingSupport(){
		return provide_Meeting_Support;
	}
	
	public WebElement provideAGiftTravelOrHospitality(){
		return provide_a_Gift_Travel_or_Hospitality;
	}
	
	public WebElement provideDonationsAndSponsorships(){
		return provide_Donations_and_Sponsorships;
	}
	
	public WebElement discloseTheReceiptOfAGiftTravelOrHospitality() {
		return disclose_the_Receipt_of_a_Gift_Travel_or_Hospitality;
	}
	
	public WebElement discloseAPotentialConflict() {
		return disclose_a_Potential_Conflict;
	}
	
	public WebElement provideExternalFunding() {
		return provide_External_Funding;
	}
	
	public WebElement speakerBureauAnnualNeedsAssessment(){
		return speaker_Bureau_Annual_Needs_Assessment;
	}
	
	public WebElement caseIntakeRequest() {
		return case_intake_request;
	}
	
	
	public WebElement submission() {
		return submissions;
	}
	
	public WebElement approval() {
		return approvals;
	}

	
}
