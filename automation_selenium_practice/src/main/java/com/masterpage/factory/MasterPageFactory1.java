package com.masterpage.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MasterPageFactory1 {
	
	public MasterPageFactory1(WebDriver driver) {//to remove null pointer exception
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//*[@id='pass']")
	private WebElement password;
	
	//@FindBy(xpath="//*[@class='inputtext _55r1 _6luy _9npi']")
	//private WebElement password;
	
	//@FindBy(xpath="//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']") 
	//private WebElement login;

	@FindBy(xpath="//*[@name='login']") 
	private WebElement login;
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	

}
