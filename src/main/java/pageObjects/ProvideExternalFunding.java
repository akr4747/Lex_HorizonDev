package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProvideExternalFunding {
	
	public WebDriver driver;

	@FindBy(xpath = "//input[@id='preApprovalOrganizationSearch_name']")
	private WebElement recipientName;
	
	@FindBy(css = "button[class='lex-button lex-button--primary lex-button--rounded approvals-QqX5_UikUdkR9TmIWkkB']")
	private WebElement createNewButton;
	
	@FindBy(css = "input[id='request_name']")
	private WebElement requestName;
	
	@FindBy(xpath = "//input[@id='q_official_name_of_org']")
	private WebElement 	qOfficialNameOfOrg;
	
	@FindBy(xpath="//div[@class='requests-i9VuKPKmiYj29bx226Yu']")
	private WebElement addOrganization;
	
	@FindBy(xpath="//input[@id='registration_country_code']")
	private WebElement registrationCountryCode;
	
	@FindBy(xpath="//input[@id='year_established']")
	private WebElement yearEstablished;
	
	@FindBy(xpath="(//button[@class='lex-button lex-button--primary lex-button--rounded'])[3]")
	private WebElement addOrganizationInfo;
	
	@FindBy(id="q_org_non_profit-no")
	private WebElement q_org_non_profit;
	
	@FindBy(id="q_mission_of_org_description")
	private WebElement q_mission_of_org_description;
	
	@FindBy(id ="q_necessary_experience_of_org-yes")
	private WebElement q_necessary_experience_of_org;
	
	@FindBy(id="q_des_detail_org_identified")
	private WebElement q_des_detail_org_identified;
	
	@FindBy(id="q_recipient_serve_on_committee-no")
	private WebElement q_recipient_serve_on_committee;
	
	@FindBy(id="q_org_identified_by_gov_customer-no")
	private WebElement q_org_identified_by_gov_customer;
	
	@FindBy(id="q_org_prosecuted_for_fraud_corrup-no")
	private WebElement q_org_prosecuted_for_fraud_corrup;
	
	@FindBy(id="q_company_provided_donations_or_sponsorships_to_recipient-no")
	private WebElement q_company_provided_donations_or_sponsorships_to_recipient;
	
	@FindBy(xpath= "(//button[@class='lex-button lex-button--primary lex-button--rounded'])[2]")
	private WebElement nextButton;
	
	@FindBy(xpath = "//input[@id='q_funding_type']")
	private WebElement q_funding_type;
	
	@FindBy(xpath="(//div[@class='ant-select-selection-overflow'])[1]")
	private WebElement external_funding;
	
	@FindBy(xpath="(//div[@class='ant-select-selection-overflow'])[2]")
	private WebElement therapeutic_area;
	
	@FindBy(xpath="(//div[@class='ant-select-selection-overflow'])[3]")
	private WebElement disease_states;
	
	@FindBy(xpath="(//div[@class='ant-select-selection-overflow'])[4]")
	private WebElement external_funding_product;
	
	@FindBy(xpath="//input[@id='q_date_of_activity']")
	private WebElement q_date_of_activity1;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[6]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[5]/div[1]")
	private WebElement current_Date2;
	
	@FindBy(xpath="(//div[@class='ant-select-selection-overflow'])[5]")
	private WebElement external_funding_country;
	
	@FindBy(xpath="(//input[@data-testid='numericbox-input'])[2]")
	private WebElement currencybox_input;
	
	@FindBy(xpath="//textarea[@id='q_describe_funding_detail']")
	private WebElement q_describe_funding_detail;
	
	@FindBy(id="q_funding_offset_operating-no")
	private WebElement q_funding_offset_operating;
	
	@FindBy(id="q_funding_support_patient_advocacy_org-no")
	private WebElement q_funding_support_patient_advocacy_org;
	
	@FindBy(id="q_funding_provided_order_offer_incentive-no")
	private WebElement q_funding_provided_order_offer_incentive;
	
	@FindBy(id="q_organization_and_purpose_of_funding-yes")
	private WebElement q_organization_and_purpose_of_funding;
	
	@FindBy(id="q_funding_involve_cash_incentive-no")
	private WebElement q_funding_involve_cash_incentive;
	
	@FindBy(id="q_hesitate_or_refrain_from_providing_funding-no")
	private WebElement q_hesitate_or_refrain_from_providing_funding;
	
	@FindBy(id="q_activ_violate_applicable_laws_regulations_etc-no")
	private WebElement q_activ_violate_applicable_laws_regulations_etc;
	
	@FindBy(id="q_benefits_for_family_relative-no")
	private WebElement q_benefits_for_family_relative;
	
	@FindBy(id="q_position_to_benefit_personally_from_funding-no")
	private WebElement q_position_to_benefit_personally_from_funding;
	
	@FindBy(id="q_funding_announced_in_public_ceremony-yes")
	private WebElement q_funding_announced_in_public_ceremony;
	
	@FindBy(id="q_secretive_funding-no")
	private WebElement q_secretive_funding;
	
	@FindBy(xpath="(//button[@class='lex-button lex-button--primary lex-button--rounded'])[2]")
	private WebElement lex_button;
	
	@FindBy(xpath="(//div[@class='ant-select-selection-overflow'])[6]")
	private WebElement approverManager;
	
	@FindBy(xpath= "(//div[@class='ant-select-selection-overflow'])[7]")
	private WebElement approverCompliance;
	
	@FindBy(xpath="(//button[@class='lex-button lex-button--primary lex-button--rounded'])[3]")
	private WebElement confirmButton;
	
	public ProvideExternalFunding(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement recipientName() {
		return recipientName;
	}
	
	public void createNewButton() {
		createNewButton.click();
	}
	
	public WebElement requestName() {
		return requestName;
	}
	
	public WebElement OfficialNameOfOrg(){
		return qOfficialNameOfOrg;
	}
	public void addOrganization() throws InterruptedException {
		addOrganization.click();
		Thread.sleep(2000);
	}
	
	public void registrationCountry() throws InterruptedException {
		registrationCountryCode.click();
		Thread.sleep(1000);
		List<WebElement> country=registrationCountryCode.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		String selectCountry = "Algeria";
		for(int i=0;i<country.size();i++){
			if(country.get(i).getText().contains(selectCountry)) {
				country.get(i).click();
				break;
			}
			
		}
		
	}
	
	public WebElement qOorgFoundedOrEstablishedYear() {
		return yearEstablished;
	}
	
	public void addOrganizationInformation() throws InterruptedException {
		addOrganizationInfo.click();
		Thread.sleep(2000);
	}
	
	public void qOrgNonProfitNo() {
		
		WebElement button = driver.findElement(By.xpath("//input[@id='q_org_non_profit-no']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
	}
	
	public WebElement qMissionOfOrgDescription(){
		return q_mission_of_org_description;
	}
	
	public void qNecessaryExperienceOfOrgYes() {
		boolean selectRadio=q_necessary_experience_of_org.isSelected();
		if(selectRadio==false) {
			q_necessary_experience_of_org.click();
		}
	}
	
	public WebElement qDesDetailOrgIdentified() {
		return q_des_detail_org_identified;
	}
	
	public void qRecipientServeOnCommitteeNo() {
		boolean selectRadio=q_recipient_serve_on_committee.isSelected();
		if(selectRadio==false) {
			q_recipient_serve_on_committee.click();
		}
	}
	
	public void qOrgIdentifiedByGovCustomerNo(){
		boolean selectRadio=q_org_identified_by_gov_customer.isSelected();
		if(selectRadio==false) {
			q_org_identified_by_gov_customer.click();
		}
	}
	
	public void qOrgProsecutedForFraudCorrupNo(){
		boolean selectRadio=q_org_prosecuted_for_fraud_corrup.isSelected();
		if(selectRadio==false) {
			q_org_prosecuted_for_fraud_corrup.click();
		}
	}
	
	public void qCompanyProvidedDonationsOrSponsorshipsToRecipientNo(){
		boolean selectRadio=q_company_provided_donations_or_sponsorships_to_recipient.isSelected();
		if(selectRadio==false) {
			q_company_provided_donations_or_sponsorships_to_recipient.click();
		}
	}
	
	public void nextButton() {
		nextButton.click();
	}
	
	public void qFundingType() throws InterruptedException {
		q_funding_type.click();
		Thread.sleep(2000);
		List<WebElement> fundingType=driver.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		
		String selectFundingType = "Charitable Contribution";
		for(int i=0; i<fundingType.size(); i++){
			if(fundingType.get(i).getText().contains(selectFundingType)) {
				fundingType.get(i).click();
				break;
			}
		}
	}
	
	public void externalFunding() throws InterruptedException {
		external_funding.click();
		Thread.sleep(2000);
		List<WebElement> externalFunding=driver.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		
		String externalFundingType= "Advertising";
		for(int i=0; i< externalFunding.size(); i++) {
			if(externalFunding.get(i).getText().contains(externalFundingType)) {
				externalFunding.get(i).click();
				break;
			}
		}
	}
	
	public void therapeuticArea() throws InterruptedException {
		therapeutic_area.click();
		Thread.sleep(2000);
		List<WebElement> area = driver.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		
		String externalFundingType= "Cardiovascular";
		for(int i=0; i< area.size(); i++) {
			if(area.get(i).getText().contains(externalFundingType)) {
				area.get(i).click();
				break;
			}
		}
		}
	
	
	public void diseaseStates() throws InterruptedException {
		disease_states.click();
		Thread.sleep(2000);
		List<WebElement> state = driver.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		
		String diseasestates= "Disease State 1";
		for(int i=0; i< state.size(); i++) {
			if(state.get(i).getText().contains(diseasestates)) {
				state.get(i).click();
				break;
			}
		}
	}
	
	public void externalFundingProduct() throws InterruptedException {
		external_funding_product.click();
		Thread.sleep(2000);
		List<WebElement> product = driver.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		
		String products= "Product 1";
		for(int i=0; i< product.size(); i++) {
			if(product.get(i).getText().contains(products)) {
				product.get(i).click();
				break;
			}
		}
	}
	
	public void approximateDate1() {
		q_date_of_activity1.click();
		
		WebElement clickMonths = driver.findElement(By.cssSelector("button[class='ant-picker-month-btn']"));
		clickMonths.click();
		List<WebElement> months = driver.findElements(By.cssSelector("div[class='ant-picker-cell-inner']"));
		String month = "Aug";
		for (int i = 0; i < months.size(); i++) {
			if (months.get(i).getText().contains(month)) {
				months.get(i).click();
				break;
			}
		}

		List<WebElement> dates = driver.findElements(By.cssSelector("div[class='ant-picker-cell-inner']"));
		String date = "21";
		for (int i = 0; i < dates.size(); i++) {
			if (dates.get(i).getText().contains(date)) {
				dates.get(i).click();
				break;
			}
		}
		
	}

	public void currentDate2() {
		current_Date2.click();
	}
	
	public void externalFundingCountry() throws InterruptedException {
		external_funding_country.click();
		Thread.sleep(2000);
		List<WebElement> selectCountry = driver.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		
		String country= "Afghanistan";
		for(int i=0; i<selectCountry.size(); i++) {
			if(selectCountry.get(i).getText().contains(country)) {
				selectCountry.get(i).click();
				break;
			}
		}
	
	}
	
	public WebElement currencyBoxInput() {
		return currencybox_input;
	}
	
	public WebElement qDescribeFundingDetail(){
		return q_describe_funding_detail;
}
	
	public void qFundingOffsetOperatingNo(){
		boolean q_funding_offset= q_funding_offset_operating.isSelected();
		if(q_funding_offset==false) {
			q_funding_offset_operating.click();
		}	
	}
	
	public void qFundingSupportPatientAdvocacyOrgNo(){
		boolean q_funding_support=q_funding_support_patient_advocacy_org.isSelected();
		if(q_funding_support==false) {
			q_funding_support_patient_advocacy_org.click();
		}
	}
	
	public void qFundingProvidedOrderOfferIncentiveNo(){
		boolean q_funding_provided_order=q_funding_provided_order_offer_incentive.isSelected();
		if(q_funding_provided_order==false) {
			q_funding_provided_order_offer_incentive.click();
		}
	}
	
	public void qOrganizationAndPurposeOfFundingYes(){
		boolean q_organization=q_organization_and_purpose_of_funding.isSelected();
		if(q_organization==false) {
			q_organization_and_purpose_of_funding.click();
		}
	}
	
	public void qFundingInvolveCashIncentiveNo(){
		boolean q_funding_involve=q_funding_involve_cash_incentive.isSelected();
		if(q_funding_involve==false) {
			q_funding_involve_cash_incentive.click();
		}
	}
	
	public void qHesitateOrRefrainFromProvidingFundingNo(){
		boolean q_hesitate_or_refrain=q_hesitate_or_refrain_from_providing_funding.isSelected();
		if(q_hesitate_or_refrain==false) {
			q_hesitate_or_refrain_from_providing_funding.click();
		}	
	}
	
	public void qActivViolateApplicableLawsRegulationsEtcNo() {
		boolean q_activ_violate_applicable=q_activ_violate_applicable_laws_regulations_etc.isSelected();
		if(q_activ_violate_applicable==false) {
			q_activ_violate_applicable_laws_regulations_etc.click();
		}
	}
	
	public void qHenefitsForFamilyRelativeNo(){
		boolean q_benefits_for_family=q_benefits_for_family_relative.isSelected();
		if(q_benefits_for_family==false) {
			q_benefits_for_family_relative.click();
		}
	}
	
	public void qPositionToBenefitPersonallyFromFundingNo(){
		boolean q_position_to_benefit_personally=q_position_to_benefit_personally_from_funding.isSelected();
		if(q_position_to_benefit_personally==false) {
			q_position_to_benefit_personally_from_funding.click();
		}
	}
	
	public void qFundingAnnouncedInPublicCeremonyYes(){
		boolean q_funding_announced = q_funding_announced_in_public_ceremony.isSelected();
		if(q_funding_announced==false) {
			q_funding_announced_in_public_ceremony.click();
		}
	}
	
	public void qSecretiveFundingNo(){
		boolean q_secretive=q_secretive_funding.isSelected();
		if(q_secretive==false) {
			q_secretive_funding.click();
		}
	}
	
	public void lexButtonPrimaryLexButtonRounded(){
		lex_button.click();
	}
	
	public void approverManager() {
		approverManager.click();
		List<WebElement> approver=driver.findElements(By.xpath("(//div[@class='rc-virtual-list-holder-inner'])/div"));
		String name="Akshay Rajput";
		for(int i=0;i < approver.size();i++) {
			if(approver.get(i).getText().contains(name)) {
				approver.get(i).click();
				break;
			}
		}
	}
	
	public void approverCompliance() {
		approverCompliance.click();
		List<WebElement> approver=driver.findElements(By.xpath("(//div[@class='rc-virtual-list-holder-inner'])/div"));
		String name="Akshay Rajput";
		for(int i=0;i < approver.size();i++) {
			if(approver.get(i).getText().contains(name)) {
				approver.get(i).click();
				break;
			}
		}
	}
	
	public void confirmButton() throws InterruptedException {
		confirmButton.click();
		Thread.sleep(5000);
	}
	
}