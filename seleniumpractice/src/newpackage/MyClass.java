package newpackage;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MyClass {
	
	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\BrowserDrivers\\chromedriver.exe");
		DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome();       
		handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver = new ChromeDriver (handlSSLErr);
		
		String baseUrl = "http://affirmativeaction-jobs.careerwebsite.com";
		
		driver.get(baseUrl);
		if(driver.getCurrentUrl().contains("https")) {
			
			System.out.println("Passed = HOME" + " = " + driver.getCurrentUrl());
		
		} else {
			System.out.println("Failed = HOME" + " = " + driver.getCurrentUrl());
		}
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement lnkEmployer = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a"));
		WebElement lnkProduct = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/ul/li[2]/a"));
		
		lnkEmployer.click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		do {
			
		} while(lnkProduct.isDisplayed());
			
		lnkProduct.click();
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement pageTitle = driver.findElement(By.className("jt_page_title"));	
		
		if(driver.getCurrentUrl().contains("https")) {
			System.out.println("Passed" + " = "+ pageTitle.getText() + " = "+ driver.getCurrentUrl());
		} else {
			System.out.println("Failed" + " = "+ pageTitle.getText() + " = "+ driver.getCurrentUrl());
		}
		
		lnkEmployer.click();

		WebElement lnkPost = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/ul/li[3]/a"));
		lnkPost.click();
		
		pageTitle = driver.findElement(By.className("jt_page_title"));	
		if(lnkPost.getText().contains("Login")) {
			driver.findElement(By.xpath("<input type=\"text\" name=\"j_username\" class=\"jt_common_field\" tabindex=\"1\">")).sendKeys("zmonsanto@yourmembership.com");
			driver.findElement(By.xpath("//*[@id=\"jt_login\"]/div/div[1]/table/tbody/tr[2]/td/input")).sendKeys("abcd1234");
			driver.findElement(By.xpath("//*[@id=\"jt_login\"]/div/div[2]/a/span/img")).click();
		} 
		
		if(driver.getCurrentUrl().contains("https")) {
			System.out.println("Passed" + " = "+ pageTitle.getText() + " = "+ driver.getCurrentUrl());
		} else {
			System.out.println("Failed" + " = "+ pageTitle.getText() + " = "+ driver.getCurrentUrl());
		}	

		
		driver.close();
		System.exit(0);
	}

	
}
