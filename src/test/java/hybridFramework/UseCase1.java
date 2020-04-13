package hybridFramework;

import org.testng.annotations.Test;
import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
public class UseCase1 extends OpenAndClosebrowser {

	@Test(priority=2)
	public void scnario_use_case() throws InterruptedException {
		
		CommonFunctions.navigateUrl(ObjectRepository.SALESFORCE_URL);
		Thread.sleep(2000);
		CommonFunctions.enterInputXpath(ObjectRepository.LOGIN_USERNAME_TEXTBOX_BYXPATH, "aradhikachawla@cpq4ever.com");
		Thread.sleep(2000);
		CommonFunctions.enterInputXpath(ObjectRepository.LOGIN_USERNAME_PASSWORD_BYXPATH, "Ashish_123");
		Thread.sleep(2000);
		CommonFunctions.click_css(ObjectRepository.LOGIN_BUTTON_BYCSS);
		Thread.sleep(5000);
		CommonFunctions.navigateUrl(ObjectRepository.OBJECT_RECORD_URL_LIGHTNING);
		Thread.sleep(20000);
		//	CommonFunctions.click_name(ObjectRepository.BUTTON_SAVE_NAME);
		//	Thread.sleep(2000);
		//CommonFunctions.click_classname(ObjectRepository.TRIAL);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@class='slds-grid slds-grid--vertical-align-center slds-grid--align-center sldsButtonHeightFix']")));
		Thread.sleep(12000);
		driver.findElement(By.xpath("//body/div/div/ul/li[2]/a[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='datePicker-openIcon display']")).click();
        Thread.sleep(10000);
		System.out.println("almost done");
		driver.findElement(By.xpath("//button[@class='today slds-button slds-align_absolute-center slds-text-link']")).click();
        Thread.sleep(15000);    
		System.out.println("almost 2 done");
		driver.findElement(By.xpath("//a[@class='datePicker-openIcon display']")).click();
        Thread.sleep(15000);    
		System.out.println("almost 6 done");
		//driver.findElement(By.xpath("//div[@class='form-element']//input[contains(@class,'input')]")).click();
        driver.findElement(By.xpath("//span[@class='slds-day weekday DESKTOP uiDayInMonthCell--default'][contains(text(),'30')]")).click();
        System.out.println("done");
        
        //    driver.findElement(By.xpath("input[@class='slds-input slds-combobox__input']")).click();
        // 	driver.findElement(By.xpath("//a[contains(text(),'Negotiation')]")).click();
  
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();",  driver.findElement(By.xpath("//div[@class='slds-truncate']")) );
        Thread.sleep(10000);    
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@class='slds-input slds-combobox__input']")));	   
        Thread.sleep(10000);    
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[contains(text(),'Negotiation')]")));
		//	CommonFunctions.click_xpath(ObjectRepository.RECORD_EDIT_XPATH);		
       // driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']//span[contains(@class,'label bBody')]")).click();
        Thread.sleep(10000);    

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",    driver.findElement(By.xpath("//button[3]//span[1]")));
        System.out.println("all done");
      //button[contains(text(),'Save')]
	}
	
}
