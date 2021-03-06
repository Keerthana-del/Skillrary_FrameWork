package com.Skillrary.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Skillrary.GenericUtils.BaseClass;
/*
 * This is the object repository created for CoursePage
 * author
 * @Keerthana C
 */
public class CoursePage extends BaseClass{

	public CoursePage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//a[.='courses']")
	private WebElement courseLink;
	@FindBy(xpath="//span[text()='Engineering Tutions']")
	private WebElement engineeringTutions;
	@FindBy(xpath="//h2[.='engineering-tutions']")
	private WebElement textFuction;
	
	
	public WebElement getTextFuction() {
		return textFuction;
	}
	public WebElement getCourseLink() {
		return courseLink;
	}
	public WebElement getEngineeringTutions() {
		return engineeringTutions;
	}
	/*author
	 * @Keerthana C
	 * This method will  navigate to computer Science page
	 * 
	 */

	public void coursePage() {
		courseLink.click();
		engineeringTutions.click();	
	}

	/*
	 * author
	 * @Keerthana C
	 * this method will return text of computer science page
	 * 
	 */
	public String textEn() {
		return textFuction.getText();
	}
}
