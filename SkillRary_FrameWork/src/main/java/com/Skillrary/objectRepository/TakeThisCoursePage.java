package com.Skillrary.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is the object repository of Take this course page
 * @author Adarsh
 *
 */
public class TakeThisCoursePage {
	WebDriver driver;
	public TakeThisCoursePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(id="back_btn")
	private WebElement backToCourseButton;

	//getter methods
	public WebElement getBackToCourseButton() {
		return backToCourseButton;
	}
	/**
	 * it will fetch the page title
	 * @author Adarsh
	 * @return
	 */
	public String pageTitle() {
		return driver.getTitle();
	}
	/**
	 * method will navigate to course page
	 * @author Adarsh
	 */
	public void backToCourse() {
		backToCourseButton.click();

	}
}
