package com.example;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.LoginPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import junit.framework.Assert;
//import scenarios.AndroidSetup;

public class FirstAppiumTest extends AppiumSetup {
	
  @BeforeClass 
  public void setup() throws MalformedURLException {
	  setupCaps();
  }
  
  @AfterClass
  public void tearDown() throws Exception {
      driver.quit();
  }
  	
  @Test
  public void SimpleTest() {
	  //LoginPage loginPage = new LoginPage(driver);
	  //loginPage.loginWithValidUser();
	  By userId = By.id("frg_auth_enter_login_field");
	  driver.findElement(userId).sendKeys("test");
  }
  
}
