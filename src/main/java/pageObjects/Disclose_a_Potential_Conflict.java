package pageObjects;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Disclose_a_Potential_Conflict {

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='request_name']")
	private WebElement requestName;

	@FindBy(xpath = "//input[@class='ant-select-selection-search-input']")
	private WebElement selectCategory;

	@FindBy(xpath = "//input[@id='q_name_of_competitor_potential_competitor']")
	private WebElement potCompetitor;

	@FindBy(xpath = "//input[@id='q_approx_date_on_potential_conflict_began_competitor']")
	private WebElement approxDate;

	@FindBy(xpath = "//textarea[@id='q_des_areas_in_which_company_competes']")
	private WebElement comCompetes;

	@FindBy(xpath = "//input[@id='q_company_currently_competing_with_our_company-no']")
	private WebElement competingNo;

	@FindBy(xpath = "//input[@id='q_company_have_collaborative_relationships-no']")
	private WebElement collaboratorRelation;

	@FindBy(xpath = "//textarea[@id='q_des_reported_relationship_competitor']")
	private WebElement reportRelationship;

	@FindBy(xpath = "//input[@id='q_previously_disclosed_conflict_to_manager_former_manager-no']")
	private WebElement managerNo;

	@FindBy(xpath = "//textarea[@id='q_any_additional_info_considered']")
	private WebElement additionalInfo;

	@FindBy(xpath = "//button[@class='lex-button lex-button--secondary lex-button--rounded lex-file-upload__btn']")
	private WebElement addFile;

	@FindBy(xpath = "(//button[@class='lex-button lex-button--primary lex-button--rounded'])[2]")
	private WebElement submitConflict;

	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[2]")
	private WebElement approver1;

	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[3]")
	private WebElement approver2;

	@FindBy(xpath = "(//button[@class='lex-button lex-button--primary lex-button--rounded'])[3]")
	private WebElement confirm;
	
	@FindBy(xpath="//input[@id='q_name_of_customer']")
	private WebElement name_Of_Customer;
	
	@FindBy(xpath="//input[@id='q_approx_date_on_potential_conflict_began_customer']")
	private WebElement approx_Date_On_Potential_Conflict_Began_Customer;
	
	@FindBy(xpath="//input[@id='q_company_currently_working_with_customer-no']")
	private WebElement company_Currently_Working_With_Customer;
	
	@FindBy(xpath="//input[@id='q_in_active_negotiations_to_business_customer-no']")
	private WebElement active_Negotiations_To_Business_Customer;
	
	@FindBy(xpath="//textarea[@id='q_des_relationship_are_reporting_customer']")
	private WebElement des_Relationship_Are_Reporting_Customer;

	@FindBy(xpath="//input[@id='q_person_in_reporting_chain_directly_or_indirectly_with_customer-no']")
	private WebElement person_In_Reporting_Chain_Directly_Or_Indirectly_With_Customer;
	
	public Disclose_a_Potential_Conflict(WebDriver driver) {
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

	public WebElement DPC_Request() {
		return requestName;
	}

	public void Category(int index) throws InterruptedException {
		selectCategory.click();
		List<WebElement> drop_bo = selectCategory.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		drop_bo.get(index).click();
	}

	public WebElement potentialCompetitor() {
		return potCompetitor;
	}

	public void ApproximateDate() {
		approxDate.click();
		
		WebElement clickMonths=driver.findElement(By.cssSelector("button[class='ant-picker-month-btn']"));
		clickMonths.click();
		List<WebElement> months = driver.findElements(By.cssSelector("div[class='ant-picker-cell-inner']"));
		String month = "Aug";
		for (int i=0;i<months.size();i++)
		{
			if(months.get(i).getText().contains(month)) {
				months.get(i).click();
				break;
			}
		}
			
		while(!driver.findElement(By.cssSelector("div[class='ant-picker-header-view']")).getText().contains("2030"))
		{
			driver.findElement(By.cssSelector("span[class='ant-picker-super-next-icon']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.cssSelector("div[class='ant-picker-cell-inner']"));
		String date = "21";
		for (int i=0;i<dates.size();i++)
		{
			if(dates.get(i).getText().contains(date)) {
				dates.get(i).click();
				break;
			}
		}
		
	}


	public WebElement companyCompetes() {
		return comCompetes;
	}

	public void currentlyCompeting() {
		boolean select = competingNo.isSelected();
		// performing click operation if element is not already selected
		if (select == false) {
			competingNo.click();
		}

	}

	public void collaborativeRelationships() {
		boolean select = collaboratorRelation.isSelected();
		if (select == false) {
			collaboratorRelation.click();
		}

	}

	public WebElement reportingRelationship() {
		return reportRelationship;
	}

	public void formerManager() {
		boolean select = managerNo.isSelected();
		if (select == false) {
			managerNo.click();
		}

	}

	public WebElement additionalInformation() {
		return additionalInfo;
	}

	public void fileUploaded() throws InterruptedException {
		addFile.click();
		Thread.sleep(2000);
		uploadFile(System.getProperty("user.dir") + "\\src\\test\\java\\testData\\File.pdf");
		Thread.sleep(5000);
	}

	public void submitRequest() throws InterruptedException {
		submitConflict.click();
		Thread.sleep(6000);

	}

	public void managerApprover() throws InterruptedException {
//		 WebDriverWait w=new WebDriverWait(driver,6);
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ant-modal-title']")));
		approver1.click();
//		  Thread.sleep(2000); 
		approver1.sendKeys("Akshay");
//		  Thread.sleep(1000);
		approver1.sendKeys(Keys.DOWN);
//		  Thread.sleep(1000);
		approver1.sendKeys(Keys.ENTER);
//		  Thread.sleep(1000); 
	}

	public void complianceApprover() throws InterruptedException {
		approver2.click();
//		  Thread.sleep(2000);
		approver2.sendKeys("Akshay");
//		  Thread.sleep(1000);
		approver2.sendKeys(Keys.DOWN);
//		  Thread.sleep(1000);
		approver2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	public void requestConfirm() throws InterruptedException {
		confirm.click();
		Thread.sleep(2000);
	}
	
	public WebElement nameOfCustomer() {
		return name_Of_Customer;
	}
	
	public void approxDateOnPotentialConflictBeganCustomer() {
		approx_Date_On_Potential_Conflict_Began_Customer.click();
		WebElement clickMonths=driver.findElement(By.cssSelector("button[class='ant-picker-month-btn']"));
		clickMonths.click();
		List<WebElement> months = driver.findElements(By.cssSelector("div[class='ant-picker-cell-inner']"));
		String month = "Aug";
		for (int i=0;i<months.size();i++)
		{
			if(months.get(i).getText().contains(month)) {
				months.get(i).click();
				break;
			}
		}
			
		while(!driver.findElement(By.cssSelector("div[class='ant-picker-header-view']")).getText().contains("2030"))
		{
			driver.findElement(By.cssSelector("span[class='ant-picker-super-next-icon']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.cssSelector("div[class='ant-picker-cell-inner']"));
		String date = "21";
		for (int i=0;i<dates.size();i++)
		{
			if(dates.get(i).getText().contains(date)) {
				dates.get(i).click();
				break;
			}
		}
	}
	
	public void companyCurrentlyWorkingWithCustomer() {
		boolean select = company_Currently_Working_With_Customer.isSelected();
		if (select == false) {
			company_Currently_Working_With_Customer.click();
		}
	}
	
	public void active_Negotiations_To_Business_Customer() {
		boolean select =active_Negotiations_To_Business_Customer.isSelected();
		if(select == false){
			active_Negotiations_To_Business_Customer.click();
		}
	}
	
	public WebElement desRelationshipAreReportingCustomer() {
		return des_Relationship_Are_Reporting_Customer;
	}
	
	public void personInReportingChainDirectlyOrIndirectlyWithCustomer() {
		boolean select =person_In_Reporting_Chain_Directly_Or_Indirectly_With_Customer.isSelected();
		if(select == false) {
			person_In_Reporting_Chain_Directly_Or_Indirectly_With_Customer.click();
		}
	}

}
