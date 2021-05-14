package com.Skillrary.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * This object repository is created for addtowishlist 
 * @author Keerthana C
 */
public class AddToWishList {

	public AddToWishList(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//img[@id='image-3'])[1]")
	private WebElement imgLink;
	@FindBy(xpath="//span[.='Add To Wishlist']")
	private WebElement addtowistlistLink;
    @FindBy(xpath="//span[.='Wishlisted']")
    private WebElement wishlistedLink;
    
	
	public WebElement getWishlistedLink() {
		return wishlistedLink;
	}
	public WebElement getImgLink() {
		return imgLink;
	}
	public WebElement getAddtowistlistLink() {
		return addtowistlistLink;
	}
	/*
	 * @author Keerthana C
	 *  This method will navigate to addtowishlist
	 * 
	 */

	public void addToWishList()
	{
		imgLink.click();
		addtowistlistLink.click();
	
	}
	/*
	 * @author Keerthana C
	 * This method will return text addtowishlist page
	 */

	public String wishList()
	{
		return wishlistedLink.getText();
	}
}
