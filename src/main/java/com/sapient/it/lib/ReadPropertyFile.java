package com.sapient.it.lib;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile implements AutomationConstants {
public static String getPropertyValue(String key)
	
	{
	  String filePath=configPptPath;
	
		String value="";
		Properties ppt = new Properties();
		try{
		ppt.load(new FileInputStream(filePath));
		value= ppt.getProperty(key);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}




}
