package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketResearch {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='request_name']")
	private WebElement requestName;
	
	@FindBy(xpath="//input[@id='q_business_owner']")
	private WebElement businessOwner;
	
	@FindBy(xpath="//input[@id='q_engagement_type']")
	private WebElement engagementType;
	
	@FindBy(xpath="(//div[@class='ant-select-selection-overflow'])[1]")
	private WebElement therapeuticArea;
	
	@FindBy(xpath="//input[@id='q_functional_area']")
	private WebElement functionalArea;
	
	@FindBy(xpath="(//div[@class='ant-select-selection-overflow'])[2]")
	private WebElement product;
	
	@FindBy(xpath="(//div[@class='ant-select-selection-overflow'])[3]")
	WebElement diseaseState;
	
	@FindBy(xpath="//input[@id='q_date_of_activity']")
	private WebElement approximateDate;
	
	@FindBy(xpath="(//div[@class='ant-select-selection-overflow'])[4]")
	private WebElement country; 
	

}
