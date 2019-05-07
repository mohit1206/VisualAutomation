//package com.sapient.it.Applitools;
//
//import org.testng.annotations.Test;
//
//import com.applitools.eyes.RectangleSize;
//import com.applitools.eyes.selenium.Eyes;
//import com.applitools.eyes.selenium.StitchMode;
//import com.applitools.eyes.selenium.fluent.Target;
//import com.sapient.it.lib.ReadPropertyFile;
//import com.sapient.it.lib.TestNgInitialization;
//
//public class FullPageScreenShot extends TestNgInitialization{
//	
//		@Test
//	public void CaptureFullPageScreenShot(){
///*		try{
//			eyes.setForceFullPageScreenshot(true);
////			System.out.println(eyes.getStitchMode());
//			eyes.setStitchMode(StitchMode.CSS);
////			eyes.setHideScrollbars(true);
//			OpenEyeCheck("alfaromeo4", "windowaAlfa3");
////			eyeCheck("homepagealfaromeo");
//			eyes.check("avvc", Target.window().fully().strict());
//		}catch(Exception e){
//			System.out.println(e);
//			eyeClose();
//		}finally {
//			abortEyes();
//		}
//*/			
//			
//			
//			Eyes eyes = new Eyes();
//			eyes.setApiKey(ReadPropertyFile.getPropertyValue("APIKEY"));
//			eyes.setForceFullPageScreenshot(true);
//			eyes.setStitchMode(StitchMode.CSS);
//			eyes.open(driver, "alfa", "test1", new RectangleSize(500, 600));//last parameter is your viewport size IF testing on a browser. Do not set if testing on a mobile devices.
//			eyes.checkWindow("alfa1");
//			eyes.check("alfa1", Target.window().fully());
//			eyes.close();
//			
//			
//	}
//	
//}
