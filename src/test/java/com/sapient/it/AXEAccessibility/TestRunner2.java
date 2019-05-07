package com.sapient.it.AXEAccessibility;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.applitools.eyes.selenium.Eyes;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class TestRunner2 {
	WebDriver driver;
	int count =0;

	private static final URL scriptUrl = TestRunner2.class.getResource("/axe.min.js");

	/**
	 * Instantiate the WebDriver and navigate to the test site
	 */
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	/**
	 * Ensure we close the WebDriver after finishing
	 */
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	/**
	 * Basic test
	 * @throws IOException 
	 */
	@Test
	public void testAccessibility() throws IOException {
		 String[] str = null;
          @SuppressWarnings("resource")
		CSVReader reader = new CSVReader(new FileReader("./Resources/Feature.csv"));
           List<String[]> list=reader.readAll();
           System.out.println("Total rows which we have is "+list.size());
           Iterator<String[]> iterator= list.iterator();
          while(iterator.hasNext()){
                str=iterator.next();
          for(int i=0;i<str.length;i++) {
        	  count++;
        	  driver.get(str[i]);
      		JSONObject responseJSON = new AXE.Builder(driver, scriptUrl).options("axe.getRules(['wcag2aa']);").analyze();
      		JSONArray violations = responseJSON.getJSONArray("violations");

      		if (violations.length() == 0) {
      			Assert.assertTrue(true, "No violations found");
      		} else {
      			AXE.writeResults("testReport"+count, responseJSON);
      		}         
      	}
        }
	}

}