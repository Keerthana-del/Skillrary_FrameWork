package com.Skillrary.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
     
	@FindBy(linkText="Sign Up")
	private WebElement signUpLink;
	
	@FindBy(xpath="//a[text()='Sign In']")
	private WebElement signInLink;
	
	//getters method
	
	public WebElement getSignUpLink() {
		return signUpLink;
	}

	public WebElement getSignInLink() {
		return signInLink;
	}
	/**
	 * This is the method to click on 
	 * @author Adarsh
	 */
	public void clickOnSignIn() {
		signInLink.click();
		
	}
	
}
