package com.jbk.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Test_Base {
	public static Properties prop;
	public static WebDriver driver;

	public Test_Base() {
		FileInputStream file = null;
		prop = new Properties();
		try {
			file = new FileInputStream(
					"E:\\workspacelatestGit\\JbkWebsite\\src\\main\\java\\com\\jbk\\config\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@BeforeMethod
	public static void OpenBrowser() {

		String browser = prop.getProperty("browser");
		String browser1 = prop.getProperty("browser");

		if (browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "chromedriver79.exe");
			driver = new ChromeDriver();

		} else if (browser1.equals("firefox")) {

			System.out.println("firefox");

		}
		driver.get(prop.getProperty("url"));

	}

	@AfterMethod
	public void quitebr() {
		driver.quit();

	}

}
