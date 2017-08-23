package com.ym.jobboard.jobseeker.selenium.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ym.jobboard.common.Driver;

public class JNavigationTests {
	
	@BeforeTest
	protected void beforeTest() {
		Driver.Initialize();
		JLoginPage.GoTo();
		JLoginPage.LoginAs("zmonsanto@yourmembership.com")
		.WithPassword("abcd1234")
		.Login();		
	}
	

	@Test
	protected void jobseeker_Can_Navigate_To_MyAccount() {
		JMyAccountPage.GoTo();
	}	
	
	@Test
	protected void jobseeker_Can_Navigate_To_JobSearch() {
		JJobSearchPage.GoTo();
	}	
	
	@Test
	protected void jobseeker_Can_Navigate_To_ManageResumes() {
		JManageResumesPage.GoTo();
	}
	
	@Test
	protected void jobseeker_Can_Navigate_To_JobAlerts() {
		JJobAlertsPage.GoTo();
	}	
	
	@Test
	protected void jobseeker_Can_Navigate_To_Resources() {
		JResourcesPage.GoTo();
	}	
	
	@Test
	protected void jobseeker_Can_Navigate_To_Help() {
		JHelpPage.GoTo();
	}	
	
	@AfterTest
	protected void afterTest() {
		JLoginPage.Logout();
		Driver.Cleanup();
	}
}
