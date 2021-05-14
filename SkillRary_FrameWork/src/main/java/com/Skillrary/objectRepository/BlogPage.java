package com.Skillrary.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Skillrary.GenericUtils.WebDriverUtility;

/**
 * POM Class to handle Blog Page
 * @author SOUMYASANTA SAHOO
 *
 */
public class BlogPage extends WebDriverUtility {
	
	WebDriver driver;
	public BlogPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//a[text()='Recent Posts']")
	private WebElement recentPost;

	@FindBy(xpath="//h3[text()=' Blog']")
	private WebElement blog;

	/**
	 * Getter Methods
	 * @author SOUMYASANTA SAHOO
	 * @return
	 */
	public WebElement getRecentPost() {
		return recentPost;
	}

	public WebElement getBlog() {
		return blog;
	}
	
	/**
	 * Buisness logic to verify Blog page is Navigable or not
	 * @author SOUMYASANTA SAHOO
	 * @return
	 */
	public String verifyBlogPage()
	{
		recentPost.click();
		switchToWindow(driver,"blogs");
		return blog.getText();
	}
}
