package com.utilities;

import java.io.FileInputStream;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFile {  //Making it as final so no one can extends it
	
	private ReadPropertyFile() {} // Created protected constructor so that no can can create object of it
	
	
	
	// Method to call data from config.properties file
	public static String getvalue(String key) throws Exception
	{
		String value="";
		Properties property=new Properties();
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/configurations/config.properties");
		 property.load(file);
		 value=property.getProperty(key);
		 
		if(Objects.isNull(value))
		{
			throw new Exception("Property Name" +key+"Is Not Found In Config.Properties");
		}
		return value;
		
	}

}