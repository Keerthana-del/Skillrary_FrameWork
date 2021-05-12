package com.skillrary.test;

import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.AddToWishList;
import com.Skillrary.objectRepository.CoursePage;

import junit.framework.Assert;
/*
 * This class is used to navigate to wishlist and check whether the product is added or not
 * @author Keerthana C
 */
public class AddToWishListTest extends BaseClass {
	@Test
	public void addToWishListTest() throws Throwable {	
		
		//Fetching data from Excel sheet
		String expectedresult=eUtil.getExcelData("smoke",11 , 2);
		
		//Navigate to computerscience page
				CoursePage coursepage=new CoursePage(driver);
				coursepage.coursePage();
				
		//click on addtowishlist	
				AddToWishList addtowishlist= new AddToWishList(driver);
				addtowishlist.addToWishList();
				
		//Verifiction
				String actual = addtowishlist.wishList();
				Assert.assertEquals(expectedresult, actual);
	}

}
