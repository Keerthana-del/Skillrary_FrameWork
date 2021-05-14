package com.Skillrary.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * object repository for skillrary SR page
 * @author Adarsh
 *
 */
public class SkillrarySRPage {
	public SkillrarySRPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='send message']")
	private WebElement sendMessageLink;
	
	//getters
	

	public WebElement getSendMessageLink() {
		return sendMessageLink;
	}
	
	

}
