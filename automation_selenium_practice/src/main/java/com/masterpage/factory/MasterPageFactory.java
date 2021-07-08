package com.masterpage.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {//to remove null pointer exception
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='identifierId']")
	private WebElement email;
	
	@FindBy(xpath="//*[@class='VfPpkd-vQzf8d']")
	private WebElement nextbtn;
	
	@FindBy(xpath="//*[@class='whsOnd zHQkBf']")
	private WebElement password;
	
	@FindBy(xpath="//*[@jsname='V67aGc']")
	private WebElement nextbtn1;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNextbtn() {
		return nextbtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getNextbtn1() {
		return nextbtn1;
	}
	
	
	
	
	
	
	
}