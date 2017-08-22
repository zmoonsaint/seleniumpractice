package com.ym.jobboard.jobseeker.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.ym.jobboard.common.Driver;
import com.ym.jobboard.common.JCheckpointXPath;
import com.ym.jobboard.common.JNavXPath;

public class JJobSearchPage {
	
	public static void GoTo() {
		
		System.out.println("JJobSearchPage");
		
		System.out.println("1 " + JNavXPath.JOBSEEKER.getJNavXpath());
		WebElement navJobSeeker = Driver.getDriver().findElement(By.xpath(JNavXPath.JOBSEEKER.getJNavXpath()));
		navJobSeeker.click();
		
		System.out.println("2 " + JNavXPath.JOB_SEARCH.getJNavXpath());
		WebElement navJMyAccount = Driver.getDriver().findElement(By.xpath(JNavXPath.JOB_SEARCH.getJNavXpath()));
		navJMyAccount.click();
		
		Assert.assertTrue(Driver.getDriver().findElement(By.xpath(JCheckpointXPath.JOB_SEARCH.getJCheckpointXPath())).getText().equals("My Account"), "My Account Page is not being displayed.");

	}
}
