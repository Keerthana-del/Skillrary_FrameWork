package com.Skillrary.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is the object repository for my courses page
 * @author Adarsh
 *
 */

public class MyCoursesPage {
	WebDriver driver;
	public MyCoursesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	 
	@FindBy(linkText=" Course ")
	private WebElement courseLink;
	
	@FindBy(linkText="Assessment")
	private WebElement assessmentLink;
	
	@FindBy(linkText=" Learning")
	private WebElement learningLink;
	
	@FindBy(linkText="Wishlist")
	private WebElement wishlistLink;
	
	@FindBy(linkText=" Assigned Course ")
	private WebElement assignedCourseLink;
	
	@FindBy(id="search_question")
	private WebElement searchBar;
	
	@FindBy(id="search")
	private WebElement searchIcon;
	
	@FindBy(linkText=" ALL ")
	private WebElement allLink;
	
	@FindBy(linkText=" Public ")
	private WebElement publicLink;
	
	@FindBy(linkText=" Private ")
	private WebElement privateLink;
	
	@FindBy(id="more")
	private WebElement LoadMoreLink;
	
	@FindBy(id="all")
	private WebElement loadAllLink;
	
	


	//getters methods
	
	public WebElement getCourseLink() {
		return courseLink;
	}

	public WebElement getSearchIcon() {
		return searchIcon;
	}

	public WebElement getAssessmentLink() {
		return assessmentLink;
	}

	public WebElement getLearningLink() {
		return learningLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getAssignedCourseLink() {
		return assignedCourseLink;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}


	public WebElement getAllLink() {
		return allLink;
	}

	public WebElement getPublicLink() {
		return publicLink;
	}

	public WebElement getPrivateLink() {
		return privateLink;
	}

	public WebElement getLoadMoreLink() {
		return LoadMoreLink;
	}

	public WebElement getLoadAllLink() {
		return loadAllLink;
	}
	// business methods
	/**
	 * This method will search the course in mycourse page
	 * @author Adarsh
	 * @param coursename
	 */
	public String searchCourse(String coursename) {
		searchBar.sendKeys(coursename);
		searchIcon.click();	
		String xpathExpression="//div[@id='AllLearningCourse']/descendant::a[contains(text(),'"+coursename+"')]";
	    return driver.findElement(By.xpath(xpathExpression)).getText();
	}
	/**
	 * this method will click the course based on the input course
	 * @param coursename
	 */
	public void viewCourse(String coursename) {
		loadAllLink.click();
		String coursePath="//div[@id='AllLearningCourse']/descendant::a[contains(text(),'"+coursename+"')]";
		driver.findElement(By.xpath(coursePath)).click();
	}
	/**
	 * @author Adarsh
	 * this method will view the wishlist course
	 */
	public void wishListView() {
		wishlistLink.click();
		
	}

}
