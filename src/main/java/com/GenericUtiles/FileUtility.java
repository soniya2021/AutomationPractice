package com.GenericUtiles;

import java.io.FileInputStream;
import java.util.Properties;



public class FileUtility {
	public String getPropertyKeyValue(String Key) throws Throwable {
		FileInputStream file=new FileInputStream(IPathConstant.PROPERTY_FILEPATH);
		Properties prop = new Properties();
		prop.load(file);
		return prop.getProperty(Key);
	}
	
	
	
	
	
	
	
}
