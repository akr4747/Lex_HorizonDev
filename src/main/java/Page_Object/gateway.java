package Page_Object;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gateway {

	public WebDriver driver;

//	By pre_approval_disclosures=By.xpath("(//span[@class='lex-tile__label'])[1]");
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[1]")
	private WebElement pre_approval_disclosures;
	
	
	@FindBy(xpath="(//span[@class='lex-tile__label'])[2]")
	private WebElement third_party_due_deligence;
	
	@FindBy(xpath="(//span[@class='lex-image-button__label'])[7]")
	private WebElement logout;
	
	@FindBy(xpath="//button[@class='lex-button lex-button--primary lex-button--rounded']")
	private WebElement logout_confirm;

	
	  public gateway(WebDriver driver) { 
		  this.driver= driver; 
		  PageFactory.initElements(driver,this);
		  }
	 

	public WebElement pre_approval_dis() throws IOException {
		
		return pre_approval_disclosures;
		//	return driver.findElement(pre_approval_disclosures);
	}
	
	public WebElement third_party_due_del() {
		return third_party_due_deligence;	
	}
	
	public WebElement userLogout() {
		return logout;
	}
	
	public WebElement logoutPopup() {
		return logout_confirm;
	}
}
