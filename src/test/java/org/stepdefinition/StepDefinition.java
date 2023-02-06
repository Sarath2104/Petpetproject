package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.utility.BaseClass;
import org.utility.LoginPojo;

import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass {
	
	@Given("User should launch the chrome and load url")
	public void user_should_launch_the_chrome_and_load_url() {
		

		}
	
	@When("User should check the login button")
	public void userShouldCheckTheLoginButton() {
		LoginPojo l=new LoginPojo();
		click(l.getBtnlogin());
	  
	}

	

	@When("User should input the inavild uername and password in textbox")
	public void userShouldInputTheInavildUernameAndPasswordInTextbox(io.cucumber.datatable.DataTable d) {
		
		LoginPojo l=new LoginPojo();
		List<String> al = d.asList();
		passValues(l.getTxtUser(), al.get(4));
		passValues(l.getTxtpass(), al.get(0));
	   
	}

	@Then("User should navigate to invaild credential page")
	public void user_should_navigate_to_invaild_credential_page() {
		String current = driver.getCurrentUrl();
		Assert.assertTrue("Verify the incoorect cred page", current.contains("clear"));
		
		System.out.println("Verified invaild credential page");
	    
	}
	
	@When("To print the title")
	public void to_print_the_title() {
	    getTitle();
	    
	}

	@When("User should input the valid uername and invaild password in textbox")
	public void userShouldInputTheValidUernameAndInvaildPasswordInTextbox(io.cucumber.datatable.DataTable d) {
		
		LoginPojo l=new LoginPojo();
		List<List<String>> list = d.asLists();
		passValues(l.getTxtUser(), list.get(1).get(4));
		passValues(l.getTxtpass(), list.get(0).get(1));
	    
	}

	@When("User should input the invaild uername and vaild password in textbox")
	public void userShouldInputTheInvaildUernameAndVaildPasswordInTextbox(io.cucumber.datatable.DataTable d) {
		
		LoginPojo l=new LoginPojo();
		Map<String, String> mp = d.asMap(String.class, String.class);
		passValues(l.getTxtUser(), mp.get("Color"));
		passValues(l.getTxtpass(), mp.get("Day"));
		
		
	   
	}

	@When("User should input the vaild uername and vaild password in textbox")
	public void userShouldInputTheVaildUernameAndVaildPasswordInTextbox(io.cucumber.datatable.DataTable d) {
		
		LoginPojo l=new LoginPojo();
		List<Map<String, String>> mp = d.asMaps();
		passValues(l.getTxtUser(), mp.get(1).get("Person"));
		passValues(l.getTxtpass(), mp.get(2).get("State"));
	    
	}
	@Then("User should check the succesful login page")
	public void userShouldCheckTheSuccesfulLoginPage() {
		
		String current = driver.getCurrentUrl();
		Assert.assertTrue("Verify the correct cred page", current.contains("welcome"));
		
		System.out.println("Verified correct credential page");
	   
	}
	
	
	
	

}
