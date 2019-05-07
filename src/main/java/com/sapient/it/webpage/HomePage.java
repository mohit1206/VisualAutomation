//package com.sapient.it.webpage;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.relevantcodes.extentreports.ExtentTest;
//import com.sapient.it.lib.BaseClass;
//
//public class HomePage extends BaseClass{
//
//	public HomePage(WebDriver driver, ExtentTest testReport) {
//		super(driver, testReport);
//		PageFactory.initElements(driver, this);
//	}
//	
//	
//	@FindBy(xpath="//h1[text()='Choose your site']")
//	private WebElement popupTxt;
//	
//	@FindBy(xpath="(//button[@class='cllc-modal-button'])[1]")
//	private WebElement closeBtn;
//	
//	@FindBy(name="pw")
//	private WebElement passwordTxtBox;
//	
//	@FindBy(name="button")
//	private WebElement goBtn;
//	
//	public void popupClose(){
//			jsClick(closeBtn);
//	}
//	
//	public void testAccess(){
//		type(passwordTxtBox, "shoe2");
//		click(goBtn);
//		driver.get("https://test.chrysler.com");
//		waitForPageToLoad();
//	}
//}
