package com.testcases;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.driver.driver_manager;


public final class logintest extends basetest { //Making it as final so no one can extends it
	
	private logintest(){} // Created private constructor so that no can can create object of it

	
	@Test
	public void Signin()
	{	

		driver_manager.getDriver().findElement(By.xpath("//a[@rel='nofollow']")).click();
		driver_manager.getDriver().findElement(By.id("email")).sendKeys("dtikka6@gmail.com");
		driver_manager.getDriver().findElement(By.id("passwd")).sendKeys("test@123");
		driver_manager.getDriver().findElement(By.id("SubmitLogin")).click();		
	}
	
	
	@Test
	public void Signout()
	{	

		driver_manager.getDriver().findElement(By.xpath("//a[@rel='nofollow']")).click();
		driver_manager.getDriver().findElement(By.id("email")).sendKeys("dtikka6@gmail.com");
		driver_manager.getDriver().findElement(By.id("passwd")).sendKeys("test@123");
		driver_manager.getDriver().findElement(By.id("SubmitLogin")).click();	
		driver_manager.getDriver().findElement(By.xpath("//*[contains(@title,'Log me out')]")).click();
		
	}
	
	
	
	
	

}


