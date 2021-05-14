package com.Skillrary.objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Skillrary.GenericUtils.WebDriverUtility;

/**
 * POM Class for Home Page
 * @author SOUMYASANTA SAHOO
 *
 */
public class HomePage extends WebDriverUtility {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//img[@src='https://www.skillrary.com/uploads/images/f-sr-logo-195-50.png']")
	private WebElement logo;
	
	@FindBy(xpath="//a[@class='dropdown-toggle']/../../..//input[@placeholder='Search for Courses']")
	private WebElement search;
	
	@FindBy(xpath="//a[@class='dropdown-toggle']/../../..//input[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath="//a[text()=' Core Java']")
	private WebElement searchedCourse;
	
	@FindBy(linkText=" Ask a Question ")
	private WebElement question;

	@FindBy(linkText="courses")
	private WebElement courses;
	
	@FindBy(xpath="//a[text()='my course']")
	private WebElement mycourses;
	
	@FindBy(xpath="//b[@class='caret']")
	private WebElement profiledropdown;
	
	@FindBy(linkText=" messages ")
	private WebElement msg;
	
	@FindBy(xpath="//a[text()='API Testing (Basics to Advance)']")
	private WebElement specificCourse;
	
	@FindBy(xpath="//button[text()=' TAKE THIS COURSE ']")
	private WebElement enrol;
	
	@FindBy(xpath="//a[text()=' Logout']")
	private WebElement logoutLink;
	
	@FindBy(xpath="//a[text()=' SERVICES ']")
	private WebElement servicesLink;
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsLink;
	
	@FindBy(xpath="//a[text()=' SERVICES ']/ancestor::li[@class='dropdown open']/child::ul//a")
	private List<WebElement> servicesDropDownLinks;
	
	@FindAll ({@FindBy(linkText="TALK TO OUR EXPERTS"),@FindBy(xpath="//a[text()='TALK TO OUR EXPERTS']")})
	private WebElement talkToExpertsLink;
	
	/**
	 * Getter Methods
	 * @author SOUMYASANTA SAHOO
	 * @return
	 */
	
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getServicesLink() {
		return servicesLink;
	}

	public WebElement getGearsLink() {
		return gearsLink;
	}

	public WebElement getTalkToExpertsLink() {
		return talkToExpertsLink;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getSearch() {
		return search;
	}
	
	public WebElement getSubmit() {
		return submit;
	}
	
	public WebElement getSearchedCourse() {
		return searchedCourse;
	}

	public WebElement getQuestion() {
		return question;
	}

	public WebElement getCourses() {
		return courses;
	}

	public WebElement getMycourses() {
		return mycourses;
	}

	public WebElement getProfiledropdown() {
		return profiledropdown;
	}

	public WebElement getMsg() {
		return msg;
	}

	public WebElement getSpecificCourse() {
		return specificCourse;
	}

	public WebElement getEnrol() {
		return enrol;
	}

	/**
	 * Business logic to handle Home Page
	 * @author SOUMYASANTA SAHOO
	 */
	public void clickOnLogo()
	{
		logo.click();
	}
	
	public String searchCourse(String text)
	{
		search.sendKeys(text);
		submit.click();
		return searchedCourse.getText();
	}
	
	public void clickOnAskQuestion()
	{
		question.click();
	}
	
	public void clickOnCourses()
	{
		courses.click();
	}
	
	public void clickOnMyCourses()
	{
		mycourses.click();
	}
	
	public void clickOnMessages()
	{
		profiledropdown.click();
		msg.click();
	}
	
	public String enrollForCourse()
	{
		specificCourse.click();
		return enrol.getText();
	}
	
	/**
	 * this method will perform logout operation
	 * @author Adarsh
	 */
	public void logout() {
		profiledropdown.click();
		logoutLink.click();
		
	}
	/**
	 * method will navigate to instructor list page
	 * @author Adarsh
	 * @throws Throwable 
	 */
	public void talkToExpert() throws Throwable {
		logo.click();
		waitAndClick(talkToExpertsLink);	
		
	}
	/**
	 * method will fetch all services and it will naviagte
	 * @author Adarsh
	 * @param serviceName
	 */
	public void navToServices(String serviceName) {
		servicesLink.click();
		List<WebElement> list = driver.findElements(By.xpath("//a[text()=' SERVICES ']/ancestor::li[@class='dropdown open']/child::ul//a"));
		for(WebElement ele:list) {
			if(ele.getText().equalsIgnoreCase(serviceName)){
				ele.click();
				break;
			}
		}
	}  
	public String switchToServices(String partialWinTitle,String parentwinTitle) {
		switchToWindow(driver, partialWinTitle);
		String title=driver.getTitle();
		driver.close();
		switchToWindow(driver, parentwinTitle);
		return title;
		
	}
	

}
