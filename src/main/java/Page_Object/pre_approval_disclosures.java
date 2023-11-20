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
	private WebElement annual_needs_assessment;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[2]")
	private WebElement provide_a_gift_travel_or_hospitality;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[3]")
	private WebElement disclose_the_receipt_of_a_gift_travel_or_hospitality;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[7]")
	private WebElement disclose_a_potential_conflict;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[4]")
	private WebElement engage_a_go_hcp_or_patient;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[5]")
	private WebElement market_research;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[6]")
	private WebElement provide_external_funding;
	
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
	
	public WebElement annual_need_assessment() {
		return annual_needs_assessment;
	}
	

	public WebElement provide_a_gift_travel_or_hospitality() {
		return provide_a_gift_travel_or_hospitality;
	}
	
	
	public WebElement disclose_the_receipt_of_a_gift_travel_or_hospitality() {
		return disclose_the_receipt_of_a_gift_travel_or_hospitality;
	}
	
	public WebElement disclose_potential_conflict() {
		return disclose_a_potential_conflict;
	}
	
	public WebElement engage_go_hcp_or_patient() {
		return engage_a_go_hcp_or_patient;
	}
	

	public WebElement provide_external_fundings(){
		return provide_external_funding;
	}
	
	public WebElement submission() {
		return submissions;
	}
	
	public WebElement approval() {
		return approvals;
	}

	
}
