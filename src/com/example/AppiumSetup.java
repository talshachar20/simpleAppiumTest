package com.example;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumSetup {
	
	AppiumDriver<WebElement> driver;
	
	public void setupCaps() throws MalformedURLException {
		  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "test");
		  cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		  cap.setCapability(MobileCapabilityType.APP, "/Users/tal.shachar/Documents/TalRepos/udemyAndroidCuc/features/support/com.loyverse.sale.apk");
		  cap.setCapability("udid", "192.168.57.101:5555");
		  
		  driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
	}
}
