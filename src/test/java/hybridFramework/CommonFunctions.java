package hybridFramework;

import org.openqa.selenium.By;

public class CommonFunctions extends OpenAndClosebrowser {

	public static void navigateUrl(String url) throws InterruptedException {
		driver.get(url);
		Thread.sleep(2000);
		
	}
	
	public static void click_xpath(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
		
	}
	public static void click_css(String css) {
		driver.findElement(By.cssSelector(css)).click();
		
	}
	
	public static void enterInputXpath(String xpath , String data) {
		driver.findElement(By.xpath(xpath)).sendKeys(data);
		
	}
	
	public static void click_name(String name ) {
		driver.findElement(By.name(name)).click();
		
	}
	public static void click_classname(String classname ) {
		driver.findElement(By.className(classname)).click();
		
	}
	
}
