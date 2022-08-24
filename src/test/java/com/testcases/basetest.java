package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.driver.drivers_setup;

public class basetest {
	
	protected basetest() {} // Created protected constructor so that no can can create object of it
	
	

	@BeforeMethod
	public void setUp() {
		
		drivers_setup.Driver_Intalization();
		
	}

	@AfterMethod
	public void tearDown() {
		
		drivers_setup.Driver_Quit();
		
	}


}
