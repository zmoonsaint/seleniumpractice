package com.ym.jobboard.jobseeker.selenium.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ym.jobboard.common.Driver;

public class JHelpTests {
	
	@BeforeTest
	protected void beforeTest() {
		Driver.Initialize();
		JLoginPage.GoTo();
		JHelpPage.GoTo();
	}
	

	@Test
	protected void not_loggedin_jobseeker_Can_Create_Support_Ticket() {
		JHelpPage.CreateSupportTicket("Other")
		.WithSubject("Test Subject")
		.WithEmail("zmonsanto@yourmembership.com")
		.WithMessage("This is just a Test  - Jobseeker is not Logged In")
		.CreateSupportTicket(false);
	}	
	
	@Test
	protected void loggedin_jobseeker_Can_Create_Support_Ticket() {
		JLoginPage.LoginAs("zmonsanto@yourmembership.com")
		.WithPassword("abcd1234")
		.Login();
		JHelpPage.CreateSupportTicket("Other")
		.WithSubject("Test Subject")
		.WithEmail("zmonsanto@yourmembership.com")
		.WithMessage("This is just a Test  - Jobseeker is Logged In")
		.CreateSupportTicket(true);
	}		
	
	@AfterTest
	protected void afterTest() {
		JLoginPage.Logout();
		Driver.Cleanup();
	}
}
