package com.pnc.pncdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {
	protected WebDriver driver;
	protected String baseURL;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		baseURL = "https://www.pnc.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testBase() {
//		driver.get(baseURL);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
