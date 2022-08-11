package com.angleOne.TestPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.angleOne.POMPackage.LoginPOMClass;
import com.angleOne.POMPackage.PortfolioPOMClass;



public class TC02VerifyDashBoardTabClickable extends Test_BaseClass
{
	
	@Test
	public void dashBoardClick()
	{
		
        
       
         
         PortfolioPOMClass pp=new PortfolioPOMClass(driver);
         pp.clickDashboardTab();
         
         
         String ExpectedResult="Equity Summary";
         
         String ActualResult=pp.getTextFromDashboard();
         Assert.assertEquals(ActualResult, ExpectedResult);
         
        
	}

}
