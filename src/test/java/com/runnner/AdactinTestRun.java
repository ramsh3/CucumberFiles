package com.runnner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.adactin.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\adactin.feature",
				 glue = "com.stepdefinition",
				 monochrome = true,
				 dryRun = false,
				 plugin = {"pretty","html:test-output","com.cucumber.listener.ExtentCucumberFormatter:Extent Report/adactinextentReport.html"}
				)

public class AdactinTestRun {

	public static WebDriver driver;

	@BeforeClass
	public static void applicationLaunch() {
		driver = BaseClass.browserLaunch("chrome");
	}
}
