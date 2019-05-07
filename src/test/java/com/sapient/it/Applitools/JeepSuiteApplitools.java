package com.sapient.it.Applitools;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.StitchMode;

import au.com.bytecode.opencsv.CSVReader;

public class JeepSuiteApplitools {
	Eyes eyes;
	int count =0;
	String[] str = null;
	@Test
	public void suite() throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		CSVReader reader = new CSVReader(new FileReader("./Resources/Feature.csv"));
         List<String[]> list=reader.readAll();
         System.out.println("Total rows which we have is "+list.size());
         Iterator<String[]> iterator= list.iterator();
         Eyes eyes= new Eyes();
         eyes.setApiKey("a39B91bM19NMvdkaWFMecVDbotqn110HR1P6nP8P8amOc110");
         eyes.setForceFullPageScreenshot(true);
 		 eyes.setStitchMode(StitchMode.CSS);
   	   	 eyes.open(driver, "jeepusa4","windowJeepSuite4", new RectangleSize(900, 600));
        while(iterator.hasNext()){
              str=iterator.next();
        for(int i=0;i<str.length;i++) {
      	  count++;
      	  driver.get(str[i]);
      	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      	  Thread.sleep(2000);
      	  try{
      	  if(driver.findElement(By.xpath("//a[@data-lid='go-to-jeep-us']")).isDisplayed()){
      		driver.findElement(By.xpath("//a[@data-lid='go-to-jeep-us']")).click();
      		Thread.sleep(2000);
      	  }
      	  }catch(Exception e){
      	  }
      	  eyes.checkWindow("jeepBHPVLPPageSuite"+count);
        }
        }
        try{
      	  eyes.close();
          } catch(Exception e){
    	  eyes.abortIfNotClosed();
          }
      driver.close();
    	System.exit(0);

	}
        
}
