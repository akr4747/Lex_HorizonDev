package Page_Object;
import java.awt.datatransfer.StringSelection;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.awt.Toolkit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ANA_Request {

	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='request_name']")
	private WebElement requestName;
//	By requestName=By.xpath("//input[@id='request_name']");
	
	@FindBy(xpath="//*[@id='q_year_activities_panned']")
	private WebElement calendarYear;
	
	@FindBy(xpath="//input[@id='q_business_owner']")
	private WebElement businessOwner;
	
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[2]")
	private WebElement anaCategory;
	
	@FindBy(xpath="(//div[@class='ant-select-selection-overflow'])[1]")
	private WebElement therapeuticArea;
	
	@FindBy(xpath="//*[@id=\"q_functional_area\"]")
	private WebElement functionalArea;
	
	@FindBy(xpath="(//div[@class='ant-select-selection-overflow'])[2]")
	private WebElement productReleates;
	
	@FindBy(xpath="(//div[@class='ant-select-selection-overflow'])[3]")
	private WebElement diseaseState;
	
	@FindBy(xpath="//*[@id=\"q_ut_business_owner\"]")
	private WebElement utBusinessOwner;
	
	@FindBy(xpath="//*[@id=\"q_ut_budget_owner\"]")
	private WebElement utBudgetOwner;
	
	@FindBy(xpath="(//div[@class='ant-select-selection-overflow'])[4]")
	private WebElement vendor;
	
	@FindBy(xpath="//*[@id=\"q_vendor_contact\"]")
	private WebElement vendorContact;
	
	@FindBy(xpath="//*[@id=\"q_vendor_issue_payments_on_behalf-yes\"]")
	private WebElement vendorHcpYes;
	
	@FindBy(xpath="//*[@id=\"q_vendor_issue_payments_on_behalf-no\"]")
	private WebElement vendorHcpNo;
	
	@FindBy(xpath="//*[@id=\"q_vendor_notes\"]")
	private WebElement vendorNotes;
	
	@FindBy(xpath="//*[@id=\"q_business_need_for_ad_board_text\"]")
	private WebElement businessNeedForAdvisoryBoards;
	
	@FindBy(xpath="(//button[@class='lex-button lex-button--secondary lex-button--rounded lex-file-upload__btn'])[1]")
	private WebElement attachFullActivityPlan;
	
	@FindBy(xpath="//*[@id=\"q_titles_topics\"]")
	private WebElement titlesDatesAndTopics;
	
	@FindBy(xpath="//*[@id=\"q_number_of_live_ad_boards\"]")
	private WebElement projectedNumberOfLive;
	
	@FindBy(xpath="//*[@id=\"q_number_of_virtual_ad_boards\"]")
	private WebElement projectedNumberOfVirtual;
	
	@FindBy(xpath="//*[@id=\"q_any_ad_boards_series-yes\"]")
	private WebElement advisoryBoardsSeriesYes;
	
	@FindBy(xpath="//*[@id=\"q_if_then_explain_05\"]")
	private WebElement advisoryBoardsSeriesExplain;
	
	@FindBy(xpath="//*[@id=\"q_any_ad_boards_series-no\"]")
	private WebElement advisoryBoardsSeriesNo;
	
	@FindBy(xpath="//*[@id=\"q_advisory_boards_joint_events-yes\"]")
	private WebElement advisoryBoardsJointYes;
	
	@FindBy(xpath="//*[@id=\"q_if_then_explain_06\"]")
	private WebElement advisoryBoardsJointExplain;
	
	@FindBy(xpath="//*[@id=\"q_advisory_boards_joint_events-no\"]")
	private WebElement advisoryBoardsJointNo;
	
	@FindBy(xpath="//*[@id=\"q_estimated_number_of_required_hcps\"]")
	private WebElement estimatedNumber;
	
	@FindBy(xpath="(//div[@class='ant-select-selection-overflow'])[5]")
	private WebElement targetHcp;
	
	@FindBy(xpath="//*[@id=\"q_additional_information_upload\"]")
	private WebElement additionalInformation;
	
	@FindBy(xpath="(//button[@class='lex-button lex-button--secondary lex-button--rounded lex-file-upload__btn'])[2]")
	private WebElement addFile;
	
	@FindBy(xpath="//button[@class='lex-button lex-button--primary lex-button--rounded']")
	private WebElement submitRequest;
	
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[9]")
	private WebElement approver1;
	
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[10]")
	private WebElement approver2;
	
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[11]")
	private WebElement approver3;
	
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[12]")
	private WebElement approver4;
	
	@FindBy(xpath="(//button[@class='lex-button lex-button--primary lex-button--rounded'])[2]")
	private WebElement confirm;
	
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
	
	public ANA_Request(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement tileName() {
		return requestName;
	}
	
	public WebElement calendar() {
		return calendarYear;
	}
	
	public void businessOwner(String drop) {
		businessOwner.click();
	    List <WebElement> drop_bo = businessOwner.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
	//   We can also do by indexing as below	
	//    drop_bo.get(index).click();
		 for (int i = 0; i < drop_bo.size(); i++) {
		        if (drop_bo.get(i).getText().equalsIgnoreCase(drop)) {
		        	drop_bo.get(i).click();
		            return;
		        }
		 }
		
	}
	
	public void AanCategory(String anacat) {
		anaCategory.click();
		List <WebElement> drop_ac = anaCategory.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div/div"));
		 for (int i = 0; i < drop_ac.size(); i++) {
		        if (drop_ac.get(i).getText().equalsIgnoreCase(anacat)) {
		        	drop_ac.get(i).click();
		            return;
		        }
		 }
	}
	
	public void TherapeuticArea(String therapeautic) {
		therapeuticArea.click();
		List <WebElement> drop_ta = therapeuticArea.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		for (int i = 0; i < drop_ta.size(); i++) {
	        if (drop_ta.get(i).getText().equalsIgnoreCase(therapeautic)) {
	        	drop_ta.get(i).click();
	            return;
	        }
	     }
	}
	
	
	public void FunctionalArea(String functioanl) {
		functionalArea.click();
		List <WebElement> drop_fa = functionalArea.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		for (int i = 0; i < drop_fa.size(); i++) {
	        if (drop_fa.get(i).getText().equalsIgnoreCase(functioanl)) {
	        	drop_fa.get(i).click();
	            return;
	        }
	     }
	}
	
	public void ProductRelates(String product) {
		productReleates.click();
		List <WebElement> drop_pr = productReleates.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		for (int i = 0; i < drop_pr.size(); i++) {
	        if (drop_pr.get(i).getText().equalsIgnoreCase(product)) {
	        	drop_pr.get(i).click();
	            return;
	        }
	     }
	}
	
	public void DiseaseState(String disease) {
		diseaseState.click();
		List <WebElement> drop_ds = businessOwner.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		for (int i = 0; i < drop_ds.size(); i++) {
	        if (drop_ds.get(i).getText().equalsIgnoreCase(disease)) {
	        	drop_ds.get(i).click();
	            return;
	        }
	     }
	}
	
	public WebElement UtBusinessOwner() {
		return utBusinessOwner;
	}
	
	public WebElement UtBudgetOwner() {
		return utBudgetOwner;
	}
	
	public void Vendor(String vendor_data) {
		vendor.click();
		List <WebElement> drop_ve = businessOwner.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		for (int i = 0; i < drop_ve.size(); i++) {
	        if (drop_ve.get(i).getText().equalsIgnoreCase(vendor_data)) {
	        	drop_ve.get(i).click();
	            return;
	        }
	     }
	}
	
	public WebElement VendorContact() {
		return vendorContact;
	}
	
	public void  VendorHCP() {
		boolean select = vendorHcpYes.isSelected();
		// performing click operation if element is not already selected
		if (select == false) {
			 vendorHcpYes.click();
		}
		
	}
	
	public WebElement VendorNote() {
		return vendorNotes;
	}
	
	public WebElement BusinessNeed() {
		return businessNeedForAdvisoryBoards;
	}
	
	public void attachActivityPlan() throws IOException, InterruptedException {
		attachFullActivityPlan.click();	
		Thread.sleep(5000);
		uploadFile("G:\\Lextegrity\\Files\\kb.pdf");
		Thread.sleep(5000);
		
	}
	
	
	public WebElement TitlesDates() {
		return titlesDatesAndTopics;
	}
	
	public WebElement ProjectedLive() {
		return projectedNumberOfLive;
	}
	
	public WebElement ProjectedVirtual() {
		return projectedNumberOfVirtual;
	}
	
	public void advisoryboardsSeries() {
		boolean select = advisoryBoardsSeriesNo.isSelected();
		if (select == false) {
			advisoryBoardsSeriesNo.click();
		}
	}
	
	public void advisoryboardsjoint() {
		boolean select = advisoryBoardsJointNo.isSelected();
		if (select == false) {
			advisoryBoardsJointNo.click();
		}
	}
	
	public WebElement EstimatedNumberOfHCP() {
		return estimatedNumber;
	}
	
	public void TargetHCPSpecialties(String drop_tr) {
		targetHcp.click();
		List <WebElement> drop_th = targetHcp.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		for (int i = 0; i < drop_th.size(); i++) {
	        if (drop_th.get(i).getText().equalsIgnoreCase(drop_tr)) {
	        	drop_th.get(i).click();
	            return;
	        }
	     }
	}
	
	public WebElement anyAdditionalInformation() {
		return additionalInformation;
	}
	
	public void uploadFile() throws IOException, InterruptedException {
		addFile.click();
		Thread.sleep(5000);
		uploadFile("G:\\Lextegrity\\Files\\kb.pdf");
		Thread.sleep(5000);
		
	}
	
	public WebElement SubmitRequest() throws InterruptedException {
		Thread.sleep(4000);
		return submitRequest;
	}
	
	
	public void Requestor() throws InterruptedException {
		approver1.click();
	//	List <WebElement> req = approver1.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
	//	  int count = req.size();
		  Thread.sleep(2000);
		  approver1.sendKeys("Akshay");
    	  Thread.sleep(2000);
    	  approver1.sendKeys(Keys.DOWN);
    	  Thread.sleep(2000);
    	  approver1.sendKeys(Keys.ENTER);
    	  Thread.sleep(2000);
	}
	
	public void business_Owner() throws InterruptedException {
		approver2.click();
	//	List <WebElement> bow = approver2.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		 Thread.sleep(2000);
		 approver2.sendKeys("Akshay");
		 Thread.sleep(2000);
		 approver2.sendKeys(Keys.DOWN);
		 Thread.sleep(2000);
		 approver2.sendKeys(Keys.ENTER);
		 Thread.sleep(2000); 
	}
	
	public void initial_Compliance() throws InterruptedException {
		approver3.click();
	//	List <WebElement> ic = approver3.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		Thread.sleep(2000);
		approver3.sendKeys("Akshay");
   	  	Thread.sleep(2000);
   	  	approver3.sendKeys(Keys.DOWN);
   	  	Thread.sleep(2000);
   	  	approver3.sendKeys(Keys.ENTER);
   	  	Thread.sleep(2000);
		
	}
	
	public void final_Compliance() throws InterruptedException {
		approver4.click();
//		List <WebElement> fc = approver4.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		Thread.sleep(2000);
		approver4.sendKeys("Akshay");
  	  	Thread.sleep(2000);
  	  	approver4.sendKeys(Keys.DOWN);
  	  	Thread.sleep(2000);
  	  	approver4.sendKeys(Keys.ENTER);
  	  	Thread.sleep(2000);
	}
	
	public WebElement request_confirm() {
		return confirm;
	} 
	
}
