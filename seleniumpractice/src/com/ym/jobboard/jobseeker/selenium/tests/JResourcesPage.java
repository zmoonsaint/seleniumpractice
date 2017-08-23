package com.ym.jobboard.jobseeker.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.ym.jobboard.common.Driver;
import com.ym.jobboard.common.JCheckpointXPath;
import com.ym.jobboard.common.JNavXPath;

public class JResourcesPage {
	
	public static void GoTo() {
		
		System.out.println("JResourcesPage");
		
		System.out.println("1 " + JNavXPath.JOBSEEKER.getJNavXpath());
		WebElement navJobSeeker = Driver.getDriver().findElement(By.xpath(JNavXPath.JOBSEEKER.getJNavXpath()));
		navJobSeeker.click();
		
		System.out.println("2 " + JNavXPath.RESOURCES.getJNavXpath());
		WebElement navJMyAccount = Driver.getDriver().findElement(By.xpath(JNavXPath.RESOURCES.getJNavXpath()));
		navJMyAccount.click();
		
		System.out.println("3 " + Driver.getDriver().findElement(By.xpath(JCheckpointXPath.BREADCRUMBS.getJCheckpointXPath())).getText());
		Assert.assertTrue(Driver.getDriver().findElement(By.xpath(JCheckpointXPath.BREADCRUMBS.getJCheckpointXPath())).getText().equals("Resources Home"), "Job Search Page is not being displayed.");

	}
	
}
