package com.jbk.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.TestBase.Test_Base;
import com.jbk.pages.Home_Page;
import com.jbk.pages.LoginPage;

public class HomePage_Test extends Test_Base {
	Home_Page homepage;
	LoginPage loginpg;

	public HomePage_Test() {
		super();

	}
	

	@BeforeMethod
	public void Setup() {
		loginpg = new LoginPage();
		homepage = loginpg.logIn(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void checkDashbordTitle() {
		String actdashbordtitle = homepage.dashbordTitle();
		System.out.println(actdashbordtitle);
		Assert.assertEquals(actdashbordtitle, "JavaByKiran | Dashboard");
	}

	@Test(priority = 2)
	public void users() {
		homepage.clickonUsers();
		System.out.println("on userspage");
	}

}
