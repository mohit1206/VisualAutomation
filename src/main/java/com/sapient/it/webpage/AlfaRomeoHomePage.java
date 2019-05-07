/*package com.sapient.it.webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.sapient.it.lib.BaseClass;
import com.testautomationguru.ocular.Ocular;
import com.testautomationguru.ocular.comparator.OcularResult;
import com.testautomationguru.ocular.snapshot.Snap;

@Snap("AlfaRomeoHome.png")
public class AlfaRomeoHomePage extends BaseClass{
	
	public AlfaRomeoHomePage(WebDriver driver, ExtentTest testReport) {
		super(driver, testReport);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[contains(text(),'Vehicles')])[1]")
	private WebElement VehicleBtn;
	
	@FindBy(xpath="//h3[text()='Quadrifoglio']")
	private WebElement QuadrifoglioBtn;
	
	@FindBy(xpath="//h3[text()='Stelvio']")
	private WebElement stelvioBtn;
	
	@FindBy(xpath="(//span[text()='2019 STELVIO'])[1]")
	private WebElement BannerTxt;
	
	@FindBy(xpath="//span[contains(text(),'Build & Price')]")
	private WebElement BuildAndPriceBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter ZIP Code']")
	private WebElement zipCodeTextBox;
	
	@FindBy(xpath="//input[@placeholder='Enter ZIP Code']/following-sibling::a")
	private WebElement zipCodeSubmitBtn;
	
	@FindBy(xpath="//h3[text()='PLEASE ENTER YOUR ZIP CODE']")
	private WebElement zipCodePopupText;
	
	
	
	
	
	public void NavigatetoQuadrifoglioPage(){
		click(VehicleBtn);
		click(QuadrifoglioBtn);
		waitForPageToLoad();
	}
	
	public void NavigateToStelvioPage(){
		click(VehicleBtn);
		click(stelvioBtn);
		if(isVisible(BannerTxt)){
			System.out.println("at stelvio page");
		}
	}
	
	public void navigateToBuildPricePage() throws InterruptedException{
		click(BuildAndPriceBtn);
		waitForPageToLoad();
		if(isVisible(zipCodePopupText)){
			type(zipCodeTextBox, "33331");
			click(zipCodeSubmitBtn);
			Thread.sleep(2000);
		}
	}
	
	public OcularResult compare() {
        return Ocular.snapshot().from(this)     
                     .sample().using(driver)    
                     .compare();                
    }

}
*/