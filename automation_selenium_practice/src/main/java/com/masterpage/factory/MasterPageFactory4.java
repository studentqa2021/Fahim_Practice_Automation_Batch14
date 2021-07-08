package com.masterpage.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory4 {
	
	public MasterPageFactory4(WebDriver driver) {//to remove null pointer exception
		 PageFactory.initElements(driver, this);
	}
		 
		 @FindBy(xpath="//*[contains(text(),'Sign in')]")
		 private WebElement signinbtn;
		 
		 @FindBy(xpath="//*[(@id='email')]")
		 private WebElement email;
		 
		 @FindBy(xpath="//*[(@id='passwd')]")
		 private WebElement password;
		 
		 @FindBy(xpath="//*[(@id='SubmitLogin')]")
		 private WebElement submitbtn;

		public WebElement getSigninbtn() {
			return signinbtn;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getSubmitbtn() {
			return submitbtn;
		}
		 
		 
		 

}
