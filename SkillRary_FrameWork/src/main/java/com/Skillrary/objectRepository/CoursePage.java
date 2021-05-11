package com.Skillrary.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Skillrary.GenericUtils.BaseClass;
/*
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

public String coursePage(String engineeringcategory)
{
	courseLink.click();
	wUtil.SelectOption(engineeringTutions, engineeringcategory);
	return textFuction.getText();
}

}
