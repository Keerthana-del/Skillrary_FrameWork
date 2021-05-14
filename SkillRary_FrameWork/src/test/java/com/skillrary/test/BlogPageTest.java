package com.skillrary.test;

import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.BlogPage;

import junit.framework.Assert;

/**
 * Test Script to verify user is able to navigate to 
 * @author SOUMYASANTA SAHOO
 *
 */
public class BlogPageTest extends BaseClass {
	
	@Test
	public void blogPageTest() throws Throwable
	{
		//Fetching data from Excel sheet
		String expectedHeader=eUtil.getExcelData("Smoke", 17, 2);
		
		//Handling blog Page
		BlogPage blogpage=new BlogPage(driver);
		String actualHeader=blogpage.verifyBlogPage();
		
		//Verification
		Assert.assertEquals(expectedHeader, actualHeader);
	}

}
