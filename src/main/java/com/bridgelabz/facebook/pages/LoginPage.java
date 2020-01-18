package com.bridgelabz.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.facebook.base.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy(id = "email")
	WebElement email;

	@FindBy(id = "pass")
	WebElement password;

	@FindBy(id ="u_0_b")
	WebElement loginButton;



	public LoginPage() {
		
		PageFactory.initElements(driver,this);

	}


	public void Login(String emailid,String pass) {
		
		email.sendKeys(emailid);
		password.sendKeys(pass);
		loginButton.click();

	}
	
	public String loginPageTitle() {
		
		return driver.getTitle();
		
	}
}
