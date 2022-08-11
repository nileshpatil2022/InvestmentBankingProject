package com.angleOne.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPOMClass 
{
	//declare webdriver
		private WebDriver driver;
		//username
		@FindBy(xpath="//a[text()='BUy']")
	     private WebElement buyButoon;
		
		public void clickBuyButton()
		{
			buyButoon.click();
		}
		
		//share quantity
		@FindBy(xpath="//input[@id='txtBuySellPopQuantity']")
		  private WebElement sharequantities;
		
		public void sendsharequantities()
		{
			sharequantities.clear();
			sharequantities.sendKeys("11");
		}
		
		
		//select intraday options
		@FindBy(xpath="(//span[text()='DELIVERY'])[1]")
		   private WebElement deliveryButton;
		
		public void clickDeliveryButton()
		{
			deliveryButton.click();
		}
		
		@FindBy(xpath="//span[text()='INTRADAY']")
		private WebElement intradaySelect;	
		
		public void selectIntraday()
		{
			intradaySelect.click();
		}
		
		@FindBy(xpath="//button[text()='Ok']")
		private WebElement popup;	
		
		public void clickPopUp()
		{
			popup.click();
		}
		
		
		
		
		public DashboardPOMClass(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}

}
