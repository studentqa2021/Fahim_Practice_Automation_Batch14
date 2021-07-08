package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.masterpage.factory.MasterPageFactory1;

public class FacebookLogin {
	
	public void PracLogin() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		MasterPageFactory1 obj = new MasterPageFactory1(driver);
		obj.getEmail().sendKeys("fajam1389@yahoo.com");
		obj.getPassword().sendKeys("Smarttech123");
		obj.getLogin().click();
		
		
		
		
	}

}
