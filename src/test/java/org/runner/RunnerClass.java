package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utility.jvmReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue="org.stepdefinition",dryRun=false,snippets=SnippetType.CAMELCASE,tags= {"@Sanity"},
plugin= {"html:target\\reports","junit:target\\reports\\fblogin.xml","json:target\\reports\\fbpage.json",
		"rerun:src\\test\\resources\\FeatureFiles\\Rerun\\Failed.txt"})

public class RunnerClass {
	
	@AfterClass
	public static void reportPull() {
		jvmReports.generateJvmReport(System.getProperty("user.dir")+"\\target\\reports\\fbpage.json");

	}

}
