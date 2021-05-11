package com.Skillrary.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * POM Class for handling Message section
 * @author SOUMYASANTA SAHOO
 *
 */
public class Message {
	
	@FindBy(xpath="//b[@class='caret']")
	private WebElement profiledropdown;
	
	@FindBy(linkText=" messages ")
	private WebElement msg;
	
	@FindBy(xpath="//a[@id='composeMessage']")
	private WebElement compose;
	
	@FindBy(xpath="//input[@class='form-control parsley-validated']")
	private WebElement subject;
	
	@FindBy(id="tinymce")
	private WebElement message;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-sm sendbtn']")
	private WebElement sendMsg;
	
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

	public WebElement getProfiledropdown() {
		return profiledropdown;
	}

	public WebElement getMsg() {
		return msg;
	}

	public WebElement getCompose() {
		return compose;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getSendMsg() {
		return sendMsg;
	}
	
	/**
	 * Business logic to compose a Message
	 */
	public void composeMessage()
	{
		profiledropdown.click();
		msg.click();
		compose.click();
		subject.sendKeys(null);
		message.sendKeys(null);
		sendMsg.click();
	}
	
	/**
	 * Business logic to verify composed message
	 * @return
	 */
	public String verifySentMsg()
	{
		sent.click();
		return sentMsg.getText();
	}

}
