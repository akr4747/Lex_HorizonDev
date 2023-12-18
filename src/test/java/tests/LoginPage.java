package tests;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.Gateway;
import pageObjects.Login;
import testComponents.BaseClass;

public class LoginPage extends  BaseClass{
	
	  public WebDriver driver;
	  public static Logger log =LogManager.getLogger(BaseClass.class.getName());
	  
	  @BeforeTest 
	  public void initialize() throws IOException {
	 
		  driver=initializeDriver();
		  driver.get(prop.getProperty("url"));
	  }
	   
	@Test(dataProvider="login_getData")
	public void login(String name, String pwd, String msg) throws IOException, InterruptedException{
		
		// Now Creating object to that class and invoke methods of it.
		// Here we have pass driver as a argument so we need to create a constructer.

		Login lp=new Login(driver);
	//	WebDriverWait w=new WebDriverWait(driver,5);
	
	//if(actualURL.equalsIgnoreCase(expectedURL))
	// if(driver.getCurrentUrl().contains("gateway"))
	 try {	
		Gateway gw=new Gateway(driver);
		gw.userLogout().click();
		Thread.sleep(3000);	
		gw.logoutPopup().click();
		lp.differnetUser().click();
		Thread.sleep(3000);
		log.info(msg);
	//	System.out.println(msg);
		}
		catch (Exception e) {
			lp.enter_email().sendKeys(name);
			lp.enter_password().sendKeys(pwd);
			lp.click_signin().click();
			Thread.sleep(2000); 
			log.info(msg);
		//	System.out.println(msg);		
		}
	}	

	@AfterTest
    	public void closeWindow(){
		driver.quit();
	
    }  

	@DataProvider
	public Object[][] login_getData() {
		// Row stands for how many different data types test should run
		// Coloumn stands for how many values per each test
		// Array size is 2
		// 0,1
		Object[][] data=new Object[8][3];
		
		data[0][0]="akshay@lextegrity.com";
		data[0][1]="Lextegrity@12";
		data[0][2]="Incorrect password";
		
		data[1][0]="akshay@lextegrity.com";
		data[1][1]=" ";
		data[1][2]="Password cannot be empty";
		
		data[2][0]=" ";
		data[2][1]="Lextegrity@123";
		data[2][2]="email cannot be empty";
		
		data[3][0]="akshay@lextegrity.co";
		data[3][1]="Lextegrity@123";
		data[3][2]="Incorrect email";
		
		data[4][0]="akshay@lextegrity.com";
		data[4][1]="Lextegrity@123";
		data[4][2]="Akshay Login Sucessfully";
		
		data[5][0]=" ";
		data[5][1]=" ";
		data[5][2]="email and password cannot be empty";
		
		data[6][0]="richard@lextegrity.com";
		data[6][1]="Lextegrity1!";
		data[6][2]="Richard Login Sucessfully";
		
		data[7][0]="akshay@lextegrity.co";
		data[7][1]="Lextegrity@12";   
		data[7][2]="User enter both username and password incorrect";
	
			
		return data;
	}
}
