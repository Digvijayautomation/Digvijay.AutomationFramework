package com.testcases;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class logintest {
		
		@Test
		public void test()
		{
			
			WebDriverManager.chromedriver().setup();
			
		}

}


