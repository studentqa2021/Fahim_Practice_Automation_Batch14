package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.masterpage.factory.MasterPageFactory2;
import com.util.HighlighterAmazon;
import com.util.ScreenShot;


public class AmazonLogin {
	
	public void BasicLogin() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		ScreenShot.getScreenShot(driver, "homePage");
		MasterPageFactory2 obj = new MasterPageFactory2(driver);
		//WebElement signinbtn = driver.findElement(By.xpath("//*[contains(text(),'Sign in')]"));
		HighlighterAmazon.addColor(obj.getSigninbtn(), driver);
		obj.getSigninbtn().click();
		obj.getEmail().sendKeys("fajamal13@gmail.com");
		ScreenShot.getScreenShot(driver, "email");
		obj.getContinuebtn().click();
		obj.getPassword().sendKeys("anonymous");
		ScreenShot.getScreenShot(driver, "password");
		obj.getSignonbtn().click();
		ScreenShot.getScreenShot(driver, "Signinbtn");
	}

		
	

}
