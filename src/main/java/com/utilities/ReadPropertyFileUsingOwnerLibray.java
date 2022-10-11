package com.utilities;

import org.aeonbits.owner.Config;


// Using Owner libaray dependecy we can read config properties files very easyly

             // value="File: path"
@Config.Sources(value="File:C:\\Users\\shrad\\.eclipse\\Digvijay.AutomationFramework\\src\\test\\resources\\configurations\\config.properties")

public interface ReadPropertyFileUsingOwnerLibray extends Config {  // config in imported from owner class
	
	
	String link();
	

	
	
	
	


}
