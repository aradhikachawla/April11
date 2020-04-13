package hybridFramework;

import org.openqa.selenium.By;

public class ObjectRepository {

	//URLs
	public static final String SALESFORCE_URL = "https://login.salesforce.com/" ; 
	public static final String OBJECT_RECORD_URL_LIGHTNING = "https://aradhikachawla-dev-ed.lightning.force.com/lightning/r/Opportunity/0064T000004pfYdQAI/view" ;
	public static final String OBJECT_RECORD_URL_CLASSIC = "https://aradhikachawla-dev-ed.my.salesforce.com/0064T000003y1XQ" ;
	
	//Login Page
	public static final String LOGIN_USERNAME_TEXTBOX_BYCSS = "#username";
	public static final String LOGIN_USERNAME_TEXTBOX_BYXPATH = "//input[@id='username']";
	public static final String LOGIN_USERNAME_PASSWORD_BYCSS = "#password";
	public static final String LOGIN_USERNAME_PASSWORD_BYXPATH = "//input[@id='password']";
	public static final String LOGIN_BUTTON_BYCSS = "#Login";

	//Opportunity page
	public static final String ALL_TABS_TAB_BYXPATH  = "//img[@class='allTabsArrow']";
	public static final String OPPORTUNITY_TAB_BYXPATH  = "//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]";
	public static final String POPUP_CLICK_1_BYXPATH  = "//input[@value='No Thanks']";
	public static final String POPUP_CLICK_2_BYXPATH  = "//input[@value='Send to Salesforce']";
	public static final String BUTTON_NEW_BYXPATH  = "//input[@name='new']";
	public static final String OPPORTUNITY_NAME_TEXTBOX_BYXPATH  = "//input[@id='opp3']";
	public static final String DATE_PICKER_BYXPATH  = "//input[@id='opp9']";
	public static final String DATE_SELECT_CLASSNAME = "todayDate";
	public static final String STAGE_SELECT_XPATH  = "//select[@id='opp11']";
	public static final String BUTTON_SAVE_NAME  = "save" ;	
	public static final String CLOSE_DATE_EDIT  = "//force-record-layout-row[3]//slot[1]//force-record-layout-item[2]//div[1]//div[1]//div[2]//button[1]" ;	
	public static final String CLOSE_DATE_NEWDATE = "//input[contains(@name,'CloseDate')]" ;	
	public static final String RECORD_DOWN_ARROW_XPATH = 		"//a[@class='slds-grid slds-grid--vertical-align-center slds-grid--align-center sldsButtonHeightFix']";
	public static final String RECORD_EDIT_XPATH = "//div[@class='branding-actions actionMenu popupTargetContainer uiPopupTarget uiMenuList forceActionsDropDownMenuList uiMenuList--left uiMenuList--default']//li[2]//a[1]";
	
	public static final String TRIAL = "slds-grid slds-grid--vertical-align-center slds-grid--align-center sldsButtonHeightFix";
			
	

	
}
