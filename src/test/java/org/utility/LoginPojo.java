package org.utility;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	
	public LoginPojo() {
		
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(id = "email")
		private WebElement txtUser;
		
		@FindBy(id = "pass")
		private WebElement txtpass;
		
		@FindBy(name = "login")
		private WebElement btnlogin;

		public WebElement getTxtUser() {
			return txtUser;
		}

		public WebElement getTxtpass() {
			return txtpass;
		}

		public WebElement getBtnlogin() {
			return btnlogin;
		}
	
		@FindBy(xpath="//a[text()='Forgotten password?']")
	    private WebElement forgotPass;

		public WebElement getForgotPass() {
			return forgotPass;
		}

			
		@FindBy(name="email")
		private WebElement enterMobile;

		public WebElement getEnterMobile() {
			return getEnterMobile();
		}
		
		@FindBy(xpath="//button[text()='Search']")
		private WebElement getClickSearch;

		public WebElement clickSearch() {
			return getClickSearch;
		}	
	
		
		
		
		
		
	
		
		
	 

}
