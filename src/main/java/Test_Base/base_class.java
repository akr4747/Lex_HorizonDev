package Test_Base;
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
import io.github.bonigarcia.wdm.WebDriverManager;
public class base_class {
	
	public Properties prop;
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
		
		prop=new Properties();
		
		// FileInputStream is used to add the properties file.
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\TestArtifact_Automation\\src\\main\\java\\Config_Properties\\Config.properties");
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		// We never user "==" always user .equals.
		if(browserName.equals("chrome"))
		{
			System.getProperty("webdriver.chrome.driver","C://chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
	    
		
		// This timeout will apply in our all the test cases.
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	}
	
	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationFile=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}
	
}

