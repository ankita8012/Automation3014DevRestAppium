package com.CRM.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.Assert;

import com.CRM.pages.HomePage;
import com.CRM.pages.LoginPage;

public class LoginPageTestCase extends BaseClass {
	  
	@BeforeClass
	public void pageSetup()
	{
		HomePage hp = new HomePage(driver);
		hp.getStatusOfLink();
	}
	@Test
  public void validateLogin() {
	  LoginPage lp = new LoginPage(driver);
	  String url = lp.doLogin("test@gmail.com","test123");
	  Assert.assertTrue(url.contains("customers"),"Test Fail:Login Fail");
	  System.out.println("Test Pass: login completed");
  }
}