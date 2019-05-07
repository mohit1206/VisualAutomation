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
//public class BrandPage extends BaseClass{
//
//	public BrandPage(WebDriver driver, ExtentTest testReport) {
//		super(driver, testReport);
//		PageFactory.initElements(driver, this);
//	}
//	
//	@FindBy(xpath="(//a[text()='Body Color'])[1]")
//	private WebElement BodyColorLink;
//	
//	@FindBy(xpath="(//ul[@data-class-id='swatches-colors']/li)[2]")
//	private WebElement ColorCode;
//	
//	@FindBy(xpath="//span[contains(text(),'LB-FT OF TORQUE')]")
//	private WebElement performanceTab;
//	
//	@FindBy(xpath="(//a[contains(text(),'Design')])[1]")
//	private WebElement designTab;
//	
//	@FindBy(xpath="//input[@placeholder='Enter ZIP Code']")
//	private WebElement zipCodeTextBox;
//	
//	@FindBy(xpath="//input[@placeholder='Enter ZIP Code']/following-sibling::a")
//	private WebElement zipCodeSubmitBtn;
//	
//	@FindBy(xpath="//h3[text()='PLEASE ENTER YOUR ZIP CODE']")
//	private WebElement zipCodePopupText;
//	
//	public void verifycarColor() throws InterruptedException{
//		if(isVisible(zipCodePopupText)){
//			type(zipCodeTextBox, "33331");
//			click(zipCodeSubmitBtn);
//			Thread.sleep(2000);
//		}
//		click(designTab);
//		if(isVisible(BodyColorLink)){
//			System.out.println("car color visible");
//			Thread.sleep(2000);
//		}
//	}
//	
//	public void clickOnWhiteColor() throws InterruptedException{
//		click(ColorCode);
//		Thread.sleep(5000);
//	}
//
//}
