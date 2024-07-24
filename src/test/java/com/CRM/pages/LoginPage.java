package com.CRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
 private WebDriver driver;
 
 
 //initialize driver
 
 public LoginPage(WebDriver driver)//base class driver
 {
	 this.driver = driver;
 }
 
 //locators
 private By email=By.id("email-id");
 private By pwd = By.id("password");
 private By btn = By.name("submit-name");
 
 //method
 public String doLogin(String em, String ps)
 {
	 driver.findElement(email).sendKeys(em);
	 driver.findElement(pwd).sendKeys(ps);
	 driver.findElement(btn).click();
	 
	 return driver.getCurrentUrl();
 }
 
 
 
 } 
