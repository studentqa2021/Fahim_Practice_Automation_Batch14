package com.masterpage.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory2 {
	
	public MasterPageFactory2(WebDriver driver) {//to remove null pointer exception
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[contains(text(),'Sign in')]")
	private WebElement signinbtn;
	
	@FindBy(xpath="//*[@id='ap_email']")
	private WebElement email;
	
	@FindBy(xpath="//*[@class='a-button-input']")
	private WebElement continuebtn;
	
	@FindBy(xpath="//*[@id='ap_password']")
	private WebElement password;
	
	@FindBy(xpath="//*[@class='a-button-input']")
	private WebElement signonbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignonbtn() {
		return signonbtn;
	}

	


	
	
	
	
	
	
}
