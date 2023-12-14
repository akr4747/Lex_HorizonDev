package testComponents;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Gateway;
import pageObjects.Login;
public class BaseClass {
	
	public Properties prop;
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
		
		prop=new Properties();
		
		// FileInputStream is used to add the properties file.
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\GlobalData.properties");
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		// We never user "==" always user .equals.
		if(browserName.equals("chrome"))
		{
			System.getProperty("webdriver.chrome.driver","C://chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C://geckodriver");
			driver = new FirefoxDriver();
			// Firefox
		} else if (browserName.equalsIgnoreCase("edge")) {
			// Edge
			System.setProperty("webdriver.edge.driver", "C://edge.exe");
			driver = new EdgeDriver();
		}
	    
		
		// This timeout will apply in our all the test cases.
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
	}
	
	public String getScreenshot(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
		
		
	}
	
	
	@BeforeMethod(alwaysRun=true)
	public void LandingPage() throws IOException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		Login lp = new Login(driver);
		String username = prop.getProperty("userName");
		String password = prop.getProperty("password");
		lp.enter_email().sendKeys(username);
		lp.enter_password().sendKeys(password);
		lp.click_signin().click();
		
	}
 
	
   @AfterMethod(alwaysRun=true)	
	public void tearDown()
	{
		driver.close();
	}
	
}

