package com.CRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
//encapsulation=private data +public method is rule
	private WebDriver driver;
// initialize driver; always done by constructor to initialize the object
//constructor should not have return type
	public HomePage(WebDriver driver) //base class driver
	
	// data member(locator)
	{
		this.driver=driver;
	}
	
	private By link = (By.linkText("Sign In"))	;

// method(functionality to test)
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public String getStatusOfLink()
	{
		driver.findElement(link).click();
		return driver.getCurrentUrl();
	}
	
	
	}
	
	
	

