package tests;

import java.util.concurrent.TimeUnit;
// import java.net.URL;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
// import org.openqa.selenium.remote.DesiredCapabilities;
// import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import generic.methods.GenericMethods;
import generic.methods.JavaScriptRepos;
import page.classes.PersonHomeRepos;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		features = "src/test/java/feature",
		glue = {"stepdefinition"},
		plugin = {"pretty", "junit:target/cucumber-html-reports/PNCDemoTestReport.xml",
		"html:target/cucumber-html-reports",		
		"json:target/cucumber-html-reports/PNCDemoTestReport.json"}
		)

public class TestRun  {
	public static WebDriver driver;
	public static String baseURL;
	public static PersonHomeRepos personHome;
	public static JavaScriptRepos javaRepos;
	public static GenericMethods gm;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {                
		
// 		DesiredCapabilities capability = DesiredCapabilities.chrome();
// 		WebDriver driver = new RemoteWebDriver(new URL("http://18.207.165.143/jenkins"), capability);
		
		
		driver = new ChromeDriver();
		baseURL = "https://www.pnc.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		personHome = new PersonHomeRepos(driver);
		javaRepos = new JavaScriptRepos(driver);
		gm = new GenericMethods(driver);

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();

	}
	

}

