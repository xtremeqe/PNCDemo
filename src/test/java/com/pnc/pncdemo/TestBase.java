package com.pnc.pncdemo;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.methods.GenericMethods;
import generic.methods.JavaScriptRepos;
import page.classes.PersonHomeRepos;

public class TestBase {
	public WebDriver driver;
	public String baseURL;
	public PersonHomeRepos personHome;
	public JavaScriptRepos javaRepos;
	public GenericMethods gm;

	@BeforeClass
	public void setUpBeforeClass() throws Exception {

		driver = new ChromeDriver();
		baseURL = "https://www.pnc.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		personHome = new PersonHomeRepos(driver);
		javaRepos = new JavaScriptRepos(driver);
		gm = new GenericMethods(driver);

	}

	@AfterClass
	public void tearDownAfterClass() throws Exception {
		driver.quit();

	}

	@Test
	public void test() {
		// fail("Not yet implemented");
	}

}
