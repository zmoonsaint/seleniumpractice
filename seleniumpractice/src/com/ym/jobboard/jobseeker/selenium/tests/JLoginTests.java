package com.ym.jobboard.jobseeker.selenium.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

import com.ym.jobboard.common.Driver;

public class JLoginTests {
	
	@BeforeTest
	protected void beforeTest() {
		Driver.Initialize();
	}
	

	@Test
	protected void jobseeker_Can_Login() {
		JLoginPage.GoTo();
		JLoginPage.LoginAs("zmonsanto@yourmembership.com")
		.WithPassword("abcd1234")
		.Login();
	}	

	
	@AfterTest
	protected void afterTest() {
		JLoginPage.Logout();
		Driver.Cleanup();
	}
}
