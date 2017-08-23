package com.ym.jobboard.jobseeker.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.ym.jobboard.common.Driver;
import com.ym.jobboard.common.JCheckpointXPath;
import com.ym.jobboard.common.JNavXPath;

public class JHelpPage {
	
	public static void GoTo() {
		
		System.out.println("JHelpPage");
		
		System.out.println("1 " + JNavXPath.JOBSEEKER.getJNavXpath());
		WebElement navJobSeeker = Driver.getDriver().findElement(By.xpath(JNavXPath.JOBSEEKER.getJNavXpath()));
		navJobSeeker.click();
		
		System.out.println("2 " + JNavXPath.HELP.getJNavXpath());
		WebElement navJMyAccount = Driver.getDriver().findElement(By.xpath(JNavXPath.HELP.getJNavXpath()));
		navJMyAccount.click();
		
		Assert.assertTrue(Driver.getDriver().findElement(By.xpath(JCheckpointXPath.HELP.getJCheckpointXPath())).getText().equals("Job Seeker Support Center"), "Job Search Page is not being displayed.");

	}
	
	public static JCreateSupportTicket CreateSupportTicket(String topic) {
		return new JCreateSupportTicket(topic);
	}
	
}
