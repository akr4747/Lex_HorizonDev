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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RGTH_Request {
	
	public WebDriver driver;
//	WebDriverWait wait=new WebDriverWait(driver,5);

	@FindBy(xpath = "//input[@id='request_name']")
	private WebElement requestName;
	
	@FindBy(xpath = "//input[@id='q_receipt_full_name']")
	private WebElement fullName;
	
	@FindBy(xpath="(//div[@class='lex-select__dropdown-add-container'])[1]")
	private WebElement add_individual_fullName;
	
	@FindBy(xpath="//input[@id='full_name']")
	private WebElement enter_individual_full_name;
	
	@FindBy(xpath="//input[@id='home_country_code']")
	private WebElement individual_home_country_code;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement individual_email;
	
	@FindBy(xpath="//input[@id='official_position']")
	private WebElement individual_official_position;
	
	@FindBy(xpath="(//button[@class='lex-button lex-button--primary lex-button--rounded'])[3]")
	private WebElement individual_add_button;
	
	@FindBy(xpath = "//input[@id='q_employer']")
	private WebElement employer;
	
	@FindBy(xpath="(//div[@class='lex-select__dropdown-add-container'])[2]")
	private WebElement add_orginazation;
	
	@FindBy(xpath="//input[@id='official_name']")
	private WebElement organization_official_name;
	
	@FindBy(xpath="(//button[@class='lex-button lex-button--primary lex-button--rounded'])[3]")
	private WebElement organization_add_button;
	
	@FindBy(xpath = "//input[@id='q_influence_over_offering_partys_business-no']")
	private WebElement offeringPartyBusinessNo;
	
	@FindBy(xpath = "//input[@id='q_type_of_benefit_being_provided']")
	private WebElement benefitProvided;
	
	@FindBy(xpath = "//input[@id='q_location']")
	private WebElement location;
	
	@FindBy(xpath = "//input[@id='q_short_description_entertainment']")
	private WebElement sortDescription;
	
	@FindBy(xpath = "//textarea[@id='q_des_business_purpose_or_rationale_entertainment']")
	private WebElement businessPurpose;
	
	@FindBy(xpath = "//input[@id='q_expected_date_of_receipt_entertainment']")
	private WebElement expectedDate;
	
	@FindBy(xpath = "(//input[@data-testid='currencybox-input'])[3]")
	private WebElement monetaryValue;
	
	@FindBy(xpath = "//button[@class='lex-button lex-button--secondary lex-button--rounded lex-file-upload__btn']")
	private WebElement addFile;
	
	@FindBy(xpath = "(//button[@class='lex-button lex-button--primary lex-button--rounded'])[2]")
	private WebElement submitRequest;

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[1]")
	private WebElement approver_Manager;

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[2]")
	private WebElement approver_Local_Legal_Recipient;

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[3]")
	private WebElement approver_Compliance_Ops;

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[4]")
	private WebElement approver_Compliance;

	@FindBy(xpath = "//button[@id='confirm']")
	private WebElement final_Request_Submit;
	
	public RGTH_Request(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void uploadFile(String fileLocation) {
		try {
			// Setting clipboard with file location
			setClipboardData(fileLocation);
			// native key strokes for CTRL, V and ENTER keys
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
		// StringSelection is a class that can be used for copy and paste operations.
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

	public WebElement rgthRequestName() {
		return requestName;
	}

	public WebElement partyFullName() {
		return fullName;
	}
	
	public void addIndividual() throws InterruptedException {
		add_individual_fullName.click();
		Thread.sleep(2000);
	}
	
	public WebElement individualFullName() {
		return enter_individual_full_name;
	}

	public void individualHomeCountryCode() {
		individual_home_country_code.click();
		List<WebElement> country = individual_home_country_code
				.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));	
		
		String selectCountry = "Afghanistan";
		for (int i = 0; i < country.size(); i++) {
			if (country.get(i).getText().contains(selectCountry)) {
				country.get(i).click();
				break;
			}
		}
		
	}
	
	public void individualEmail() {
		String generateString=RandomStringUtils.randomAlphabetic(8);
		String email=generateString+"@gmail.com";
		individual_email.sendKeys(email);
	//	return emailAddress;
	}
	
	public WebElement individualOfficialPosition() {
		return individual_official_position;
	}
	
	public void individualAddButton() {
		individual_add_button.click();
	}
	
	
	public WebElement partyEmployer() {
		WebDriverWait wait=new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.visibilityOf(employer));
		return employer;
	}
	
	public void addOrginazation() throws InterruptedException {
		add_orginazation.click();
		Thread.sleep(2000);
	}
	
	public WebElement enterOrganizationOfficialName() {
		return organization_official_name;
	}
	
	public void organizationAddButton() throws InterruptedException {
		organization_add_button.click();
		Thread.sleep(2000);
	}


	public void partyBusinessButton() {
		WebElement button = driver
				.findElement(By.cssSelector("input[id='q_influence_over_offering_partys_business-no']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
	}

	public void typeBenefit() throws InterruptedException {
		benefitProvided.click();
		Thread.sleep(2000);
		benefitProvided.sendKeys("Entertainment");
		Thread.sleep(1000);
		benefitProvided.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		benefitProvided.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	public void typeLocation() throws InterruptedException {
		location.click();
		Thread.sleep(2000);
		location.sendKeys("Brazil - Other");
		Thread.sleep(1000);
		location.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		location.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	public WebElement Description() {
		return sortDescription;
	}

	public WebElement businessPurposeOrRationale() {
		return businessPurpose;
	}

	public void expectedDateOfReceipt() {
		expectedDate.click();

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

	public WebElement estimatedMonetaryValue() {
		return monetaryValue;
	}

	public void fileUploaded() throws InterruptedException {
		addFile.click();
		Thread.sleep(2000);
		uploadFile(System.getProperty("user.dir") + "\\src\\test\\java\\testData\\File.pdf");
		Thread.sleep(5000);
	}

	public void rgthSubmitRequest() {
		submitRequest.click();
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

	}

	public void approverComplianceOps() throws InterruptedException {
		approver_Compliance_Ops.click();
		Thread.sleep(2000);
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
		WebDriverWait wait=new WebDriverWait(driver,1);
		wait.until(ExpectedConditions.elementToBeClickable(final_Request_Submit)).click();
//		final_Request_Submit.click();
		
		Thread.sleep(4000);
	}

}