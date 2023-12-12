package pageObjects;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;
	
	@FindBy(xpath="(//input[@name='username'])[2]")
	private WebElement email;
	
	@FindBy(xpath="(//input[@name='password'])[2]")
	private WebElement password;

	@FindBy(xpath="(//input[@name='signInSubmitButton'])[2]")
	private WebElement sign_in;
	
	@FindBy(linkText="Sign in as a different user?")
	private WebElement signInDiffernetUser;
	
	@FindBy(xpath="(//p[@class='errorMessage-customizable'])[2]")
	private WebElement loginError;

	
	public Login(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement enter_email() {
		return email;
	}
	
	public WebElement enter_password() {
		return password;
	}
	
	public WebElement click_signin() {
		return sign_in;
	}
	
	public WebElement differnetUser() {
		return signInDiffernetUser;
	}
	
	public WebElement loginErrorMsg() {
		return loginError;
	}
	
}
