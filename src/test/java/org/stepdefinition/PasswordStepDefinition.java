package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.utility.BaseClass;

import io.cucumber.java.en.*;

public class PasswordStepDefinition extends BaseClass {
	
	@When("User should click the forgotten password functionality")
	public void user_should_click_the_forgotten_password_functionality() {
		
		driver.findElement(By.linkText("Forgotten password?")).click();
	}

	@When("User should enter the invaild mobile number in textbox")
	public void user_should_enter_the_invaild_mobile_number_in_textbox() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("5678954321");
	    
	}

	@When("User should click the search button")
	public void user_should_click_the_search_button() {
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
	   
	}

	@Then("User should navigate to reset password page")
	public void user_should_navigate_to_reset_password_page() {
		
		String url = driver.getCurrentUrl();
Assert.assertTrue("Verify the incoorect cred page", url.contains("recover"));
		
		System.out.println("Verified the reseted page");
	    
	}

}
