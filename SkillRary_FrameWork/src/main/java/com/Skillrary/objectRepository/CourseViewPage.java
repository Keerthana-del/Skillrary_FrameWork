package com.Skillrary.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is the object repository for courseView Page
 * @author Adarsh
 *
 */
public class CourseViewPage {
	public CourseViewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul[@class='sectionul section-1611']/descendant::div[@id='6871']/following-sibling::div/a")
	private WebElement startLecture;
	
	@FindBy(linkText=" Discussions")
	private WebElement discussionLink;
	
	@FindBy(linkText=" Announcements")
	private WebElement announcementLink;
	
	@FindBy(linkText=" Assignments ")
	private WebElement assignmentLink;
	
	@FindBy(linkText="adddiscussions")
	private WebElement adddiscussionLink;
	
	@FindBy(xpath="//a[@title='Course Information']")
	private WebElement courseInfoIcon;
	
	@FindBy(id="infoModalLabel")
	private WebElement infomationLabel;
	
	//getters methods
	
    
	
	public WebElement getStartLecture() {
		return startLecture;
	}

	public WebElement getInfoBodyBox() {
		return infomationLabel;
	}

	public WebElement getCourseInfoIcon() {
		return courseInfoIcon;
	}

	public WebElement getDiscussionLink() {
		return discussionLink;
	}

	public WebElement getAnnouncementLink() {
		return announcementLink;
	}

	public WebElement getAssignmentLink() {
		return assignmentLink;
	}

	public WebElement getAdddiscussionLink() {
		return adddiscussionLink;
	}
	/**
	 * this method will start the course
	 * @author Adarsh
	 */
	public void startcourse() {
		startLecture.click();
	}
	public String courseInfoClick() {
		courseInfoIcon.click();
		return infomationLabel.getText();
		
	}
	
	
	

}
