package com.Skillrary.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Skillrary.GenericUtils.BaseClass;

/**
 * POM Class for Home Page
 * @author SOUMYASANTA SAHOO
 *
 */
public class HomePage {
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='https://www.skillrary.com/uploads/images/f-sr-logo-195-50.png']")
	private WebElement logo;
	
	@FindBy(xpath="//a[@class='dropdown-toggle']/../../..//input[@placeholder='Search for Courses']")
	private WebElement search;
	
	@FindBy(xpath="//a[@class='dropdown-toggle']/../../..//input[@type='submit']")
	private WebElement submit;
	
	@FindBy(linkText=" Core Java")
	private WebElement searchedCourse;
	
	@FindBy(linkText=" Ask a Question ")
	private WebElement question;

	@FindBy(linkText="courses")
	private WebElement courses;
	
	@FindBy(xpath="//a[text()='my course']")
	private WebElement mycourses;
	
	@FindBy(xpath="//b[@class='caret']")
	private WebElement profiledropdown;
	
	@FindBy(linkText=" messages ")
	private WebElement msg;
	
	@FindBy(linkText="API Testing (Basics to Advance)")
	private WebElement specificCourse;
	
	@FindBy(linkText=" TAKE THIS COURSE ")
	private WebElement enrol;
	
	@FindBy(xpath="//a[text()=' Logout']")
	private WebElement logoutLink;
	
	@FindAll ({@FindBy(linkText="TALK TO OUR EXPERTS"),@FindBy(xpath="//a[text()='TALK TO OUR EXPERTS']")})
	private WebElement talkToExpertsLink;
	
	/**
	 * Getter Methods
	 * @author SOUMYASANTA SAHOO
	 * @return
	 */
	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getSearch() {
		return search;
	}
	
	public WebElement getSubmit() {
		return submit;
	}
	
	public WebElement getSearchedCourse() {
		return searchedCourse;
	}

	public WebElement getQuestion() {
		return question;
	}

	public WebElement getCourses() {
		return courses;
	}

	public WebElement getMycourses() {
		return mycourses;
	}

	public WebElement getProfiledropdown() {
		return profiledropdown;
	}

	public WebElement getMsg() {
		return msg;
	}

	public WebElement getSpecificCourse() {
		return specificCourse;
	}

	public WebElement getEnrol() {
		return enrol;
	}

	/**
	 * Business logic to handle Home Page
	 * @author SOUMYASANTA SAHOO
	 */
	public void clickOnLogo()
	{
		logo.click();
	}
	
	public String searchCourse(String text)
	{
		search.sendKeys(text);
		submit.click();
		return searchedCourse.getText();
	}
	
	public void clickOnAskQuestion()
	{
		question.click();
	}
	
	public void clickOnCourses()
	{
		courses.click();
	}
	
	public void clickOnMyCourses()
	{
		mycourses.click();
	}
	
	public void clickOnMessages()
	{
		profiledropdown.click();
		msg.click();
	}
	
	public String enrollForCourse()
	{
		specificCourse.click();
		return enrol.getText();
	}
	
	/**
	 * this method will perform logout operation
	 * @author Adarsh
	 */
	public void logout() {
		profiledropdown.click();
		logoutLink.click();
		
	}
	/**
	 * method will navigate to instructor list page
	 * @author Adarsh
	 */
	public void talkToExpert() {
		logo.click();
		talkToExpertsLink.click();	
		
	}

}
