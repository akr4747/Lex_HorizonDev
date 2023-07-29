package Page_Object;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Disclose_a_Potential_Conflict {
	
	public WebDriver driver;
	
	
	@FindBy(xpath="//input[@id='request_name']")
	private WebElement requestName;
	
	@FindBy(xpath="//input[@class='ant-select-selection-search-input']")
	private WebElement selectCategory;
	
	@FindBy(xpath="//*[@id=\"q_request_on_behalf_employee-no\"]")
	private WebElement fillingRequestNo;
	
	@FindBy(xpath="//*[@id=\"q_previously_disclosed_conflict-no\"]")
	private WebElement previouslyDisclosedNo;
	
	
	@FindBy(xpath="(//button[@class='lex-button lex-button--secondary lex-button--rounded lex-file-upload__btn'])[1]")
	private WebElement UploadFile;
	
	
	@FindBy(xpath="//*[@id=\"q_name_vendor_supplier_contractor\"]")
	private WebElement vendorSupplierContractor;
	
	@FindBy(xpath="//*[@id=\"q_company_currently_doing_business-no\"]")
	private WebElement currentlyBusinessNo;
	
	@FindBy(xpath="//*[@id=\"q_company_in_active_negotiations_begin_business_01-no\"]")
	private WebElement activeNegotiationsNo;
	
	
	@FindBy(xpath="//*[@id=\"q_nature_of_business_to_identify_company_01\"]")
	private WebElement natureBusiness;
	
	@FindBy(xpath="//textarea[@id='q_relationship_you_reporting_01']")
	private WebElement describeRelationship;
	
	@FindBy(xpath="//*[@id=\"q_you_interact_with_company_01-no\"]")
	private WebElement reportingChainNo;
	
	
	@FindBy(xpath="//*[@id=\"q_conflict_effective_date\"]")
	private WebElement effectiveDate;
	
	@FindBy(xpath="(//div[@class='ant-picker-cell-inner'])[25]")
	private WebElement currentDate;
	
	@FindBy(xpath="//*[@id=\"q_additional_information_upload\"]")
	private WebElement additionalInformation;
	
	@FindBy(xpath="(//button[@class='lex-button lex-button--secondary lex-button--rounded lex-file-upload__btn'])[2]")
	private WebElement addFile;
	
	@FindBy(xpath="//button[@class='lex-button lex-button--primary lex-button--rounded']")
	private WebElement submitConflict;
	
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[3]")
	private WebElement approver2;
	
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[4]")
	private WebElement approver3;
	
	@FindBy(xpath="(//button[@class='lex-button lex-button--primary lex-button--rounded'])[2]")
	private WebElement confirm;
	
	public Disclose_a_Potential_Conflict(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	public static void uploadFile(String fileLocation) {
        try {
        	//Setting clipboard with file location
            setClipboardData(fileLocation);
            //native key strokes for CTRL, V and ENTER keys
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
		//StringSelection is a class that can be used for copy and paste operations.
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}
	
	
	public WebElement DPC_Request() {
		return requestName;
	}
	
	public void Category(int index){
		selectCategory.click();
		List <WebElement> drop_bo = selectCategory.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		drop_bo.get(index).click();
	}
	
	public void tenantEmployeeNo(){
		boolean select = fillingRequestNo.isSelected();
		// performing click operation if element is not already selected
		if (select == false) {
			fillingRequestNo.click();
		}
	
	}
	
	public void disclosedConflict(){
		boolean select = previouslyDisclosedNo.isSelected();
		if (select == false) {
			previouslyDisclosedNo.click();
		}

	}
	
	public void fileUpload() throws InterruptedException {
		UploadFile.click();
		Thread.sleep(2000);
		uploadFile("G:\\Lextegrity\\Files\\kb.pdf");
		Thread.sleep(5000);
	}
	
	public WebElement Vendor() {
		return vendorSupplierContractor;
	}
	
	public void companyCurrentlyNo() {
		boolean select = currentlyBusinessNo.isSelected();
		if (select == false) {
			currentlyBusinessNo.click();
		}
	}
	
	public void activeNegotiationsNo() {
		boolean select = activeNegotiationsNo.isSelected();
		if (select == false) {
			activeNegotiationsNo.click();
		}
	}
	
	public WebElement businessTexBox() throws InterruptedException {
		Thread.sleep(2000);
		return natureBusiness;
		
	}
	
	public WebElement reportingTextBox() {
		return describeRelationship;
	}
	
	public void reportingChainNo() {
		boolean select = reportingChainNo.isSelected();
		if (select == false) {
			reportingChainNo.click();
		}
	}
	
	
	public void effectiveDate() {
		effectiveDate.click();
	}
	
	public void currentDate() {
		currentDate.click();
	}
	
	public WebElement additionalInformation() {
		return additionalInformation;
	}
	
	public void fileUploaded() throws InterruptedException {
		 addFile.click();
		 Thread.sleep(2000);
		 uploadFile("G:\\Lextegrity\\Files\\kb.pdf");
		 Thread.sleep(5000);
	}
	
	public WebElement submitRequest() {
		return submitConflict;
	}
	
	public void HR() throws InterruptedException{
		approver2.click();
		 Thread.sleep(2000);
		 approver2.sendKeys("Akshay");
		 Thread.sleep(1000);
		 approver2.sendKeys(Keys.DOWN);
		 Thread.sleep(1000);
		 approver2.sendKeys(Keys.ENTER);
		 Thread.sleep(1000); 
	}
	
	public void serviceCenter() throws InterruptedException{
		approver3.click();
		 Thread.sleep(2000);
		 approver3.sendKeys("Akshay");
		 Thread.sleep(1000);
		 approver3.sendKeys(Keys.DOWN);
		 Thread.sleep(1000);
		 approver3.sendKeys(Keys.ENTER);
		 Thread.sleep(1000); 
	}
	
	public WebElement requestConfirm() throws InterruptedException {
		return confirm;
		
	}
}
