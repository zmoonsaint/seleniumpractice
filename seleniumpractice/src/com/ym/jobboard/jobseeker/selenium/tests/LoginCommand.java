package com.ym.jobboard.jobseeker.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ym.jobboard.common.Driver;

public class LoginCommand {
	private String username;
	private String password;
	
	public LoginCommand(String username) {
		this.username = username;
	}
	
	public LoginCommand WithPassword(String password) {
		this.password = password;
		return this;
	}
	
	public void Login() {
		System.out.println("Login");
		WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//*[@id=\'jt_login\']/section/fieldset[1]/input"));
		inputUsername.sendKeys(username);

		WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//*[@id=\'jt_login\']/section/fieldset[2]/input"));
		inputPassword.sendKeys(password);
		
		WebElement btnLogin = Driver.getDriver().findElement(By.xpath("//*[@id=\'login-button\']"));
		btnLogin.click();
		
	}
	
	public static void Logout() {
		System.out.println("Logout");
		
		
		
		WebElement linkWelcome = Driver.getDriver().findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a"));
		linkWelcome.click();
		
		WebElement linkLogout = Driver.getDriver().findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/ul/li[2]/a"));
		linkLogout.click();
		
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}