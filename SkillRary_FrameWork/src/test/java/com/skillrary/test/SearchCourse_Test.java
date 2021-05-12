package com.skillrary.test;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.HomePage;

/**
 * This class contains method to Search a course in Home page
 * @author SOUMYASANTA SAHOO
 *
 */
public class SearchCourse_Test extends BaseClass{
	
	/**
	 * This method is used to search a course in Home Page
	 * @author SOUMYASANTA SAHOO
	 */
	@Test
	public void searchCourse()
	{
		HomePage homepage=new HomePage(driver);
		String text="Java";
		String text1=homepage.searchCourse(text);
		Assert.assertTrue(text1.contains(text));
	}

}
