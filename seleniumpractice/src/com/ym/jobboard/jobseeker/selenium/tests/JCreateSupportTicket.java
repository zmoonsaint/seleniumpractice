package com.ym.jobboard.jobseeker.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.ym.jobboard.common.Driver;

public class JCreateSupportTicket {
	
	private String topic;
	private String subject;
	private String email;
	private String message;
	
	public JCreateSupportTicket(String topic) {
		this.topic = topic;
	}
	
	public JCreateSupportTicket WithSubject(String subject) {
		this.subject = subject;
		return this;
	}
	
	public JCreateSupportTicket WithEmail(String email) {
		this.email = email;
		return this;
	}
	
	public JCreateSupportTicket WithMessage(String message) {
		this.message = message;
		return this;
	}
	
	public void CreateSupportTicket(boolean jLoggedInStatus) {
		System.out.println("CreateSupportTicket");
		
		WebElement selectTopic = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/section[4]/div/form/section[1]/fieldset[1]/select"));
		Select dropdownSelectTopic = new Select(selectTopic);
		dropdownSelectTopic.selectByVisibleText(topic);
		
		WebElement inputSubject = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/section[4]/div/form/section[1]/fieldset[2]/input"));
		inputSubject.sendKeys(subject);
		
		if (!jLoggedInStatus) {
			WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/section[4]/div/form/section[1]/fieldset[3]/input"));
			inputEmail.sendKeys(email);
		}
		
		WebElement textareaMessage = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/section[4]/div/form/section[1]/fieldset[4]/textarea"));
		textareaMessage.sendKeys(message);
		
		WebElement btnCreateSupportTicket = Driver.getDriver().findElement(By.xpath("//*[@id=\"button-input\"]"));
		btnCreateSupportTicket.click();
		
		Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/span/ul/li")).getText().equals("A new support ticket has been created."), "Support ticket was not created successfully.");
	}
	
}
