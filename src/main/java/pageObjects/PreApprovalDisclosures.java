package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreApprovalDisclosures {

	public WebDriver driver;
	
//	By approval_request=By.xpath("//h1[@class='approvals-JJMhtPIrZqpQCyUUkbJ9']");
	By approval_request=By.xpath("//div[@class='main__top-heading']/h2");
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[1]")
	private WebElement annual_needs_assessment;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[6]")
	private WebElement provide_a_gift_travel_or_hospitality;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[8]")
	private WebElement disclose_the_receipt_of_a_gift_travel_or_hospitality;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[9]")
	private WebElement disclose_a_potential_conflict;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[4]")
	private WebElement engage_a_go_hcp_or_patient;
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[10]")
	private WebElement provide_external_funding;
	
	@FindBy(xpath="(//div[@class='ant-tabs-tab-btn'])[1]")
	private WebElement submissions;
	
	@FindBy(xpath="(//div[@class='ant-tabs-tab-btn'])[2]")
	private WebElement approvals;
	
	public PreApprovalDisclosures(WebDriver driver) {
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
	
	public WebElement provide_External_Funding() {
		return provide_external_funding;
	}
	
	public WebElement submission() {
		return submissions;
	}
	
	public WebElement approval() {
		return approvals;
	}

	
}