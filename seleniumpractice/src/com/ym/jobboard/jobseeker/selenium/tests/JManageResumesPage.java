package com.ym.jobboard.jobseeker.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.ym.jobboard.common.Driver;
import com.ym.jobboard.common.JCheckpointXPath;
import com.ym.jobboard.common.JNavXPath;

public class JManageResumesPage {
	
	public static void GoTo() {
		
		System.out.println("JManageResumes");
		
		System.out.println("1 " + JNavXPath.JOBSEEKER.getJNavXpath());
		WebElement navJobSeeker = Driver.getDriver().findElement(By.xpath(JNavXPath.JOBSEEKER.getJNavXpath()));
		navJobSeeker.click();
		
		System.out.println("2 " + JNavXPath.MANAGE_RESUMES.getJNavXpath());
		WebElement navJMyAccount = Driver.getDriver().findElement(By.xpath(JNavXPath.MANAGE_RESUMES.getJNavXpath()));
		navJMyAccount.click();
		
		Assert.assertTrue(Driver.getDriver().findElement(By.xpath(JCheckpointXPath.MAIN_PAGE_TITLE.getJCheckpointXPath())).getText().equals("Ceevees / Cover Letters"), "Manage Resumes Page is not being displayed.");

	}
}
