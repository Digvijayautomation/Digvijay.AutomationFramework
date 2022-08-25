package com.driver;

import org.openqa.selenium.WebDriver;

public final class driver_manager {
	
	
	//Using ThreadLocal For thread safety
	
		public static  ThreadLocal<WebDriver> dr=new ThreadLocal<WebDriver>(); 
		
		public static WebDriver getDriver() {
			
			return dr.get();
		}
		
		public static void setDriver(WebDriver driverref) {
			dr.set(driverref);
		}
		
		public static void unload() {
			dr.remove();
		}
		
		
	
		

}
