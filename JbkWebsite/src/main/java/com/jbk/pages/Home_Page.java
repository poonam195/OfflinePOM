package com.jbk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.TestBase.Test_Base;

public class Home_Page extends Test_Base {
	@FindBy(xpath = "//ul[@class='sidebar-menu']//li[3]//a")
	WebElement users;

	@FindBy(xpath = "//span[@class='logo-lg']//b")
	WebElement javabykiran;

	public Home_Page() {
		PageFactory.initElements(driver, this);
	}

	// actions
	

	public String dashbordTitle() {
		return driver.getTitle();
	}
	
	public usersPage clickonUsers(){
		users.click();
		return new usersPage();
	}

}
