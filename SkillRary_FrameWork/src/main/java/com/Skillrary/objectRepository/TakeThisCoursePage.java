package com.Skillrary.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TakeThisCoursePage {
	WebDriver driver;
	public TakeThisCoursePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public String pageTitle() {
	    return driver.getTitle();
	}
	

}
