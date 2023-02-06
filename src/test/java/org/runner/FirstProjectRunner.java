package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features="src\\test\\resources\\FeatureFiles\\firstproject-feature", glue="org.firstproject", dryRun=false)

public class FirstProjectRunner {

}
