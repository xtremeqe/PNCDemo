package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		features = "src/test/java/feature",
		glue = {"stepdefinition"},
		plugin = {"pretty", "junit:target/cucumber-html-reports/PNCDemoTestReport.xml"}
//		"html:target/cucumber-html-reports",		"json:target/cucumber-html-reports/Cucumber.json",
		)

public class TestRun  {
	

}

