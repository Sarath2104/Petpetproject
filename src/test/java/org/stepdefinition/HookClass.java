package org.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.hamcrest.core.Is;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utility.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass extends BaseClass {

	@Before(order=1)
	public void beforeScenario() {
		
		System.out.println("Bfore Hooks class");
		launchBrowser();
		}
	
	@Before(order=2)
	public void beforeCheck() {
		
		launchUrl("https://www.facebook.com/");
	}
	
	@Before(order=3)
	
	public void BeforeChecking() {
		toMaximize();
		
	}
	
	@After(order=2)
	public void afterCheck() {
		System.out.println("A.order no:2");
		System.out.println("ScreenShot has been taken");
		

	}
	@After(order=1)
	public void afterChecking() {
		System.out.println("A.order no:1");
		toClose();
	

	}
	@After(order=3)
	public void afterClass(Scenario s) throws IOException {
		System.out.println("A.order no:3");
		
		if (s.isFailed()) {
			TakesScreenshot tk=(TakesScreenshot)driver;
			
			byte[] l = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(l, "image/png");
			
			
			String name = s.getName();
			String re = name.replace(" ", "_");
			ScreenShot(re);
		}
	
	
}
}
