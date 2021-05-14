package com.Skillrary.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Skillrary.GenericUtils.WebDriverUtility;

public class SentMessagePage extends WebDriverUtility {
	
	public SentMessagePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='https://www.skillrary.com/message?ty=2']")
	private WebElement sent;
	
	@FindBy(xpath="//td[@class='td-clickable text-']")
	private WebElement sentMsg;

	public WebElement getSent() {
		return sent;
	}

	public WebElement getSentMsg() {
		return sentMsg;
	}
	
	/**
	 * Business logic to verify composed message
	 * @author SOUMYASANTA SAHOO
	 * @return
	 * @throws InterruptedException 
	 */
	public String verifySentMsg() throws InterruptedException
	{
		waitAndClick(sent);
		return sentMsg.getText();
	}

}
