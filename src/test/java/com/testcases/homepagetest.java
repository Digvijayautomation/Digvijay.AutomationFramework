package com.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.driver.driver_manager;

public final class homepagetest extends basetest { //Making it as final so no one can extends it
	
	private homepagetest() {} // Created private constructor so that no can can create object of it
	
	
	@Test
	public void Signin_Click_Cart()
	{
		driver_manager.getDriver().findElement(By.xpath("//a[@rel='nofollow']")).click();
		driver_manager.getDriver().findElement(By.id("email")).sendKeys("dtikka6@gmail.com");
		driver_manager.getDriver().findElement(By.id("passwd")).sendKeys("test@123");
		driver_manager.getDriver().findElement(By.id("SubmitLogin")).click();	
		driver_manager.getDriver().findElement(By.xpath("//*[contains(@title,'View my shopping cart')]")).click();
		
	}

}
