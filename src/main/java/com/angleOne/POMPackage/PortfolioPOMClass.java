package com.angleOne.POMPackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortfolioPOMClass 
{
	
	private WebDriver driver;
	
	@FindBy(xpath="//i[@class='icon-search']")
	private WebElement searchButton;
	
	public void clickOnSearchButton()
	{
		searchButton.click();
	}
	
	@FindBy(xpath="//input[@id='DashboardsearchControl']")
	  private WebElement enterText;
	
	public void sendKeyEnterText()
	{
		enterText.sendKeys("Yes Bank"+Keys.ENTER);
	}
	
	@FindBy(xpath="//a[@id='mnDashboard']")
	private WebElement dashBoardTab;
	
	public void clickDashboardTab()
	{
		dashBoardTab.click();
	}
	
	//validation od dashboard 
	@FindBy(xpath="//h3[text()='Equity Summary']")
	private WebElement getText;
	
	public String getTextFromDashboard()
	{
		String k=getText.getText();
		return k;
	}
	
	
	
	
	
	
	public PortfolioPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

}
