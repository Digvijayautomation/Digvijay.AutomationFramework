package com.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drivers_setup {
	
	public static WebDriver driver;
	
	public static void Driver_Intalization() 
	{
		
		if(Objects.isNull(driver)) // if driver is null, then only initalize new driver
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();	
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		}

	}
	
	
	public static void Driver_Quit() {
		
		if(Objects.nonNull(driver)) //Check whether the driver is open and then close it
		
			{
			driver.quit();
			driver=null;   //After quiting set driver to null to be sure
			}
			
		 
	}
	
	

}
