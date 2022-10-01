package com.driver;

import java.util.Objects;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utilities.ReadPropertyFileUsingOwnerLibray;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class drivers_setup {
	
	private drivers_setup() {} // Making private constructor so that no one create object of it
	
	
	public static void Driver_Intalization() throws Exception 
	{
		ReadPropertyFileUsingOwnerLibray config=ConfigFactory.create(ReadPropertyFileUsingOwnerLibray.class);// object of ReadPropertyFileUsingOwnerLibray for geeting the data from config.properties
		
		if(Objects.isNull(driver_manager.getDriver())) // if driver is null, then only initalize new driver
		{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();	
		
		// Setting the driver to threadlocals set method from driver_manager class
		driver_manager.setDriver(driver); 
		
		// Setting the driver to threadlocals get method from driver_manager class
		driver_manager.getDriver().get(config.link()); // Getting URL from config.properties file using ReadPropertyFile
		driver_manager.getDriver().manage().window().maximize();
		}

	}
	
	public static void Driver_Quit() {
		
		if(Objects.nonNull(driver_manager.getDriver())) //Check whether the driver is open and then close it
		
			{
			driver_manager.getDriver().quit();
			
			// Setting the driver to threadlocals Remove method from driver_manager class
			driver_manager.unload();
			}
			
		 
	}
	
	

}
