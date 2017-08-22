package com.ym.jobboard.jobseeker.selenium.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestJobSeeker {
	WebDriver driver;
	String baseUrl;
	
	
	protected void setUpBeforeTestClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		//DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome();       
		//handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
		driver = new ChromeDriver ();
	}
	
	protected void setUpBeforeTestMethod() {
		driver.get(baseUrl);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
//	
//	protected tearDownAfterTestMethod() {
//	    // logout of the app, if necessary
//	}
//	
	protected void tearDownAfterTestClass() {
	    // close connections, close browser as needed
		driver.close();
		System.exit(0);
	}
}
