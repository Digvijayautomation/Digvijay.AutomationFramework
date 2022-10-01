package com.constants;

public final class framework_constants {  //Making it as final so no one can extends it
	
	private framework_constants() {} // Created protected constructor so that no can can create object of it
	
	

	private static String CONFIGPATH=System.getProperty("user.dir")+ "/src/test/resources/configurations/config.properties";

	public static String getConfigpath() {
		return CONFIGPATH;
	}

}
