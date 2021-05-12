package com.Skillrary.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * POM class for taking a Specific Course
 * @author SOUMYASANTA SAHOO
 *
 */
public class TakeCourse {
	
	public TakeCourse(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="courses")
	private WebElement courses;
	
	@FindBy(linkText="Linux for Cloud & DevOps Engin")
	private WebElement course;
	
	@FindBy(id="enroll_btn")
	private WebElement takeCourse;

	/**
	 * Getter Methods
	 * @author SOUMYASANTA SAHOO
	 * @return
	 */
	public WebElement getCourses() {
		return courses;
	}

	public WebElement getCourse() {
		return course;
	}

	public WebElement getTakeCourse() {
		return takeCourse;
	}
	
	/**
	 * The method is used to take the course
	 * @author SOUMYASANTA SAHOO
	 * @return
	 */
	public String takeCourse()
	{
		courses.click();
		course.click();
	    return takeCourse.getText();
	}
}
