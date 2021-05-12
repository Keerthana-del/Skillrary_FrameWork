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


	public WebElement getImgLink() {
		return imgLink;
	}
	public WebElement getAddtowistlistLink() {
		return addtowistlistLink;
	}

	public void addToWishList()
	{
		imgLink.click();
		addtowistlistLink.click();
	}

	public String wishList()
	{
		return addtowistlistLink.getText();
	}

}
