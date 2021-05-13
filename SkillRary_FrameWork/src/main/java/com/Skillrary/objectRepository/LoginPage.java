package com.Skillrary.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Skillrary.GenericUtils.WebDriverUtility;

/**
 * This is the object repository for login page
 * @author Adarsh
 *
 */

public class LoginPage extends WebDriverUtility{
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	@FindBy(id="email")
	private WebElement emailAddressTF;
	
	@FindBy(name="password")
	private WebElement passwordTF;
	
	@FindBy(xpath="//span[@id='recaptcha-anchor']")
	private WebElement reCaptchaCheckbox;
	
	@FindBy(id="usertype_yes")
	private WebElement yesRadioButton ;
	
	@FindBy(id="usertype_no")
	private WebElement noRadioButton;
	
	@FindBy(name="remember")
	private WebElement rememberMeCheckbox;
	
	@FindBy(name="captcha_type")
	private WebElement captchaTypeButton;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitButton;
	
	@FindBy(linkText="Forgot Password")
	private WebElement forgotPasswordLink;
	
	@FindBy(linkText="login with facebook")
	private WebElement loginWithFacebookLink;
	
	@FindBy(linkText="login with twitter")
	private WebElement loginWithTwitterLink;
	
	@FindBy(linkText="login with google+ ")
	private WebElement loginWithGoogle;
	
	@FindBy(linkText=" Sign Up")
	private WebElement signUplink;
	
	@FindBy(xpath="//iframe[@title='reCAPTCHA']")
	private WebElement iFrameName;
	
	@FindBy(linkText="X")
	private WebElement closeCookies;
	
	
	
	
	//getters methods
	

	
	public WebElement getEmailAddressTF() {
		return emailAddressTF;
	}

	public WebElement getiFrameName() {
		return iFrameName;
	}

	public WebElement getCloseCookies() {
		return closeCookies;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getReCaptchaTF() {
		return reCaptchaCheckbox;
	}

	public WebElement getYesRadioButton() {
		return yesRadioButton;
	}

	public WebElement getNoRadioButton() {
		return noRadioButton;
	}

	public WebElement getRememberMeCheckbox() {
		return rememberMeCheckbox;
	}

	public WebElement getCaptchaTypeButton() {
		return captchaTypeButton;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	public WebElement getReCaptchaCheckbox() {
		return reCaptchaCheckbox;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public WebElement getLoginWithFacebookLink() {
		return loginWithFacebookLink;
	}

	public WebElement getLoginWithTwitterLink() {
		return loginWithTwitterLink;
	}

	public WebElement getLoginWithGoogle() {
		return loginWithGoogle;
	}

	public WebElement getSignUplink() {
		return signUplink;
	}
	
	/**
	 * This method will perform login operation
	 * @author Adarsh
	 * @param username
	 * @param password
	 * @throws InterruptedException 
	 */
	public void login(String username,String password) throws InterruptedException {
		closeCookies.click();
		emailAddressTF.sendKeys(username);
		passwordTF.sendKeys(password);
		Thread.sleep(40000);
//		switchFrame(driver,iFrameName );
//		reCaptchaCheckbox.click();
//		driver.switchTo().parentFrame();
		submitButton.click();	
	}
}
