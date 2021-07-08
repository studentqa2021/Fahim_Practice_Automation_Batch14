package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.masterpage.factory.MasterPageFactory4;

public class AutomationPractice {
	
	public void BasicLogin() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		MasterPageFactory4 obj = new MasterPageFactory4(driver);
		obj.getSigninbtn().click();
		obj.getEmail().sendKeys("sarowerny@gmail.com");
		obj.getPassword().sendKeys("student");
		obj.getSubmitbtn().click();
		
		
		
		
		
		
		
	}

}
