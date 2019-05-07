//package com.sapient.it.Applitools;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//
//import com.sapient.it.lib.TestNgInitialization;
////import com.sapient.it.webpage.AlfaRomeoHomePage;
////import com.sapient.it.webpage.BrandPage;
////import com.sapient.it.webpage.HomePage;
//import com.testautomationguru.ocular.comparator.OcularResult;
//
//import io.percy.selenium.Percy;
//
//public class AlfaRomeoApplitools extends TestNgInitialization{
//	
///*	@Test
//	public void verifyHomePage(){
//		try{
//		fullPageCapture();
//		OpenEyeCheck("alfaromeo10", "windowaAlfa10");
//		List<WebElement> webList = driver.findElements(By.xpath("//ul[contains(@class,'meatball-container')]/li"));
//		for(int i=0; i<webList.size(); i++) {
//			webList.get(i).click();
//			eyeCheck("HomePage"+i);
//			if(i==3){
//			break;
//			}
//		}
//		eyeClose();
//		} catch(Exception e){
//			e.printStackTrace();
//		} finally {
//			abortEyes();
//		}
//	}
//	
//	@Test
//	public void verifyQuadrifoglioImage(){
//		try{
//		AlfaRomeoHomePage arPage = new AlfaRomeoHomePage(driver, testReport);
//		arPage.NavigatetoQuadrifoglioPage();
//		fullPageCapture();
//		OpenEyeCheck("alfaromeo11", "windowaAlfa11");
//		eyeCheck("QuadrifoglioPage");
//		eyeClose();
//		} catch(Exception e){
//			e.printStackTrace();
//		}finally {
//			abortEyes();
//		}
//
//	}
//	
//	@Test
//	public void verifyCarColor1(){
//		
//		try{
//			AlfaRomeoHomePage arPage = new AlfaRomeoHomePage(driver, testReport);
//			arPage.NavigateToStelvioPage();
//			BrandPage bPage = new BrandPage(driver, testReport);
//			bPage.verifycarColor();
//			fullPageCapture();
//			OpenEyeCheck("alfaromeo12", "windowaAlfa12");
//			eyeCheck("StelvioPage");
//			eyeClose();
//		} catch(Exception e){
//			e.printStackTrace();
//		}finally {
//			abortEyes();
//		}
//		
//	}
//	
//	@Test
//	public void verifyCarColor2(){
//		
//		try{
//			AlfaRomeoHomePage arPage = new AlfaRomeoHomePage(driver, testReport);
//			arPage.NavigateToStelvioPage();
//			BrandPage bPage = new BrandPage(driver, testReport);
//			bPage.verifycarColor();
//			bPage.clickOnWhiteColor();
//			fullPageCapture();
//			OpenEyeCheck("alfaromeo12", "windowaAlfa12");
//			eyeCheck("StelvioPage");
//			eyeClose();
//		} catch(Exception e){
//			e.printStackTrace();
//		}finally {
//			abortEyes();
//		}
//		
//	}
//	
//	@Test
//	public void verifyPriceChanges(){
//		try{
//			AlfaRomeoHomePage arPage = new AlfaRomeoHomePage(driver, testReport);
//			arPage.navigateToBuildPricePage();
//			fullPageCapture();
//			OpenEyeCheck("alfaromeo21", "windowaAlfa21");
//			eyeCheck("BuildAndPricePage");
//			eyeClose();
//		} catch(Exception e){
//			e.printStackTrace();
//		}finally {
//			abortEyes();
//		}
//	}
//	
//	@Test
//	public void chryslerProd(){
//		try{
//			HomePage hp = new HomePage(driver, testReport);
//			hp.popupClose();
//			Thread.sleep(1000);
//			fullPageCapture();
//			OpenEyeCheck("chrysler2", "windowaChrysler2");
//			eyeCheck("HomePage");
//			eyeClose();
//		} catch(Exception e){
//			e.printStackTrace();
//		}finally {
//			abortEyes();
//		}
//		
//	}
//*/
//	
///*	@Test
//	public void chryslerTest(){
//		try{
//		HomePage hp = new HomePage(driver, testReport);
//		hp.testAccess();
//		Thread.sleep(1000);
//		hp.popupClose();
//		Thread.sleep(1000);
//		fullPageCapture();
//		OpenEyeCheck("chrysler2", "windowaChrysler2");
//		eyeCheck("HomePage");
//		eyeClose();
//	} catch(Exception e){
//		e.printStackTrace();
//	}finally {
//		abortEyes();
//	}
//	}*/
//	
//	/*@Test
//	public void chryslerProd1(){
//		try{
//			HomePage hp = new HomePage(driver, testReport);
//			hp.popupClose();
//			Thread.sleep(1000);
//			OpenEyeCheck("chrysler3", "windowaChrysler3");
//			eyeCheck("HomePage");
//			eyeClose();
//		} catch(Exception e){
//			e.printStackTrace();
//		}finally {
//			abortEyes();
//		}
//		
//	}
//
//	
//	@Test
//	public void chryslerTest1(){
//		try{
//		HomePage hp = new HomePage(driver, testReport);
//		hp.testAccess();
//		Thread.sleep(1000);
//		hp.popupClose();
//		Thread.sleep(1000);
//		OpenEyeCheck("chrysler3", "windowaChrysler3");
//		eyeCheck("HomePage");
//		eyeClose();
//	} catch(Exception e){
//		e.printStackTrace();
//	}finally {
//		abortEyes();
//	}
//	}*/
//	
///*	@Test
//	public void ocularTest(){
//		AlfaRomeoHomePage ahp = new AlfaRomeoHomePage(driver, testReport);
//		OcularResult result = ahp.compare();
//		
//		System.out.println(result.isEqualsImages()); // true or false
//		System.out.println(result.getSimilarity()); // % of pixels match
//		System.out.println(result.getDiffImage());  // BufferedImage differences highlighted
//		System.out.println(result.getEqualPixels()); // number of pixels matched
//		System.out.println(result.getTotalPixels()); // total number of pixels
//	}
//	*/
//	
//	@Test
//	public void jeepSuite(){
//	System.out.println("suite done");
//	}
//}
