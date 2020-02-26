package com.jbk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.TestBase.Test_Base;

public class LoginPage extends Test_Base {
	@FindBy(id = "email")
	WebElement email;

	@FindBy(id = "password")
	WebElement pswd;

	@FindBy(xpath = "//*[@id=\"form\"]/div[3]/div/button")

	WebElement loginbutton;

	@FindBy(id = "email_error")
	WebElement emailERr;

	@FindBy(xpath = ("//*[@id=\"password_error\"]"))
	WebElement pwdErr;

	// initiate page factory
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public Home_Page logIn(String un, String pwd){
		email.sendKeys(un);
		pswd.sendKeys(pwd);
		loginbutton.click();
		return new Home_Page();
	}

}
