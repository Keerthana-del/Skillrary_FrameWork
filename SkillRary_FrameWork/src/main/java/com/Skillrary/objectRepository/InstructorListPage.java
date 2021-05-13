package com.Skillrary.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InstructorListPage {
	public InstructorListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

}
