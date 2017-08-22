package com.ym.jobboard.common;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	private static WebDriver instance;

	public static WebDriver getDriver() {
		return instance;
	}
	
		
	public static void Initialize() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		instance = new ChromeDriver();
		instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public static void Cleanup() {
		instance.close();
		System.exit(0);
	}

}