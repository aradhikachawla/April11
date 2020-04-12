package hybridFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class OpenAndClosebrowser {

	protected static WebDriver driver;
	
	@BeforeSuite
	public void openbrowser() throws Exception {

		
	//	FileInputStream file = new FileInputStream("/Users/chawla/eclipse-workspacenew/SalesforceSeleniumFramework/config.properties");
	//	Properties prop = new Properties();
	//	prop.load(file);
	//	String br=prop.getProperty("browser"); 
	//	if (br.equals("chrome")){		
			driver = new ChromeDriver();
			driver.manage().window().maximize();		
	//	}
	}
	
	@AfterSuite	
	public void closeBrowser() throws InterruptedException {	
	//	Thread.sleep(20000);
		//driver.quit();	
		}
		
}
	
	
	
	
	

