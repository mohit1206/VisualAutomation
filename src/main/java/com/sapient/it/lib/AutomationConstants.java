package com.sapient.it.lib;

import com.relevantcodes.extentreports.ExtentReports;

public interface AutomationConstants {
	
	public static final String imageFolderPath="./ScreenShots";
	public static final String reportFilePath="./Report/results.html";
	public static final String configPptPath="./Resources/config.properties";
	public static final String chromeDriverPath="./Driver/chromedriver.exe";
	public static final String geckoDriverPath="./Driver/geckodriver.exe";
	public static final String ieDriverPath="./Driver/IEDriverServer.exe";
	public static  final String  CsvFolderPath="./csv";
	public static  final ExtentReports eReport=new ExtentReports(reportFilePath);
	

}
