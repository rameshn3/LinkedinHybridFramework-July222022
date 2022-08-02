package com.qa.linkedin.testcases;

import org.testng.annotations.Test;

import com.qa.linkedin.base.TestBase;
import com.qa.linkedin.pages.LinkedinHomePage;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LinkedinHomePageTest extends TestBase{
	private Logger log=Logger.getLogger(LinkedinHomePageTest.class);
	LinkedinHomePage lhomePg;
  @Test
  public void verifyLinkedinLogoTest() {
	  log.info("started verifyLinkedinLogoTest()");
	  Assert.assertTrue(lhomePg.isLinkedinLogoPresent(), "linkedinLogo is not present");
  }
  
  @Test
  public void verifyLinkedinHomePageTitle() {
	  log.info("started verifying the linkedin home page title");
	  String actTitle=lhomePg.getLinkedinHomePagetitle();
	  log.info("actual page title is:"+actTitle);
	  Assert.assertTrue(actTitle.contains("Log In"));
	  
  }
  
  
  @BeforeClass
  public void beforeClass() throws IOException {
	 log.info("create the page class object"); 
	 lhomePg=new LinkedinHomePage();
	 
  }

  @AfterClass
  public void afterClass() {
	  log.info("clearing the browser cache");
	 driver.manage().deleteAllCookies();
  }

}
