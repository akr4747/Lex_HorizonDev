package pageObjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PGTH_Request {

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='request_name']")
	private WebElement request_name;

	@FindBy(xpath = "//input[@id='q_date_of_activity']")
	private WebElement q_date_of_activity1;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[5]/td[3]/div[1]")
	private WebElement current_Date2;

	@FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
	private WebElement select_Country;

	@FindBy(xpath = "//textarea[@id='q_activity_details_purpose']")
	private WebElement q_activity_details_purpose;

	@FindBy(xpath = "(//button[@class='lex-button lex-button--secondary lex-button--rounded lex-file-upload__btn'])[1]")
	private WebElement addFile;

	@FindBy(xpath = "//input[@id='q_activity_provide_recipients_substantive_education-yes']")
	private WebElement q_activity_provide_recipients_substantive_education;

	@FindBy(xpath = "//input[@id='q_support_connection_with_comp_insp-no']")
	private WebElement q_support_connection_with_comp_insp;

	@FindBy(xpath = "//input[@id='q_benefits_for_company_from_activity-no']")
	private WebElement q_benefits_for_company_from_activity;

	@FindBy(xpath = "//input[@id='q_gth_comply_with_applicable_provisions-yes']")
	private WebElement q_gth_comply_with_applicable_provisions;

	@FindBy(xpath = "//input[@id='q_recipient_selection_of_meeting_location-no']")
	private WebElement q_recipient_selection_of_meeting_location;

	@FindBy(xpath = "//input[@id='q_offered_to_provide_or_support-no']")
	private WebElement q_offered_to_provide_or_support;

	@FindBy(xpath = "//input[@id='q_refrain_from_activityl_for_any_reason-no']")
	private WebElement q_refrain_from_activityl_for_any_reason;

	@FindBy(xpath = "//input[@id='q_activ_violate_applicable_laws_regulations_etc-no']")
	private WebElement q_activ_violate_applicable_laws_regulations_etc;

	@FindBy(xpath = "//input[@id='q_benefits_for_family_relative-no']")
	private WebElement q_benefits_for_family_relative;

	@FindBy(xpath = "//input[@id='q_secretive_unusual_not_transparent-no']")
	private WebElement q_secretive_unusual_not_transparent;

	@FindBy(xpath = "//textarea[@id='q_additional_information_upload']")
	private WebElement q_additional_information_upload;

	@FindBy(xpath = "(//button[@class='lex-button lex-button--primary lex-button--rounded'])[2]")
	private WebElement button_Next;

	@FindBy(xpath = "(//span[@class='lex-button-menu__dropdown-button-span'])[1]")
	private WebElement add_Category;

	@FindBy(xpath = "//li[@id='t_provide_gift_travel_hospitality:qu_entertainment']")
	private WebElement category_Entertainment;

	@FindBy(xpath = "//textarea[@id='q_short_description']")
	private WebElement q_short_description;

	@FindBy(xpath = "//input[@data-testid='numericbox-input']")
	private WebElement amount_per_recipient;

	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[2]")
	private WebElement support_Method;

	@FindBy(xpath = "(//button[@class='lex-button lex-button--primary lex-button--rounded'])[3]")
	private WebElement save_and_close;

	@FindBy(xpath = "(//span[@class='lex-button-menu__dropdown-button-span'])[2]")
	private WebElement add_Recipient;

	@FindBy(xpath = "(//span[@class='ant-dropdown-menu-title-content']/span)[6]")
	private WebElement government_Official;

	@FindBy(xpath = "//input[@id='q_full_name_ind_autocomplete']")
	private WebElement full_Name;
	
	@FindBy(xpath="//div[@class='lex-select__dropdown-add-container']")
	private WebElement add_individual;
	
	@FindBy(xpath="//input[@id='full_name']")
	private WebElement add_full_name;
	
	@FindBy(xpath="//input[@id='home_country_code']")
	private WebElement add_home_country;
	
	@FindBy(xpath="(//input[@class='lex-textbox__input lex-textbox__input--secondary'])[2]")
	private WebElement add_email_address;
	
	@FindBy(xpath="//input[@id='official_position']")
	private WebElement add_official_position;
	
	@FindBy(xpath="(//button[@class='lex-button lex-button--primary lex-button--rounded'])[5]")
	private WebElement add_individual_button;

	@FindBy(xpath = "//input[@id='q_employer']")
	private WebElement go_Employer;
	
	@FindBy(xpath="(//div[@class='lex-select__dropdown-add-container'])[2]")
	private WebElement add_organization;
	
	@FindBy(xpath="//input[@id='official_name']")
	private WebElement employer_official_name;
	
	@FindBy(xpath="(//button[@class='lex-button lex-button--primary lex-button--rounded'])[5]")
	private WebElement add_organization_button;

	@FindBy(xpath = "//input[@id='q_recipient_have_influence-no']")
	private WebElement q_recipient_have_influence;

	@FindBy(xpath = "(//button[@class='lex-button lex-button--primary lex-button--rounded'])[3]")
	private WebElement go_Next;

	@FindBy(xpath = "//div[@class='requests-DlK2dbCMxgmZ5SwMUoNG']")
	private WebElement plus_Support_Category;

	@FindBy(xpath = "//div[@class='requests-TMYYkpc8QiMZ8hKKrwNp']")
	private WebElement edit_Support_Category;

	@FindBy(xpath = "//input[@id='q_location']")
	private WebElement q_location;

	@FindBy(xpath = "//div[@class='requests-j6zo9FiNpeph7nmt_B0W']")
	private WebElement update_Support_Category;

	@FindBy(xpath = "//button[@id='confirm']")
	private WebElement save_And_Close_Support_Category;

	@FindBy(xpath = "(//button[@class='lex-button lex-button--primary lex-button--rounded'])[2]")
	private WebElement submit_Request;

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[1]")
	private WebElement approver_Manager;

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[2]")
	private WebElement approver_Local_Legal_Recipient;

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[3]")
	private WebElement approver_Compliance_Ops;

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[4]")
	private WebElement approver_Compliance;

	@FindBy(xpath = "//button[@id='confirm']")
	private WebElement final_Request_Sumit;

	public PGTH_Request(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void uploadFile(String fileLocation) {
		try {

			setClipboardData(fileLocation);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

	public static void setClipboardData(String string) {

		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

	public WebElement GTH_Request() {
		return request_name;
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
	
	public void selectCountry(int index) throws InterruptedException {
		Thread.sleep(2000);
		select_Country.click();
		Thread.sleep(1000);
		List<WebElement> drop_country = select_Country
				.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		drop_country.get(index).click();
		Thread.sleep(1000);
	}

	public WebElement qActivityDetailsPurpose() {
		return q_activity_details_purpose;
	}

	public void fileUploaded() throws InterruptedException {
		addFile.click();
		Thread.sleep(2000);
		uploadFile(System.getProperty("user.dir") + "\\src\\test\\java\\testData\\File.pdf");
		Thread.sleep(5000);
	}

	public void qActivityProvideRecipientsSubstantiveEducationYes() {
		boolean selectRadio = q_activity_provide_recipients_substantive_education.isSelected();
		if (selectRadio == false) {
			q_activity_provide_recipients_substantive_education.click();
		}
	}

	public void qSupportConnectionWithCompInspNo() {
		boolean selectRadio = q_support_connection_with_comp_insp.isSelected();
		if (selectRadio == false) {
			q_support_connection_with_comp_insp.click();
		}
	}

	public void qBenefitsForCompanyFromActivityNo() {
		boolean selectRadio = q_benefits_for_company_from_activity.isSelected();
		if (selectRadio == false) {
			q_benefits_for_company_from_activity.click();
		}
	}

	public void qGthComplyWithApplicableProvisionsYes() {
		boolean selectRadio = q_gth_comply_with_applicable_provisions.isSelected();
		if (selectRadio == false) {
			q_gth_comply_with_applicable_provisions.click();
		}
	}

	public void qRecipientSelectionOfMeetingLocationNo() {
		boolean selectRadio = q_recipient_selection_of_meeting_location.isSelected();
		if (selectRadio == false) {
			q_recipient_selection_of_meeting_location.click();
		}
	}

	public void qOfferedToProvideOrSupportNo() {
		boolean selectRadio = q_offered_to_provide_or_support.isSelected();
		if (selectRadio == false) {
			q_offered_to_provide_or_support.click();
		}
	}

	public void qRefrainFromActivitylForAnyReasonNo() {
		boolean selectRadio = q_refrain_from_activityl_for_any_reason.isSelected();
		if (selectRadio == false) {
			q_refrain_from_activityl_for_any_reason.click();
		}
	}

	public void qActivViolateApplicableLawsRegulationsEtcNo() {
		boolean selectRadio = q_activ_violate_applicable_laws_regulations_etc.isSelected();
		if (selectRadio == false) {
			q_activ_violate_applicable_laws_regulations_etc.click();
		}
	}

	public void qBenefitsForFamilyRelativeNo() {
		boolean selectRadio = q_benefits_for_family_relative.isSelected();
		if (selectRadio == false) {
			q_benefits_for_family_relative.click();
		}
	}

	public void qSecretiveUnusualNotTransparentNo() {
		boolean selectRadio = q_secretive_unusual_not_transparent.isSelected();
		if (selectRadio == false) {
			q_secretive_unusual_not_transparent.click();
		}
	}

	public WebElement qAdditionalInformationUpload() {
		return q_additional_information_upload;
	}

	public void clickNextButton() {
		button_Next.click();
	}

	public void addCategory() {
		add_Category.click();
	}

	public void categoryEntertainment() {
		category_Entertainment.click();
	}

	public WebElement qShortDescription() {
		return q_short_description;
	}

	public WebElement amountPerRecipient() {
		return amount_per_recipient;
	}

	public void supportMethod(int index) throws InterruptedException {
		support_Method.click();
		Thread.sleep(1000);
		List<WebElement> support = support_Method
				.findElements(By.xpath("(//div[@class='rc-virtual-list-holder-inner']/div)"));
		support.get(index).click();
		Thread.sleep(1000);
	}

	public void saveAndClose() throws InterruptedException {
		save_and_close.click();
		Thread.sleep(2000);
	}

	public void clickAddRecipient() throws InterruptedException {
		add_Recipient.click();
		Thread.sleep(2000);
	}

	public void clickGovernmentOfficial() throws InterruptedException {

		WebElement element = driver.findElement(By.xpath("(//span[@class='ant-dropdown-menu-title-content']/span)[6]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		Thread.sleep(2000);
	}

	public WebElement goFullName() throws InterruptedException {
		return full_Name;
	}
	
	public void addIndividual() throws InterruptedException {
		add_individual.click();
		Thread.sleep(2000);
	}

/*	public WebElement addFullName() {
		return add_full_name;
	} */
	
	public void addHomeCountry() throws InterruptedException {
		add_home_country.click();
		Thread.sleep(2000);
		add_home_country.sendKeys("Algeria");
		Thread.sleep(2000);
		add_home_country.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		add_home_country.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

	}
	
	public void addEmailAddress() {
		String generateString=RandomStringUtils.randomAlphabetic(8);
		String email=generateString+"@gmail.com";
		add_email_address.sendKeys(email);
	//	return go_Email_Address;

	}
	
	public WebElement addOfficialPosition() {
		return add_official_position;
	}
	
	public void addIndividualButton() throws InterruptedException {
		add_individual_button.click();
		Thread.sleep(1000);
	}
	
	public WebElement goEmployer() {
		return go_Employer;
	}
	
	public void addOrganization() throws InterruptedException{
		add_organization.click();
		Thread.sleep(2000);
	}
	
/*	public WebElement employerOfficialName() {
		return employer_official_name; 
	}
	*/
	public void addOrganizationButton() throws InterruptedException {
		add_organization_button.click();
		Thread.sleep(1000);
	}
	
	public void qRecipientHaveInfluence() {

		WebElement button = driver.findElement(By.cssSelector("input[id='q_recipient_have_influence-no']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);

	}

	public void goNext() {
		go_Next.click();
	}

	public void plusSupportCategory() throws InterruptedException {
		plus_Support_Category.click();
		Thread.sleep(3000);
	}

	public void editSupportCategory() {
		edit_Support_Category.click();
	}

	public void qLocation() throws InterruptedException {
		q_location.click();
		Thread.sleep(2000);
		q_location.sendKeys("Brazil");
		Thread.sleep(1000);
		q_location.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		q_location.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

	}

	public void updateSupportCategory() throws InterruptedException {
		update_Support_Category.click();
		Thread.sleep(5000);
	}

	public void saveAndCloseSupportCategory() throws InterruptedException {
		save_And_Close_Support_Category.click();
		Thread.sleep(7000);
	}

	public void submitRequest() throws InterruptedException {
		submit_Request.click();
		Thread.sleep(7000);
	}

	public void approverManager() throws InterruptedException {
		approver_Manager.click();
		Thread.sleep(2000);
		List<WebElement> country = approver_Manager
				.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));

		String option = "Akshay Rajput";
		for (int i = 0; i < country.size(); i++) {

			if (country.get(i).getText().contains(option)) {

				country.get(i).click();

				break;

			}

		}
		Thread.sleep(2000);

	}

	public void approverLocalLegalRecipient() throws InterruptedException {
		approver_Local_Legal_Recipient.click();
		Thread.sleep(2000);

		List<WebElement> country1 = approver_Local_Legal_Recipient
				.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));

		String option = "Akshay Rajput";
		for (int i = 0; i < country1.size(); i++) {

			if (country1.get(i).getText().contains(option)) {

				country1.get(i).click();

				break;

			}

		}
		Thread.sleep(2000);

	}

	public void approverComplianceOps() throws InterruptedException {
		approver_Compliance_Ops.click();
		Thread.sleep(3000);
		List<WebElement> country2 = approver_Compliance_Ops
				.findElements(By.xpath("(//div[@class='rc-virtual-list-holder-inner'])/div"));
		String option1 = "Akshay Rajput";
		for (int i = 0; i < country2.size(); i++) {

			if (country2.get(i).getText().contains(option1)) {

				country2.get(i).click();

				break;
			}
		}

	}

	public void approverCompliance() throws InterruptedException {
		approver_Compliance.click();
		List<WebElement> country3 = approver_Compliance_Ops
				.findElements(By.xpath("(//div[@class='rc-virtual-list-holder-inner'])/div"));
		String option2 = "Akshay Rajput";
		for (int i = 0; i < country3.size(); i++) {

			if (country3.get(i).getText().contains(option2)) {

				country3.get(i).click();

				break;
			}
		}

	}

	public void finalRequestSumit() throws InterruptedException {
		final_Request_Sumit.click();
		Thread.sleep(4000);
	}

}