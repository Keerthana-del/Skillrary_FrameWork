package com.Skillrary.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Skillrary.GenericUtils.WebDriverUtility;

public class InstructorListPage extends WebDriverUtility {
	public InstructorListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()=' SkillRary SR']")
	private WebElement skillrarySRLink;
	
	//getters method
	
	public WebElement getSkillrarySRLink() {
		return skillrarySRLink;
	}
	/**
	 * method will click the skillrarySR link
	 * @author Adarsh
	 * @throws Throwable
	 */
	public void clickSkillRarySR() throws Throwable {
		waitAndClick(skillrarySRLink);
		
	}
	

}
