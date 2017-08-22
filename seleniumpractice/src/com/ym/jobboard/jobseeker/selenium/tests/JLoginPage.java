package com.ym.jobboard.jobseeker.selenium.tests;

import com.ym.jobboard.common.Driver;

public class JLoginPage {
	
	public static void GoTo() {
		Driver.getDriver().get("https://qa.careerwebsite.com/jobseeker/login?site_id=22615");
	}
	
	public static LoginCommand LoginAs(String username) {
		return new LoginCommand(username);
	}
	
	public static void Logout() {
		LoginCommand.Logout();
	}

}