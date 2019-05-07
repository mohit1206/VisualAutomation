//package com.sapient.it.AXEAccessibility;
//
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import com.applitools.eyes.selenium.Eyes;
//import com.sapient.it.lib.TestNgInitialization;
//
//import au.com.bytecode.opencsv.CSVReader;
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.net.URL;
//import java.util.Iterator;
//import java.util.List;
//
//public class TestRunner extends TestNgInitialization {
//	Eyes eyes;
//	int count = 0;
//
//	private static final URL scriptUrl = TestRunner.class.getResource("/axe.min.js");
//
//	@Test
//	public void testAccessibility() throws IOException {
//		String[] str = null;
//		@SuppressWarnings("resource")
//		CSVReader reader = new CSVReader(new FileReader("./Resources/Feature.csv"));
//		List<String[]> list = reader.readAll();
//		System.out.println("Total rows which we have is " + list.size());
//		Iterator<String[]> iterator = list.iterator();
//		/*
//		 * eyes= new Eyes();
//		 * eyes.setApiKey("OdmV7ixiD6abqDMj54AdnpaVrsR4wel0IOfvtkdz5OE110");
//		 * eyes.open(driver, "fleetus","window");
//		 */
//		while (iterator.hasNext()) {
//			str = iterator.next();
//			for (int i = 0; i < str.length; i++) {
//				count++;
//				driver.get(str[i]);
//				eyes.checkWindow("window" + count);
//				JSONObject responseJSON = new AXE.Builder(driver, scriptUrl).options("axe.getRules(['wcag2aa']);")
//						.analyze();
//				JSONArray violations = responseJSON.getJSONArray("violations");
//
//				if (violations.length() == 0) {
//					Assert.assertTrue(true, "No violations found");
//				} else {
//					AXE.writeResults("testReport" + count, responseJSON);
//				}
//			}
//		}
//		try {
//			eyes.close();
//		} catch (Exception e) {
//			eyes.abortIfNotClosed();
//		}
//		System.exit(0);
//	}
//
//}