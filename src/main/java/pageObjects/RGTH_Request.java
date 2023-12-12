package pageObjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RGTH_Request {

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='request_name']")
	private WebElement requestName;
	
	@FindBy(xpath = "//input[@id='q_receipt_full_name']")
	private WebElement fullName;
	
	@FindBy(xpath = "//input[@id='q_employer']")
	private WebElement employer;
	
	@FindBy(xpath = "//input[@id='q_title_or_official_position']")
	private WebElement officalPosition;
	
	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[3]")
	private WebElement homeCountry;
	
	@FindBy(xpath = "//input[@id='q_email_address']")
	private WebElement emailAddress;
	
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
	
	@FindBy(xpath = "//input[@class='lex-currencybox__input lex-currencybox__input--secondary lex-currencybox__input--error']")
	private WebElement monetaryValue;
	
	@FindBy(xpath = "//button[@class='lex-button lex-button--secondary lex-button--rounded lex-file-upload__btn']")
	private WebElement addFile;
	
	@FindBy(xpath = "(//button[@class='lex-button lex-button--primary lex-button--rounded'])[2]")
	private WebElement submitRequest;

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

	public WebElement partyEmployer() {
		return employer;
	}

	public WebElement titleOrOfficialPosition() {
		return officalPosition;
	}

	public void partyHomeCountry() throws InterruptedException {
		homeCountry.click();
		Thread.sleep(1000);
		List<WebElement> country = homeCountry
				.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		String selectCountry = "Afghanistan";
		for (int i = 0; i < country.size(); i++) {
			if (country.get(i).getText().contains(selectCountry)) {
				country.get(i).click();
				break;
			}
		}
	}

	public WebElement partyEmailAddress() {
		return emailAddress;
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
		uploadFile("/home/akshayks304/Documents/Files/dummy.pdf");
		Thread.sleep(5000);
	}

	public void rgthSubmitRequest() {
		submitRequest.click();
	}
}