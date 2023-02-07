package org.firstproject;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utility.BaseClass;

import io.cucumber.java.en.*;

public class FirstProjectStepDefLogin extends BaseClass{
	
	@Given("User should launch the chrome and load the url")
	public void user_should_launch_the_chrome_and_load_the_url() {
	   launchBrowser();
	   launchUrl("https://us.patpat.com/");
	   toMaximize();
	 
	   
	   
	   
	   
	   
	}

	@When("User should click the signin button")
	public void user_should_click_the_signin_button() {
		
		WebElement el = driver.findElement(By.xpath("//span[@class='account wh-32']"));
		el.click();
		
		WebElement qe = driver.findElement(By.xpath("//p[text()='Have an account?']"));
		qe.click();
		
		
		
	   
	}

	@When("User should enter the vaild username and passward into textbox")
	public void user_should_enter_the_vaild_username_and_passward_into_textbox() {
		
		WebElement em = driver.findElement(By.xpath("//input[@type='email']"));
		
		em.sendKeys("sarathfacer.22@gmail.com");
		
		WebElement ek = driver.findElement(By.xpath("//input[@type='password']"));
		ek.sendKeys("Smith$214");
		
	
	  
	}

	@When("User should click the login botton")
	public void user_should_click_the_login_botton() {
		
		WebElement qw = driver.findElement(By.xpath("//button[text()='Sign in']"));
		qw.click();
	
		
	   
	}

	@Then("User should get into the home page")
	public void user_should_get_into_the_home_page() {
	
		getCurrentUrl();
	  
	

}
}
