package com.Skillrary.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Skillrary.GenericUtils.BaseClass;

/**
 * POM Class for Home Page
 * @author SOUMYASANTA SAHOO
 *
 */
public class HomePage {
	
	@FindBy(xpath="//img[@src='https://www.skillrary.com/uploads/images/f-sr-logo-195-50.png']")
	private WebElement logo;
	
	@FindBy(xpath="//a[@class='dropdown-toggle']/../../..//input[@placeholder='Search for Courses']")
	private WebElement search;
	
	@FindBy(linkText=" Ask a Question ")
	private WebElement question;

	@FindBy(linkText="courses")
	private WebElement courses;
	
	@FindBy(linkText="my course")
	private WebElement mycourses;
	
	@FindBy(xpath="//b[@class='caret']")
	private WebElement profiledropdown;
	
	@FindBy(linkText=" messages ")
	private WebElement msg;

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getSearch() {
		return search;
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
	
	/**
	 * Business logic to handle Home Page
	 * @author SOUMYASANTA SAHOO
	 */
	public void clickOnLogo()
	{
		logo.click();
	}
	
	public void searchCourse()
	{
		search.click();
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

}
