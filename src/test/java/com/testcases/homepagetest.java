package com.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.driver.drivers_setup;

public final class homepagetest extends basetest { //Making it as final so no one can extends it
	
	private homepagetest() {} // Created private constructor so that no can can create object of it
	
	
	@Test
	public void Signin_Click_Cart()
	{	

		drivers_setup.driver.findElement(By.xpath("//a[@rel='nofollow']")).click();
		drivers_setup.driver.findElement(By.id("email")).sendKeys("dtikka6@gmail.com");
		drivers_setup.driver.findElement(By.id("passwd")).sendKeys("test@123");
		drivers_setup.driver.findElement(By.id("SubmitLogin")).click();	
		drivers_setup.driver.findElement(By.xpath("//*[contains(@title,'View my shopping cart')]")).click();
		
	}

}
