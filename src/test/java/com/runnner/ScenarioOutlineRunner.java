package com.runnner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\ScenarioOutlineDemo.feature",
glue = "com.stepdefnition.outline", 
monochrome = true, dryRun = false)

public class ScenarioOutlineRunner {

	}
