package com.Skillrary.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TakeCourse {
	
	@FindBy(linkText="courses")
	private WebElement courses;
	
	@FindBy(linkText="Linux for Cloud & DevOps Engin")
	private WebElement course;
	
	

}
