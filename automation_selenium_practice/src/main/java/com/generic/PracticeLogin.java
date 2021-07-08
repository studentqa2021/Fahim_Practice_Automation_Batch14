package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.masterpage.factory.MasterPageFactory;

public class PracticeLogin {
	
	public void baseLogin() {

		System.setProperty("webdriver.chrome.driver", "./Driver/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		MasterPageFactory obj = new MasterPageFactory(driver);
		obj.getEmail().sendKeys("dperson651@yahoo.com");
		obj.getNextbtn().click();
		obj.getPassword().sendKeys("Smarttech123");
		obj.getNextbtn1().click();
		
		
	}

}
