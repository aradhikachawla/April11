package hybridFramework;

import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
public class usecase_classic extends OpenAndClosebrowser {

	@Test
	public void scnario_use_case() throws InterruptedException {
		
		CommonFunctions.navigateUrl(ObjectRepository.SALESFORCE_URL);
		Thread.sleep(2000);
		CommonFunctions.enterInputXpath(ObjectRepository.LOGIN_USERNAME_TEXTBOX_BYXPATH, "aradhikachawla@cpq4ever.com");
		Thread.sleep(2000);
		CommonFunctions.enterInputXpath(ObjectRepository.LOGIN_USERNAME_PASSWORD_BYXPATH, "Ashish_123");
		Thread.sleep(2000);
		CommonFunctions.click_css(ObjectRepository.LOGIN_BUTTON_BYCSS);
		Thread.sleep(5000);
		CommonFunctions.navigateUrl(ObjectRepository.OBJECT_RECORD_URL_CLASSIC);
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@value='No Thanks']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@value='Send to Salesforce']")).click();		
		Thread.sleep(20000);
		//	CommonFunctions.click_name(ObjectRepository.BUTTON_SAVE_NAME);
		//	Thread.sleep(2000);
		//CommonFunctions.click_classname(ObjectRepository.TRIAL);
		driver.findElement(By.xpath("//input[contains(@value,' Edit ')]")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//input[contains(@name,'opp9')]")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//a[contains(@class,'calToday')]")).click();
		
		//driver.findElement(By.xpath("//td[contains(@text(),'27')]")).click();

		driver.findElement(By.xpath("//tr[6]//td[5]")).click();
		Thread.sleep(10000);

	//	driver.findElement(By.xpath("//input[contains(@name,'opp9')]")).sendKeys("04/24/2020");
	//	driver.findElement(By.xpath("//input[contains(@name,'opp9')]")).click();

	//	driver.findElement(By.xpath("//a[@class='datePicker-openIcon display']")).click();
        Thread.sleep(10000);
		System.out.println("almost done");
	//	driver.findElement(By.xpath("//button[@class='today slds-button slds-align_absolute-center slds-text-link']")).click();
        Thread.sleep(15000);    
		System.out.println("almost 2 done");
	//	driver.findElement(By.xpath("//a[@class='datePicker-openIcon display']")).click();
        Thread.sleep(15000);    
		System.out.println("almost 6 done");
		//driver.findElement(By.xpath("//div[@class='form-element']//input[contains(@class,'input')]")).click();
 //       driver.findElement(By.xpath("//span[@class='slds-day weekday DESKTOP uiDayInMonthCell--default'][contains(text(),'30')]")).click();
        System.out.println("done");
        Thread.sleep(5000); 
        //    driver.findElement(By.xpath("input[@class='slds-input slds-combobox__input']")).click();
        // 	driver.findElement(By.xpath("//a[contains(text(),'Negotiation')]")).click();
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();",  driver.findElement(By.xpath("//div[@class='slds-truncate']")) );
     //   ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@class='slds-input slds-combobox__input']")));	   
		//driver.findElement(By.xpath("//a[contains(text(),'Negotiation')]")).click();
		//	CommonFunctions.click_xpath(ObjectRepository.RECORD_EDIT_XPATH);		
       // driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']//span[contains(@class,'label bBody')]")).click();
    //    driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
      
        driver.findElement(By.xpath("//input[@value=' Save ']")).click();
        System.out.println("all done");
      //button[contains(text(),'Save')]
	}
	
}
