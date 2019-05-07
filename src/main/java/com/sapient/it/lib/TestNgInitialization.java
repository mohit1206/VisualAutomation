//package com.sapient.it.lib;
//
//import java.io.File;
//import java.io.FileReader;
//import java.lang.reflect.Method;
//import java.nio.file.Paths;
//import java.util.Iterator;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.Cookie;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
////import org.testng.ITestResult;
////import org.testng.annotations.AfterMethod;
////import org.testng.annotations.AfterSuite;
////import org.testng.annotations.BeforeMethod;
////import org.testng.annotations.BeforeSuite;
////import org.testng.xml.XmlTest;
//
//import com.applitools.eyes.RectangleSize;
//import com.applitools.eyes.selenium.Eyes;
//import com.applitools.eyes.selenium.StitchMode;
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.testautomationguru.ocular.Ocular;
//
//import au.com.bytecode.opencsv.CSVReader;
//
//public class TestNgInitialization implements AutomationConstants {
//	public ExtentTest testReport;
//	public WebDriver driver;
//	public Eyes eyes;
//	public static ExtentReports extent;
//	int count =0;
//	String[] str = null;
//	
//	
//	@BeforeSuite
//	public void initialSetUp()
//	{
//	/*	Ocular.config()
//	    .resultPath(Paths.get("c:/ocular/result"))
//	    .snapshotPath(Paths.get("c:/ocular/snpshot"))
//	    .globalSimilarity(100)
//	    .saveSnapshot(true);*/
//		
//		 String extentConfigFile=System.getProperty("user.dir")+"\\Resources\\Config.xml";
//		  extent=new ExtentReports(reportFilePath, true);
//		  extent.loadConfig(new File(extentConfigFile));  
//	}
//
//	@SuppressWarnings("deprecation")
//	@BeforeMethod
//	public void launchApp(Method method, XmlTest test) throws Exception {
//		
//		testReport = extent.startTest((this.getClass().getSimpleName() + "::"  +method.getName()),method.getName()); 
//		String browser = test.getParameter("browser");
//		if (browser.equalsIgnoreCase("GC")) {
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--disable-extensions");
//			options.addArguments("disable-infobars");
//			String key = "webdriver.chrome.driver";
//			System.setProperty(key, chromeDriverPath);
//			driver = new ChromeDriver(options);
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			setKeyForEyeCheck();
//			fullPageCapture();
//			OpenEyeCheck("JeepSuite", "WindowJeepSuite");
//			CSVReader reader = new CSVReader(new FileReader("./Resources/Feature.csv"));
//	           List<String[]> list=reader.readAll();
//	           System.out.println("Total rows which we have is "+list.size());
//	           Iterator<String[]> iterator= list.iterator();
//	           while(iterator.hasNext()){
//	                str=iterator.next();
//	          for(int i=0;i<str.length;i++) {
//	        	  count++;
//			driver.get(str[i]);
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//				eyeCheck("JeepBHPAndVLPPages"+count);
//	          }
//	           }
//				eyeClose();
//		}else if (browser.equalsIgnoreCase("IE")) {
//			 String Key = "webdriver.ie.driver";
//			 System.setProperty(Key, ieDriverPath);
//			 // Create the DesiredCapability object of InternetExplorer
//			 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//			 // Settings to Accept the SSL Certificate in the Capability object
//			 capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//			 capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
//			 driver = new InternetExplorerDriver(capabilities);
//			 driver.manage().window().maximize();
//			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			 setKeyForEyeCheck();
//			 driver.get(ReadPropertyFile.getPropertyValue("URL"));
//
//		} else if (browser.equalsIgnoreCase("FF")) {
//			String Key = "webdriver.gecko.driver";
//			 System.setProperty(Key, geckoDriverPath);
//			driver = new FirefoxDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			setKeyForEyeCheck();
//			driver.get(ReadPropertyFile.getPropertyValue("URL")); 
//		}
//	}
//
//	@AfterMethod
//	public void closeApp(Method method, XmlTest test, ITestResult result) {
//		 String browser = test.getParameter("browser");
//		 if(result.isSuccess()){
//			 System.out.println("pass");
//		 }else{
//			if(browser.equalsIgnoreCase("ff")||browser.equalsIgnoreCase("gc")||browser.equalsIgnoreCase("ie")){
////			BaseClass bClass = new BaseClass(driver, testReport);
////			bClass.getPageScreenShot();
//			System.out.println("Successfully captured a screenshot");
//			}
//		}
//		driver.quit();
//	}
//	  @AfterSuite
//	  public void afterSuite( XmlTest test){
//	  extent.flush();
//	  }
//	  
//	  
//	  public void setKeyForEyeCheck(){
//		// Initialize the eyes SDK and set your private API key.
//		eyes= new Eyes();
//		// Set the API key from the env variable. Please read the "Important Note"
//		eyes.setApiKey(ReadPropertyFile.getPropertyValue("APIKEY"));
//	  }
//	  
//	  public void OpenEyeCheck(String appName, String testName){
//		  eyes.open(driver, appName, testName, new RectangleSize(900, 600));
//	  }
//	  
//	  public void eyeCheck(String tag){
//		  eyes.checkWindow(tag);
//	  }
//	  
//	  public void eyeClose(){
//		  eyes.close();
//	  }
//	  
//	  public void abortEyes(){
//			// If the test was aborted before eyes.close was called, ends the test as
//			// aborted.
//		  eyes.abortIfNotClosed();
//	  }
//	  
//	  public void fullPageCapture(){
//			eyes.setForceFullPageScreenshot(true);
//			eyes.setStitchMode(StitchMode.CSS);
//	  }
//	 
//
//	}
