package com.angleOne.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 
{
	//declare webdriver
	private WebDriver driver;
	//username
	@FindBy(xpath="//input[@id='txtUserID']")
     private WebElement userIDTab;
	
	public void sendUserID()
	{
		userIDTab.sendKeys("N407241");
	}
	//password
	@FindBy(xpath="//input[@id='txtTradingPassword']")
    private WebElement passwordTab;
	
	public void sendPassword()
	{
		passwordTab.sendKeys("Test@2022");
	}
	
	//click on sign in button
	@FindBy(xpath="//a[@id='loginBtn']")
    private WebElement singInButton;
	
	public void clicksingInButton()
	{
		singInButton.click();
	}
	
	//popup
	@FindBy(xpath="//button[@id='tabclose']")
    private WebElement anglePopUp;
	
	public void closeanglePopUp()
	{
		anglePopUp.click();	
	}
	
	
	public LoginPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
