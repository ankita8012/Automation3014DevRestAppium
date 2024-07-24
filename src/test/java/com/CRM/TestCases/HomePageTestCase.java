package com.CRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.pages.HomePage;



//import org.testng.annotations.Test;



public class HomePageTestCase extends BaseClass{
  @Test(priority=1)
  public void verifyUrl()
  {
	  
	 HomePage hp = new HomePage(driver);
	  String actUrl = hp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("crm"),"Test fail: Url not matched!");
	  System.out.println("Test pass: URL matched!");
  }
  
  @Test(priority=2)
  public void verifyTitle() {
	  
	  HomePage hp = new HomePage(driver);
	  String actTitle = hp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Customer"),"Test Fail: Title is not matched!");
	  System.out.println("Test pass! Title matched");
  }
  
  @Test(priority=3)
  public void validateSigninLink(){
	  
	  HomePage hp = new HomePage(driver);
	  String nextPageUrl = hp.getStatusOfLink();
	  Assert.assertTrue(nextPageUrl.contains("login"),"test fai: login page not open");
	  System.out.println("Test Pass : Application navigating to login page");
  }
}
