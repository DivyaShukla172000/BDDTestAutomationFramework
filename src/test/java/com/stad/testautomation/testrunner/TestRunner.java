package com.stad.testautomation.testrunner;

import io.cucumber.testng.CucumberOptions;

import java.text.SimpleDateFormat;
import java.util.Date;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		//to Run all the feture file together features =  "./resources/features/"
		features = { "./resources/features/Exception.feature","./resources/features/Login.feature"},
		glue = "com.stad.testautomation.stepdefinations",
		dryRun = false, 
		monochrome = false, 
		plugin = {
		"pretty",
		// "html:target/cucumber-reports/cucumber.html"
		},
		tags="@sanity"

)

public class TestRunner extends AbstractTestNGCucumberTests {
// Why we are using Static? , So basically in Java Static will use to Execute that functionality on Priority so this will Execute 1st and then feature, glue, dryrun , monochrome and plugin runs
	static {
		// 1.generate a unique timestamp string
		String timestamp = new SimpleDateFormat("ddMMyyyyhhmmss").format(new Date());

		// 2. Dynamically build the plugin path property
		String reportpath = "html:target/cucumber-reports/cucumber_" + timestamp + ".html";

		// 3. Inject it into Cucumber Framework properties before Execution
		System.setProperty("cucumber.plugin", reportpath);
	}
}
