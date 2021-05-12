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
	@FindBy(xpath="//span[.='Engineering Tutions']")
	private WebElement engineeringTutions;
	@FindBy(xpath="//h2[.='engineering-tutions / computerinformation-science']")
	private WebElement textFuction;


	public WebElement getTextfuction() {
		return textFuction;
	}
	public WebElement getCourseLink() {
		return courseLink;
	}
	public WebElement getEngineeringTutions() {
		return engineeringTutions;
	}
	

	public void coursePage(String engineeringcategory)
	{
		/*author
		 * @Keerthana C
		 * This method will click on course and navigate to engineering category
		 * return engineeringcategory
		 */
		courseLink.click();
		wUtil.SelectOption(engineeringTutions, engineeringcategory);
		
	}
	
	
 public String textEn()
 /*author
  * @Keerthana C
  * this method will return text of EngineeringTutionpage
  * 
  */
 {
	  return textFuction.getText();
 }
}
