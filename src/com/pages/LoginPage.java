package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage{
	
	public AppiumDriver<WebElement> driver;
	
    public LoginPage(AppiumDriver<WebElement> driver) {
    	PageFactory.initElements(driver, this);
    	this.driver = driver;
	}

	@AndroidFindBy(id = "frg_auth_enter_login_field")
    private MobileElement emailField;
    
    public void loginWithValidUser() {
  	  By userId = By.id("frg_auth_enter_login_field");
  	  driver.findElement(userId).sendKeys("test");
    }
    
}
