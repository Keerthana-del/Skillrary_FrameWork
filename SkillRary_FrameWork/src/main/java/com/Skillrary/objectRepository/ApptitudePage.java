package com.Skillrary.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Skillrary.GenericUtils.BaseClass;

public class ApptitudePage extends BaseClass{
	WebDriver driver;
	 public ApptitudePage(WebDriver driver){
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }

	@FindBy(xpath="//a[.='CATEGORIES']")
	private WebElement categoriesLink;
	@FindBy(xpath="//a[.='Aptitude']")
	private WebElement aptitudeLink;
	@FindBy(xpath="(//img[@id='image-3'])[1]")
	private WebElement imgLink;
	@FindBy(xpath="//span[.='Add To Wishlist']")
	private WebElement addtowishlistBtn;
	@FindBy(xpath="//a[.='my course']")
	private WebElement mycourseLink;
	@FindBy(xpath="//a[.='Wishlist']")
	private WebElement wishlistLink;
	@FindBy(xpath="( //a[.=' Qspiders- Complete Aptitude Co...'])[1]")
	private WebElement textFcn;
	
	
	public WebElement getTextFcn() {
		return textFcn;
	}
	public WebElement getCategoriesLink() {
		return categoriesLink;
	}
	public WebElement getAptitudeLink() {
		return aptitudeLink;
	}
	public WebElement getImgLink() {
		return imgLink;
	}
	public WebElement getAddtowishlistBtn() {
		return addtowishlistBtn;
	}
	public WebElement getMycourseLink() {
		return mycourseLink;
	}
	public WebElement getWishlistLink() {
		return wishlistLink;
	}
	/*
	 * @author Keerthana C
	 *  This method will navigate to wishlist in my course page
	 * 
	 */
	
	public void aptitude()
	{
		categoriesLink.click();
		aptitudeLink.click();
		imgLink.click();
		addtowishlistBtn.click();
		mycourseLink.click();
		wishlistLink.click();
	}
	
	/*
	 * @author Keerthana C
	 * This method will return text wishlist in my course page
	 */
	public String textFunction()
	{
		wUtil.scrollToWebElement(driver, textFcn);

		return textFcn.getText();
	}
}
