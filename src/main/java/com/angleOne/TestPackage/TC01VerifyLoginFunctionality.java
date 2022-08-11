package com.angleOne.TestPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.angleOne.POMPackage.LoginPOMClass;



public class TC01VerifyLoginFunctionality extends Test_BaseClass 
{
	
	@Test 
	public void loginFunctionality()
	{
		
       
       String expectedResult="Portfolio | Equity_New";
         
         String actualResult=driver.getTitle();
        
        Assert.assertEquals(actualResult, expectedResult);
	}
		 
	     
			  	
}	
	


