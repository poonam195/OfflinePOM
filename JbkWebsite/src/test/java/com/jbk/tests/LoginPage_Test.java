package com.jbk.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.TestBase.Test_Base;
import com.jbk.pages.LoginPage;

public class LoginPage_Test extends Test_Base{
	LoginPage loginpg ;
	public LoginPage_Test(){
		super();
		
	}
	@BeforeMethod
	public void Setup(){
		loginpg = new LoginPage();
	}
	
	@Test(priority=1)
	public void checkTitle(){
		String actTitle = loginpg.validateLoginPageTitle();
		System.out.println(actTitle);
		Assert.assertEquals(actTitle, "JavaByKiran | Log in");
	}
	@Test(priority=2)
	public void navigatTohomepage(){
		loginpg.logIn(prop.getProperty("username"), prop.getProperty("password"));
	}

}
